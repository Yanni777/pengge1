package org.example.redis;

import jakarta.annotation.Resource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessagePublisher {
    
    @Resource(name = "redisTemplateString")
    private RedisTemplate<String, String> redisTemplate;

    public void publish(String message) {
        redisTemplate.convertAndSend("myTopic", message); // 发布消息到主题
    }
}
