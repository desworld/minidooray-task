package com.nhnacademy.taskapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TaskapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskapiApplication.class, args);
    }

}
