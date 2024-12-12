package com.fuzora.protocol;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class AmqpProtocol {

//    private final RabbitTemplate rabbitTemplate;
//
//    public AmqpProtocol(RabbitTemplate rabbitTemplate) {
//        this.rabbitTemplate = rabbitTemplate;
//    }
//
//    public String receiveMessage(String queueName) {
//        return (String) rabbitTemplate.receiveAndConvert(queueName);
//    }
//
//    public void sendMessage(String queueName, String message) {
//        rabbitTemplate.convertAndSend(queueName, message);
//    }
}