package org;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer() {
        this.message = "I am in any mood";
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        if (message == null) {
            throw new MoodAnalysisException(MoodAnalysisError.NULL_MOOD);
        } else if (message.isEmpty()) {
            throw new MoodAnalysisException(MoodAnalysisError.EMPTY_MOOD);
        } else if (message.toLowerCase().contains("sad")) {
            return "sad";
        }
        return "happy";
    }
}
