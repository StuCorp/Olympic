package com.example.user.olympics;

import android.os.Looper;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

import behaviours.Loggable;

/**
 * Created by user on 27/06/2017.
 */

public class Log {

    private Loggable logger;
    private ArrayList<Loggable> loggers;
    private ArrayList<Integer> runs;

    public Log(){
        this.runs = new ArrayList<>();
        loggers = new ArrayList<>();
    }

    public Log(Loggable logger){
        this.runs = new ArrayList<>();
        this.loggers = new ArrayList<>();
        loggers.add(logger);
    }

    public Log(ArrayList<Loggable> loggers) {
        this.runs = new ArrayList<>();
        this.loggers = loggers;
//        this.logger = logger;
    }

    public void setLoggers(ArrayList<Loggable> loggers) {
        this.loggers = loggers;
    }

    public void logRun(int distance) {

        runs.add(distance);
        saveCurrentSession();
    }

    public void logTotal(){
        saveSessionsTotal();
    }


    public void saveCurrentSession() {
        for (Loggable logger : loggers) {
            try {
                logger.logSession(getLastSession());
            } catch (IOException ex) {
                System.out.println("save failed");
                System.exit(0);
            }
        }
    }


    public Integer getLastSession() {
        return runs.get(runs.size() - 1);
    }

    public void saveSessionsTotal() {
        for (Loggable logger : loggers) {
            try {
                logger.logAllSessions(getAllSessionsTotal());
            } catch (IOException ex) {
                System.out.println("total save failed");
                System.exit(0);
            }
        }
    }

    public Integer getAllSessionsTotal() {
        int total = 0;
        for (Integer run : runs) {
            total += run;
        }
        return total;
    }



    public void saveAsRunsArray() {
        for (Loggable logger : loggers) {
            logger.logAsArray(getArrayOfSessions());
        }
    }

    public ArrayList<Integer> getArrayOfSessions(){
        return runs;
    }

}
