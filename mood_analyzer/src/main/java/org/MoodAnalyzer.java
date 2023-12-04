package org;

public class MoodAnalyzer {

    public String analyseMood(String message) {
        if (message.toLowerCase().contains("sad"))
            return "sad";
        return "happy";
    }
}
