package com.test.employee.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.employee.clients.KafkaClient;
import com.test.employee.models.EmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeImpl implements EmployeeService {

    @Autowired
    private KafkaClient kafkaClient;


    @Override
    public void publishEmployee(EmployeeDetails employeeDetails) {
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            String msg = objectMapper.writeValueAsString(employeeDetails);
            kafkaClient.publishMsg(msg);
            System.out.println("message published");
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }
    }
}
