package com.hexaware.employee.config;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {
    @Scheduled(cron = "* * * * * ?")
    public void scheduledTask(){
        System.out.println("Scheduling task");
    }
}