package com.musa.moneymanager.spring;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getWorkout() {
        return "Work out for 10 minutes";
    }
}
