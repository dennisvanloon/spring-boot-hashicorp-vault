package com.example.springboothashicorpvault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MyConfiguration.class)
public class SpringBootHashicorpVaultApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHashicorpVaultApplication.class, args);
    }

}
