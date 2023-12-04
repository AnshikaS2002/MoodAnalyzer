import static org.junit.jupiter.api.Assertions.assertEquals;
import org.*;
import org.junit.jupiter.api.Test;

public class MoodTest {
    @Test
    public void testSadMood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad mood");
        String mood = moodAnalyzer.analyseMood();
        assertEquals("sad", mood);
    }

    @Test
    public void testAnyMood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any mood");
        String mood = moodAnalyzer.analyseMood();
        assertEquals("happy", mood);
    }

    @Test
    public void testMoodWithoutParams() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood();
        assertEquals("happy", mood);
    }

    @Test
    public void testNullMood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = moodAnalyzer.analyseMood();
        assertEquals("Happy", mood);
    }
}
