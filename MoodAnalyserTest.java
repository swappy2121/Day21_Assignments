package com.Bridgelabz;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyserTest {
    MoodAnalyser mood = new MoodAnalyser("I am in Sad Mood");

    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        String actual = mood.analyseMood();
        assertEquals("SAD",actual);
    }
}
