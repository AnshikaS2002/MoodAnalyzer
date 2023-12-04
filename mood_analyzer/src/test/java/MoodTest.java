import static org.junit.jupiter.api.Assertions.assertEquals;
import org.*;
import org.junit.jupiter.api.Test;

public class MoodTest {
    @Test
    public void testSadMood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("I am in Sad mood");
        assertEquals("sad", mood);
    }

    @Test
    public void testAnyMood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("I am in any mood");
        assertEquals("happy", mood);
    }
}
