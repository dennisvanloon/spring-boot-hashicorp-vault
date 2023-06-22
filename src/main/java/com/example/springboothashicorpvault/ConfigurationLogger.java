package com.example.springboothashicorpvault;

import org.springframework.stereotype.Component;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.Executors.newScheduledThreadPool;
import static java.util.concurrent.TimeUnit.SECONDS;

@Component
public class ConfigurationLogger {

    private final MyConfiguration configuration;

    public ConfigurationLogger(MyConfiguration configuration) {
        this.configuration = configuration;

        ScheduledExecutorService scheduledExecutorService = newScheduledThreadPool(1);
        scheduledExecutorService.scheduleAtFixedRate(this::logconfig, 10, 30, SECONDS);
    }

    private void logconfig() {
        System.out.println("----------------------------------------");
        System.out.println("Configuration properties");
        System.out.println("		example.username is " + configuration.getUsername());
        System.out.println("		example.password is " + configuration.getPassword());
        System.out.println("----------------------------------------");
    }
}
