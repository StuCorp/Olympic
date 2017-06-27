package com.example.user.olympics;

import java.io.IOException;
import java.util.ArrayList;

import behaviours.Loggable;

/**
 * Created by stuartbryce on 2017-06-27.
 */

public class ConsoleLogger implements Loggable {


    public void logSession(Integer lastSession) throws IOException {
        System.out.println(String.format("I just ran %d", lastSession));
    }

    public void logAllSessions(Integer allSessionsTotal) throws IOException{
        System.out.println(String.format("My total runs are something in the order of %d", allSessionsTotal));

    }

    public void logAsArray(ArrayList<Integer> runs) {
        System.out.println(String.format("Stand by for run log..."));
        int runNum = 1;
        for (Integer run : runs) {
            System.out.println(String.format("%d) %dkm", runNum, run));
        }
    }
}
