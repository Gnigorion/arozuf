package com.input;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import com.fuzora.workflow.WorkflowExecutor;

@SpringBootApplication
@ComponentScan(basePackages = {"com.input","com.fuzora"})
public class CustomApplication {
	public static void main(String[] args) {
		SpringApplication.run(CustomApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	@Bean
    public CommandLineRunner run(ApplicationContext context) {
        return args -> {
            // The workflow execution is handled by WorkflowExecutor internally
            WorkflowExecutor workflowExecutor = context.getBean(WorkflowExecutor.class);
            workflowExecutor.executeWorkflow();
        };
    }
}
