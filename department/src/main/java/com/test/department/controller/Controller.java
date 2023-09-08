package com.test.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class Controller {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    static final String TOPIC = "requests";
    static final String msg = "getEmployees";
    @GetMapping("/push")
    public String publish_message(){
        kafkaTemplate.send(TOPIC,msg);
        return "Message published successfully";
    }
}
