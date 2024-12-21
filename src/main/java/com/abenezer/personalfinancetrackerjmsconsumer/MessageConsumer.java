package com.abenezer.personalfinancetrackerjmsconsumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @JmsListener(destination = "budget-exceeded-queue")
    public void receiveMessage(String message) {
        System.out.println("Received message form cs544StudentQueue: " + message);
    }

    @JmsListener(destination = "budget-exceeded-queue", containerFactory = "jmsListenerContainerTopicFactory")
    public void receiveMessageFromTopic(String message) {
        System.out.println("Received message form cs544StudentQueue: " + message);
    }


}