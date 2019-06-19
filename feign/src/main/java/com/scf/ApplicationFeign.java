package com.scf;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class ApplicationFeign {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationFeign.class, args);
    }

}