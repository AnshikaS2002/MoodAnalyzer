package org;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer() {
        this.message = "";
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.toLowerCase().contains("sad"))
            return "sad";
        return "happy";
    }
}
