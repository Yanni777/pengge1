package org.example.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {
//redis订阅
    @Bean
    public RedisMessageListenerContainer redisContainer(RedisConnectionFactory connectionFactory,
                                                       MessageListenerAdapter listenerAdapter) {
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        container.addMessageListener(listenerAdapter, new ChannelTopic("myTopic")); // 订阅主题
        return container;
    }

    @Bean
    public MessageListenerAdapter listenerAdapter(MessageSubscriber subscriber) {
        return new MessageListenerAdapter(subscriber);
    }

//    区分不同类型的redisTemplate
    @Bean
    public RedisTemplate<String, Object> redisTemplateObject(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory);
        // 设置key的序列化器
        template.setKeySerializer(new StringRedisSerializer());
        // 设置value的序列化器
        template.setValueSerializer(new GenericJackson2JsonRedisSerializer());

        // 设置hash key和value的序列化器
        template.setHashKeySerializer(new StringRedisSerializer());
        template.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());
        template.afterPropertiesSet();
        return template;
    }

    @Bean
    public RedisTemplate<String, String> redisTemplateString(RedisConnectionFactory connectionFactory) {
        RedisTemplate<String, String> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory);
        // 设置key的序列化器
        template.setKeySerializer(new StringRedisSerializer());
        // 设置value的序列化器
        template.setValueSerializer(new GenericJackson2JsonRedisSerializer());

        // 设置hash key和value的序列化器
        template.setHashKeySerializer(new StringRedisSerializer());
        template.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());
        template.afterPropertiesSet();
        return template;
    }
}
