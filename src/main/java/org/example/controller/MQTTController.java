package org.example.controller;

import org.example.service.MQTTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mqtt")
public class MQTTController {
    @Autowired
    private MQTTService mqttService;
    @GetMapping("/send")
    public String send() {
        mqttService.sendMessage("testtopic/ok",2,"番茄炒鸡蛋");
        return "success";
    }
    @GetMapping("/sendMessage/{message}")
    public String sendMessage(@PathVariable String message) {
        mqttService.sendMessage("testtopic/1212121212",2,message);
        return "success";
    }
    @GetMapping("/subscribe")
    public String subscribe() {
//        mqttService.subscribe("myTopic/#", 1, new MqttMessageListener()); 可能是回调函数写的不对，接收不到消息
        mqttService.subscribe("myTopic/#");
        return "success";
    }
}
