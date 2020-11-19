package com.in28minutes.microservices.limitsservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
@Data
public class Configuration {

    private int maximum;
    private int minimum;
}
