package com.example.springdemo.common;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("In Constructor: "+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Calling SwimCoach";
    }
}
