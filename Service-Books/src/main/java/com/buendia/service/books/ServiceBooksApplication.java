package com.buendia.service.books;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.buendia.service.books.mapper")
public class ServiceBooksApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceBooksApplication.class,args);
    }

}
