package org.example.controller;

import org.example.kafka.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author hp
 * @date 2024/10/8
 * @Description
 */
@RestController
@RequestMapping("/kafka")
public class KafkaController {
    @Autowired
    private MessageProducer producer;
    @PostMapping("/send/{topic}")
    public void send(@PathVariable String topic, @RequestBody String message) {
        producer.sendMessage(topic, message);
    }

}
