package com.alfser.employeeapi.services;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.alfser.employeeapi.dto.UserDTO;
import com.alfser.employeeapi.utils.BrokerMQConstraints;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class EmployeeMQConsumer {
    private final ObjectMapper objectMapper;

    @RabbitListener(queues = BrokerMQConstraints.EMPLOYEE_QUEUE)
    public void processMessage(String content) {
        System.out.println("MESSAGE: "+content);
    }

    @RabbitListener(queues = BrokerMQConstraints.BADGE_QUEUE)
    public void processEmployee(String json) throws JsonMappingException, JsonProcessingException {
        UserDTO dto = objectMapper.readValue(json, UserDTO.class);
        System.out.println("MESSAGE: "+json);
        System.out.println("MESSAGE OBJECT: "+dto.toString());
    }
}
