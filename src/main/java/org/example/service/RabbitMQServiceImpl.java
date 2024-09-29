package org.example.service;

import com.rabbitmq.client.Channel;
import org.example.Utils.RabbitMqUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author hp
 * @date 2024/9/29
 * @Description
 */
@Service
public class RabbitMQServiceImpl implements RabbitMQService {
    @Override
    public void sendMessage(String message)  {
        String QUEUE_NAME="hello";
        // 创建一个channel
        Channel channel = null;
        try {
            channel = RabbitMqUtils.getChannel();
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
            System.out.println("消息发送完毕");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void sendMessage(String queue, String message) {

    }
}
