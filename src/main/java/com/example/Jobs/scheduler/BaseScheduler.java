package com.example.Jobs.scheduler;

import com.example.Jobs.model.Job;


public class BaseScheduler {


    private static BaseScheduler instance;

    protected BaseScheduler() {
    }

    public static synchronized BaseScheduler getInstance() {
        if (instance == null) {
            instance = new BaseScheduler();
        }

        return instance;
    }

    public Job get_next_Job(){
        //get by Id
        return null;
    }
}
