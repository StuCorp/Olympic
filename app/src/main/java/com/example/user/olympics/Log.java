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
    private ArrayList<Integer> runs;

    public Log(Loggable logger) {
        this.runs = new ArrayList<>();
        this.logger = logger;
    }

    public void addRun(int distance) {
        runs.add(distance);
    }

    public Integer getLastSession() {
        return runs.get(runs.size() - 1);
    }

    public Integer getAllSessionsTotal() {
        int total = 0;
        for (Integer run : runs) {
            total += run;
        }
        return total;
    }

    public ArrayList<Integer> getArrayOfSessions(){
        return runs;
    }

    public void saveCurrentSession() {
        try {
            logger.saveSession(getLastSession());
        } catch (IOException ex) {
            System.out.println("save failed");
            System.exit(0);
        }
    }

    public void saveSessionsTotal() {
        try {
            logger.saveAllSessions(getAllSessionsTotal());
        } catch (IOException ex) {
            System.out.println("total save failed");
            System.exit(0);
        }
    }

    public void saveAsRunsArray(){
            logger.saveAsArray(getArrayOfSessions());
        }
    }
