package com.jjzi.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientEurekaApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientEurekaApp.class,args);
    }
}
