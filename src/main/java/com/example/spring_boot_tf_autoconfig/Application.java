package com.example.spring_boot_tf_autoconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    static void main(String[] args) {
        SpringApplication.run(Application.class);
        IO.readln();
    }

}
