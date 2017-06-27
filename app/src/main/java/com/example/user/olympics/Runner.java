package com.example.user.olympics;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import behaviours.Loggable;

/**
 * Created by stuartbryce on 2017-06-27.
 */

public class Runner {

    public static void main(String[] args) {

//        setup
        FileLogger fileLogger = new FileLogger();
        ConsoleLogger consoleLogger = new ConsoleLogger();
        ArrayList<Loggable> loggers = new ArrayList<>(Arrays.asList(fileLogger, consoleLogger));
        Log log = new Log(loggers);
        Log log2 = new Log(consoleLogger);
        Log log3 = new Log();

        Boxer boxer = new Boxer(log, 30, 10);
        Gymnast gymnast = new Gymnast(log2, 12, 10);

//        wipe file
        try {
            fileLogger.wipe();
        }catch(IOException ex){
            System.out.println("wipe broke");
            System.exit(0);
        }

        boxer.logRun(25);
        boxer.logRun(55);
        boxer.logRun(25);
        boxer.logRun(75);
        boxer.logTotal();

//        try {
//            fileLogger.wipe();
//        }catch (IOException ex){
//            System.out.println("wipe borked");
//            System.exit(0);
//        }


    }

}

