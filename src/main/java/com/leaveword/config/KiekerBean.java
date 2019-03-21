package com.leaveword.config;

import kieker.monitoring.probe.spring.executions.OperationExecutionMethodInvocationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KiekerBean {

    @Bean
    public OperationExecutionMethodInvocationInterceptor opEMII(){
        return new OperationExecutionMethodInvocationInterceptor();
    }
}
