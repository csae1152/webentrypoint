package com.farmhand.webentrypoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebentrypointApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebentrypointApplication.class, args);
    }
    
    private void logStart(Logger log) {
    }
}
