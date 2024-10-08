package org.example.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * kafka消费者
 */
@Service
public class MessageConsumer {

    @KafkaListener(topics = "test_topic", groupId = "your_group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }
}