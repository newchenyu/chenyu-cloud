package com.chenyu.cloud.cloudapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@MapperScan("com.chenyu.cloud.cloudapi.dao")
@ComponentScan(basePackages = {"com.chenyu.cloud.cloudapi.*"})
@SpringBootApplication
public class CloudapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudapiApplication.class, args);
    }

}
