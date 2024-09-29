package org.example.controller;

import org.example.service.RabbitMQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author hp
 * @date 2024/9/29
 * @Description
 */
@RestController
@RequestMapping("/rabbitmq")
public class RabbitMQController {
    @Autowired
    private RabbitMQService rabbitMQService;
    @PostMapping("/send")
    public String send(@RequestBody String message){
        rabbitMQService.sendMessage(message);
        return "成功发送消息："+message;
    }

}
