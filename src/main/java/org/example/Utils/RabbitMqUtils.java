package org.example.Utils;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class RabbitMqUtils {
    // 获得RabbitMQ连接的channel
    public static Channel getChannel() throws Exception {
        // 创建一个连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        factory.setPort(5672);
        factory.setUsername("admin");
        factory.setPassword("123456");
        //factory.setVirtualHost("testhost");

        // 创建一个connection
        Connection connection = factory.newConnection();
        // 创建一个channel
        return connection.createChannel();
    }
}