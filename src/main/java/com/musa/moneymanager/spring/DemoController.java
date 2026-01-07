package com.musa.moneymanager.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private Coach coach;

    public DemoController(){
    }

    public DemoController(Coach coach){
        this.coach = coach;
    }

    @GetMapping("/getworkout")
    public String getWorkOut(){
        return coach.getWorkout();
    }
}
