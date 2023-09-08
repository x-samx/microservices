package com.test.employee.worker;

import com.test.employee.models.EmployeeDetails;
import com.test.employee.service.EmployeeService;
import org.apache.kafka.clients.KafkaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Component
public class departmentConsumer {
        @Autowired
        private EmployeeService employeeService;

        @KafkaListener(topics = "requests", groupId = "random")
        public void consume(String message){
                System.out.println("Message consumed");
            EmployeeDetails employeeDetails =  new EmployeeDetails();
            employeeDetails.setName("john");
            employeeDetails.setDepartment("Physics");
            employeeService.publishEmployee(employeeDetails);
            System.out.println("Message published");
        }

}
