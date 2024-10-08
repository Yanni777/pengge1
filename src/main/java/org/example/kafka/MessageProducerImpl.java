package org.example.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author hp
 * @date 2024/10/8
 * @Description kafka生产者
 */
@Service
public class MessageProducerImpl implements MessageProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public MessageProducerImpl(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    /**
     * 异步产生消息
     * @param topic
     * @param message
     */
    @Async
    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic, message);
        System.out.println("Message sent: " + message);
    }
}
