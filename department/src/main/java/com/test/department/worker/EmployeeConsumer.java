package com.test.department.worker;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class EmployeeConsumer {

    @KafkaListener(topics = "responses", groupId = "random")
    public void consume(String msg){
        System.out.println(msg);
        System.out.println("Message consumed");
    }
}
