package org.example.kafka;/**
 * @author hp
 * @date 2024/10/8
 * @Description 
 */
public interface MessageProducer {
    void sendMessage(String topic, String message);
}
