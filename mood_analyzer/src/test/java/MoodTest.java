import static org.junit.jupiter.api.Assertions.assertEquals;
import org.*;
import org.junit.jupiter.api.Test;

public class MoodTest {
    @Test
    public void testSadMood() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad mood");
        String mood = moodAnalyzer.analyseMood();
        assertEquals("sad", mood);
    }

    @Test
    public void testAnyMood() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any mood");
        String mood = moodAnalyzer.analyseMood();
        assertEquals("happy", mood);
    }

    @Test
    public void testMoodWithoutParams() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood();
        assertEquals("happy", mood);
    }

    @Test
    public void testNullMoodException() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try {
            moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            assertEquals(MoodAnalysisError.NULL_MOOD, e.getError());
        }
    }

    @Test
    public void testEmptyMoodException() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
        try {
            moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            assertEquals(MoodAnalysisError.EMPTY_MOOD, e.getError());
        }
    }

}
