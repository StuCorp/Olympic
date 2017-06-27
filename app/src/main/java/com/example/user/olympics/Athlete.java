package com.example.user.olympics;

/**
 * Created by user on 27/06/2017.
 */

public abstract class Athlete {

    Log log;

    public Athlete(Log log){
        this.log = log;
    }

    public String enterEvent() {
        prepare();
        compete();
        int total = calculate();
        return Medal.medalType(total);
    }

    public void prepare() {
        System.out.println("I am preparing HARD!");
    }

    public void compete() {
        System.out.println("I am competing HARD! Grrrr");
    }

    abstract int calculate();

    public void logRun(int distance){
        log.logRun(distance);
    }

    public void logTotal() { log.logTotal();}

    public int currentSession(){
        return log.getLastSession();
    }

    public int sessionsTotal(){
        return log.getAllSessionsTotal();
    }

}
