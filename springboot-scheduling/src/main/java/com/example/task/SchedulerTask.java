package com.example.task;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class SchedulerTask {

    private int count=0;

    @Scheduled(cron="*/6 * * * * ?")
    private void process(){
        System.out.println("[现在时间："+ new SimpleDateFormat("HH:mm:ss").format(new Date()) +"] this is task1 runing:"+(count++));
    }
}
