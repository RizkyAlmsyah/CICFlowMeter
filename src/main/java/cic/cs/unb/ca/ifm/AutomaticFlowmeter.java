package cic.cs.unb.ca.ifm;

import cic.cs.unb.ca.flow.FlowMonitor;
import cic.cs.unb.ca.guava.GuavaMgr;
import com.google.common.eventbus.Subscribe;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author ryuka
 */
public class AutomaticFlowmeter {
    public static final Logger logger = LoggerFactory.getLogger(AutomaticFlowmeter.class);
    
	private static final long serialVersionUID = 7419600803861028585L;

	private FlowMonitor monitor;
	
	
	public AutomaticFlowmeter(String netint, String mqtt_host, String mqtt_port, String topic) {
            logger.info("Starting Proccess....");
            monitor = new FlowMonitor(netint, mqtt_host, mqtt_port, topic);
            
            GuavaMgr.getInstance().getEventBus().register(this);
            startListening();
	}
        
        public void startListening() {
            Timer t = new Timer(0, null);

            t.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                      //do something
                      monitor.startTrafficFlow();
                      
                }
            });

            t.setRepeats(true);
//            t.setDelay(1000); //1 sec
            t.setDelay(500);
            t.start(); 
        }
	
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        GuavaMgr.getInstance().getEventBus().unregister(this);
    }
}
