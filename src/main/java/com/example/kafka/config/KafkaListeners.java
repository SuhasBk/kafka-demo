package com.example.kafka.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics="kafka-test", groupId = "group1")
    void listener(String data) {
        System.out.println("Received data group1: " + data.substring(0, 1).toUpperCase() + data.substring(1) + "✅");
    }

    @KafkaListener(topics = "kafka-test", groupId = "group2")
    void listener2(String data) {
        System.out.println("Received data group2: " + data.toUpperCase() + "✅");
    }
}
