package com.zaggle.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommonApplication {

    public static void main(String[] args) {
        System.out.println("HI");
        SpringApplication.run(CommonApplication.class, args);
    }

}
