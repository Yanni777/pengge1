package org.example.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private MessagePublisher messagePublisher;

    @PostMapping("/send")
    public void sendMessage(@RequestBody String message) {
        messagePublisher.publish(message); // 发送消息
    }
}
