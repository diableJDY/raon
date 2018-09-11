package com.raon.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class RaonApplication {

    public static void main(String[] args) {
        SpringApplication.run(RaonApplication.class, args);
    }
}
