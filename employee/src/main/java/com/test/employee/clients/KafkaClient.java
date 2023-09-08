package com.test.employee.clients;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaClient {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    private  static String TOPIC="responses";

    public void publishMsg(String message){
        kafkaTemplate.send(TOPIC,message);
    }
}
