package com.alfser.employeeapi;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.alfser.employeeapi.utils.BrokerMQConstraints;


@SpringBootApplication
public class EmployeeApiApplication {
	static final String topicExchangeName = "";

	@Bean
	Queue queueBadge() {
		return new Queue(BrokerMQConstraints.BADGE_QUEUE, false);
	}

	@Bean
	Queue queueEmployee() {
		return new Queue(BrokerMQConstraints.EMPLOYEE_QUEUE, false);
	}

	@Bean
	TopicExchange exchange() {
		return new TopicExchange(topicExchangeName);
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApiApplication.class, args);
	}

}
