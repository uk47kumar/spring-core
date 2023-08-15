package com.example.springdemo.rest;

import com.example.springdemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;

    // define a constructor for the dependency injection
    @Autowired
    public DemoController(@Qualifier("tennisCoach") Coach theCoach){
        System.out.println("In Constructor: "+ getClass().getSimpleName());
        myCoach = theCoach;
    }

    // define a method for the setter injection give any method name for the setter injection
//    @Autowired
//    public void setCoach(Coach theCoach) {
//        myCoach = theCoach;
//    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout() {
        // call to the interface using reference of Coach
        return myCoach.getDailyWorkout();
    }

}
