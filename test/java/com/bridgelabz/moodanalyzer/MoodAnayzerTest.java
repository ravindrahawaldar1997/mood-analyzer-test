package com.bridgelabz.moodanalyzer;
import org.junit.Assert;
import org.junit.Test;
public class MoodAnayzerTest {
    @Test
    public void testMoodAnalysis_whenMoodIsSad() { //TC 1.1 "I am in sad mood"
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("I am in sad mood");
        Assert.assertEquals(mood, "SAD");
    }
    @Test
    public void testMoodAnalysis_whenMoodIsHappy() { //TC 1.2 I am in happy mood
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood1 = moodAnalyzer.analyseMood("I am in happy mood");
        Assert.assertEquals(mood1, "HAPPY");
    }
    @Test
    public void testMoodAnalysis_whenMoodIsNull() { //tc 2.1
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood2 = moodAnalyzer.analyseMood();
        Assert.assertEquals(mood2,"HAPPY");
    }
}
