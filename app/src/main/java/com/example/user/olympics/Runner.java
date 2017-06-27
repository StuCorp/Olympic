package com.example.user.olympics;

/**
 * Created by stuartbryce on 2017-06-27.
 */

public class Runner {

    public static void main(String[] args) {


        FileLogger fileLogger = new FileLogger();
        Log log = new Log(fileLogger);
        Boxer boxer = new Boxer(log, 30, 10);

        boxer.goRun(25);
        boxer.goRun(55);
        boxer.goRun(25);
        boxer.goRun(75);
        log.saveAsRunsArray();


    }

}

