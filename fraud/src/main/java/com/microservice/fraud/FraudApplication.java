package com.microservice.fraud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(
        scanBasePackages = {
                "com.microservice.fraud"}
)
@EnableEurekaClient
public class FraudApplication {
    public static void main(String[] args){
        SpringApplication.run(FraudApplication.class,args);
    }
}
