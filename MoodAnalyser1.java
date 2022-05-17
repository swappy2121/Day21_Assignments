package com.Bridgelabz;

public class MoodAnalyser1 {

    public static String analyseMood(String message) {
        String messageOne = "I am in Sad Mood";
        String messageTwo = "I am in any Mood";
        if (message.equalsIgnoreCase(messageOne))
            return "SAD";
        else if (message.equalsIgnoreCase(messageTwo))
            return "HAPPY";
        else
            return "No Match";
    }
}