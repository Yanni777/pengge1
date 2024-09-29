package org.example.rabbitmq;

import com.rabbitmq.client.*;
import jakarta.annotation.PostConstruct;
import org.example.Utils.RabbitMqUtils;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
  	// 队列名称
    public static String QUEUE_NAME = "hello";
    @PostConstruct
    public  void init() throws Exception {

        // 创建一个channel
        Channel channel = RabbitMqUtils.getChannel();

        // 消费消息的回调
        DeliverCallback deliverCallback = (consumerTag, message) -> System.out.println("成功消费消息,内容为:" + new String(message.getBody()));
        // 取消消费的回调
        CancelCallback cancelCallback = (consumerTag) -> System.out.println("消息消费被中断");
        /**
         * 消费者消费消息
         * 1.消费的队列名称
         * 2.消费成功之后是否要自动应答(true代表自动应答,false代表手动应答)
         * 3.消费者消费消息的回调(函数式接口)
         * 4.消费者取消消费的回调(函数式接口)
         */
        channel.basicConsume(QUEUE_NAME, true, deliverCallback, cancelCallback);
    }
}