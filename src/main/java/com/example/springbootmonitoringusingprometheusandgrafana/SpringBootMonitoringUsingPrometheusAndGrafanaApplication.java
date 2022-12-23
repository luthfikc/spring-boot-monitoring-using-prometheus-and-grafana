package com.example.springbootmonitoringusingprometheusandgrafana;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootMonitoringUsingPrometheusAndGrafanaApplication {

    final static Logger logger = LoggerFactory.getLogger(SpringBootMonitoringUsingPrometheusAndGrafanaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMonitoringUsingPrometheusAndGrafanaApplication.class, args);
    }

    @GetMapping("/something")
    public ResponseEntity<String> createLogs() {
        logger.warn("Just checking");
        return ResponseEntity.ok().body("All Ok");
    }
}
