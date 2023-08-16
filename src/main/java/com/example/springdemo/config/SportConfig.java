package com.example.springdemo.config;

import com.example.springdemo.common.Coach;
import com.example.springdemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
