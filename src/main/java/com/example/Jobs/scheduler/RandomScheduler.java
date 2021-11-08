package com.example.Jobs.scheduler;

import com.example.Jobs.model.Job;

import java.util.Date;

public class RandomScheduler extends BaseScheduler{


    private static RandomScheduler instance;

    public static synchronized BaseScheduler getInstance() {
        if (instance == null) {
            instance = new RandomScheduler();
        }

        return instance;
    }

    public Job get_next_Job() {
        //get number of jobs

        //get jobs by offset and limit 1
        //update time;
        //return it;
        return null;
    }
}

