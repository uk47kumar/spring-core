package com.example.springdemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("In Constructor: "+ getClass().getSimpleName());
    }

    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartupStuff: "+ getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyCleanupStuff: "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Calling TennisCoach";
    }
}
