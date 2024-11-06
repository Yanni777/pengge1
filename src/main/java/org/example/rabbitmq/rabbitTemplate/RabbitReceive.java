package org.example.rabbitmq.rabbitTemplate;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author hp
 * @date 2024/11/6
 * @Description
 */
@Component
public class RabbitReceive {
    @RabbitListener(queues = "aaa")
    public void receiveMessage(String message) {
        System.out.println("Received: " + message);
    }
}
