package com.alfser.employeeapi.services;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.alfser.employeeapi.utils.BrokerMQConstraints;

@Component
public class EmployeeMQConsumer {
    
    @RabbitListener(queues = BrokerMQConstraints.EMPLOYEE_QUEUE)
    public void processMessage(String content) {
        System.out.println("MESSAGE: "+content);
    }
}
