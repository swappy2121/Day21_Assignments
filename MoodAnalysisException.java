package com.Bridgelabz;

public class MoodAnalysisException extends Exception{
    String msg;

    public MoodAnalysisException(String msg) {
        this.msg = msg;
    }
}
