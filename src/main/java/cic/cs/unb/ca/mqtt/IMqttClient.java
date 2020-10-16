package cic.cs.unb.ca.mqtt;

import cic.cs.unb.ca.ifm.App;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author ryuka
 */
public class IMqttClient {
    public static final Logger logger = LoggerFactory.getLogger(IMqttClient.class);

    private MqttClient mqttClient;
    private MqttConnectOptions connOpts;
    private int qos = 1;
    
    public IMqttClient(String broker, String clientId) {
        MemoryPersistence persistence = new MemoryPersistence();
        try {
            this.mqttClient = new MqttClient(broker, clientId, persistence);
            this.connOpts = new MqttConnectOptions();
            connOpts.setCleanSession(true);
            logger.info("Connecting to broker: " + broker);
            this.mqttClient.connect(connOpts);
            logger.info("Connected");
        } catch (MqttException me) {
            logger.debug("reason " + me.getReasonCode());
            logger.debug("msg " + me.getMessage());
            logger.debug("loc " + me.getLocalizedMessage());
            logger.debug("cause " + me.getCause());
            logger.debug("excep " + me);
//            me.printStackTrace();
        }
    }

    public void MqttPub(String topic, String content) {
        try {
            MqttMessage message = new MqttMessage(content.getBytes());
            message.setQos(qos);
            this.mqttClient.publish(topic, message);
        } catch (MqttException me) {
            logger.debug("reason " + me.getReasonCode());
            logger.debug("msg " + me.getMessage());
            logger.debug("loc " + me.getLocalizedMessage());
            logger.debug("cause " + me.getCause());
            logger.debug("excep " + me);
//            me.printStackTrace();
        }
    }
}
