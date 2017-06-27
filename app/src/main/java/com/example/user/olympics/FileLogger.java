package com.example.user.olympics;

import behaviours.Loggable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.ArrayList;

/**
 * Created by user on 27/06/2017.
 */

public class FileLogger implements Loggable {

    int totalRuns = 1;

    public void logSession(Integer lastSession) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File("file.txt"),true));
        printWriter.println(String.format("Session %d) %d", totalRuns, lastSession));
        printWriter.close();
        totalRuns++;
    };

    public void logAllSessions(Integer allSessionsTotal) throws IOException{
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File("file.txt"),true));
        printWriter.println();
        printWriter.println(String.format("I ran %d km over %d runs", allSessionsTotal, totalRuns));
        printWriter.close();
    };

    public static void wipe() throws IOException{
            File file = new File("file.txt");
            PrintWriter printWriter = new PrintWriter("file.txt");
            printWriter.println("");
            printWriter.close();

    };


    public void logAsArray(ArrayList<Integer> runs){
        int iteration = 1;
        try {
            for (Integer run : runs) {
                PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File("file.txt"), true));
                printWriter.println(String.format("Session %d) %d", iteration, run));
                printWriter.close();
                iteration++;
            }
        } catch(IOException ex){
            System.out.println("runs array save failed");
            System.exit(0);
        }
    };

}
