package org.example.mqtt;

import lombok.SneakyThrows;
import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.TimerTask;
 
@Component
public class MqttMessageListener implements IMqttMessageListener {
    private static final Logger logger = LoggerFactory.getLogger(MqttMessageListener.class);
 
    @Override
    public void messageArrived(String topic, MqttMessage message) throws Exception {
        System.out.println("topic = " + topic+" message = " + message.toString());
        AsyncManager.me().execute(recordOper(topic, message));
    }
 
    public static TimerTask recordOper(String topic, MqttMessage message)
    {
        return new TimerTask()
        {
            @Override
            @SneakyThrows
            public void run()
            {
               
            }
        };
    }
}