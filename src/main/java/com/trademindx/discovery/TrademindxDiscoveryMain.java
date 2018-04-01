package com.trademindx.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TrademindxDiscoveryMain {
    public static void main(String[] args) {
        SpringApplication.run(TrademindxDiscoveryMain.class, args);
    }
}
