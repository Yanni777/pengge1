package org.example.rabbitmq.rabbitTemplate;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hp
 * @date 2024/11/6
 * @Description
 */
@RestController
public class RabbitSend {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @GetMapping("/sendrm")
    public void sendMessage(String message) {
        rabbitTemplate.convertAndSend("myExchange", "aaaK", message);
        System.out.println("Sent: " + message);
    }
}
