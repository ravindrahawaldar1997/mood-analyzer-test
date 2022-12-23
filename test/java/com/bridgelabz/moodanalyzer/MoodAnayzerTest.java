package com.bridgelabz.moodanalyzer;
import org.junit.Assert;
import org.junit.Test;
public class MoodAnayzerTest {
    @Test
    public void testMoodAnalysis_whenMoodIsSad() {//uc1 refactor
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a sad message");
        String mood;
        try {
            mood = moodAnalyzer.analyseMood();
            Assert.assertEquals("SAD" , mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
    //Analyse mood by passing the message in the constructor
    @Test
    public void testMoodAnalysis_whenMoodIsHappy() {//uc1refactor
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a happy message");
        String mood;
        try {
            mood = moodAnalyzer.analyseMood();
            Assert.assertEquals("HAPPY" , mood);
        }catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    // Custom Exception if User Provides Invalid Mood
    // Input message: null
    @Test
    public void testMoodAnalysis_whenMoodIsNull_ShouldThrowException() {//uc 3.1
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try {
            moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
        }
    }
    // Custom Exception if User Provides Invalid Mood
    //Input message: empty
    @Test
    public void testMoodAnalysis_whenMoodIsEmpty_ShouldThrowException() {//uc3.2
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
        try {
            moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            System.out.println(e);
            System.out.println(e.type);
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY , e.type);
        }
    }
}
