package org.example.service;

/**
 * @author hp
 * @date 2024/9/29
 * @Description
 */
public interface RabbitMQService {
    public void sendMessage(String message);
    public void sendMessage(String queue, String message);

}
