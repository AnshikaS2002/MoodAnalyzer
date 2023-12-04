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
        try {
            if(message == null) {
                throw new IllegalStateException("No mood specified");
            }
            if (message.toLowerCase().contains("sad"))
                return "sad";
            return "happy";
        } catch(IllegalStateException e) {
            return "Happy";
        }
        
    }
}
