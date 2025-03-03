package com.example.kafka_example;

import org.apache.logging.log4j.util.Strings;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "example", groupId = "id-001")
    void listener(String data) {
        System.out.println("Received: " + data);
    }
}
