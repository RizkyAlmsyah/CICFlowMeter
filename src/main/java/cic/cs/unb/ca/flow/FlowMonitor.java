package cic.cs.unb.ca.flow;

import cic.cs.unb.ca.jnetpcap.BasicFlow;
import cic.cs.unb.ca.jnetpcap.PcapIfWrapper;
import cic.cs.unb.ca.jnetpcap.model.BasicFeature;
import cic.cs.unb.ca.jnetpcap.worker.LoadPcapInterfaceWorker;
import cic.cs.unb.ca.jnetpcap.worker.TrafficFlowWorker;
import org.jnetpcap.PcapIf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import cic.cs.unb.ca.mqtt.IMqttClient;
/**
 *
 * @author ryuka
 */
public class FlowMonitor {
    protected static final Logger logger = LoggerFactory.getLogger(FlowMonitor.class);
    
    private String topic;
    private String mqtt_host;
    private String mqtt_port;
    private String netint;

    private List<PcapIfWrapper> listModel = new ArrayList<>();

    private TrafficFlowWorker mWorker;
    
    private IMqttClient mqttClient;


    public FlowMonitor(String netint, String mqtt_host, String mqtt_port, String topic) {
        if (netint == null)
            netint = "any";
        
        this.netint = netint;
        
        if (mqtt_host != null) {
            this.mqtt_host = mqtt_host;
            
            if (mqtt_port == null)
                mqtt_port = "1883";
            this.mqtt_port = mqtt_port;
            
            if (topic == null)
                topic = "netflowmqtt";
            this.topic = topic;
            init();
        }
    }

    private void init() {
        String broker = "tcp://"+ this.mqtt_host+":"+this.mqtt_port;
        String clientId = "netflowmeter";
        mqttClient = new IMqttClient(broker, clientId);
        loadPcapIfs();
    }
    
    public void loadPcapIfs() {
        LoadPcapInterfaceWorker task = new LoadPcapInterfaceWorker();
        task.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent event) {
                if ("state".equals(event.getPropertyName())) {
                    LoadPcapInterfaceWorker task1 = (LoadPcapInterfaceWorker) event.getSource();
                    switch (task1.getState()) {
                        case STARTED:
                            break;
                        case DONE:
                            try {
                                java.util.List<PcapIf> ifs = task1.get();
                                List<PcapIfWrapper> pcapiflist = PcapIfWrapper.fromPcapIf(ifs);
                                listModel.removeAll(pcapiflist);
                                for(PcapIfWrapper pcapif :pcapiflist) {
                                    listModel.add(pcapif);
//                                    logger.info(pcapif.name());
                                }
                            } catch (InterruptedException | ExecutionException e)  {
                                logger.debug(e.getMessage());
                            }
                            break;
                    }
                }
            }
        });
        task.execute();
    }

    public void startTrafficFlow() {

        String ifName = "any";
        
        if (listModel.contains(netint)) {
            ifName = netint;
            logger.info("Using Interface: ", ifName);
        }

        if (mWorker != null && !mWorker.isCancelled()) {
            return;
        }
        
        mWorker = new TrafficFlowWorker(this.netint);
        logger.info("Listen at Interface " + this.netint);
        mWorker.addPropertyChangeListener(event -> {
            TrafficFlowWorker task = (TrafficFlowWorker) event.getSource();
            if("progress".equals(event.getPropertyName())){
                logger.debug("Listening in " + event.getSource());
            }else if (TrafficFlowWorker.PROPERTY_FLOW.equalsIgnoreCase(event.getPropertyName())) {
//                insertFlow((BasicFlow) event.getNewValue());
                jsonMqtt((BasicFlow) event.getNewValue());
            }else if ("state".equals(event.getPropertyName())) {
                switch (task.getState()) {
                    case STARTED:
                        break;
                    case DONE:
                        break;
                }
            }
        });
        mWorker.execute();
    }

    public void stopTrafficFlow() {

        if (mWorker != null) {
            mWorker.cancel(true);
        }

        String path = FlowMgr.getInstance().getAutoSaveFile();
        logger.info("path:{}", path);
    }
    
    private void jsonMqtt(BasicFlow flow) {
        if (mqttClient == null) {
            init();
        }
        BasicFeature msg = flow.dumpFlowFeatures();
        
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .serializeSpecialFloatingPointValues()
                .serializeNulls()
                .create();
        
        String jsonMsg = gson.toJson(msg);
        
        mqttClient.MqttPub(this.topic, jsonMsg);
        
//        logger.info("\nCatch Insect with ID: " + flow.getFlowId()); 
    }
}
