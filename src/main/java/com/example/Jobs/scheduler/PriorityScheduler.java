package com.example.Jobs.scheduler;

import com.example.Jobs.model.Job;

import java.util.Date;

public class PriorityScheduler extends BaseScheduler{


    private static PriorityScheduler instance;

    public static synchronized BaseScheduler getInstance() {
        if (instance == null) {
            instance = new PriorityScheduler();
        }

        return instance;
    }
    private Date watch_date=null;
    public Job get_next_Job() {

        //get min priority
        //update time double priority
        //if all times are updated after watch_date then reset prior
        //get by priority
        return null;
    }
}
