package com.example.user.olympics;

/**
 * Created by stuartbryce on 2017-06-27.
 */

public class Medal {


    public static String medalType(int total){
        String medal = "";
        if (total >= 15) {
            medal = "Gold";
        } else if (total >= 10) {
            medal = "Silver";
        } else if (total >= 5) {
            medal = "Bronze";
        } else {
            medal = "Nothing.";
        }

        return medal;
    }

}

