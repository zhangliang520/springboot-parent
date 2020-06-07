package com.example.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Scheduler2Task {
    private int count=0;

    @Scheduled(fixedRate = 6000)
    public void process() {
        System.out.println("[现在时间："+ new SimpleDateFormat("HH:mm:ss").format(new Date()) +"] this is task2 runing:"+(count++));
    }
}
