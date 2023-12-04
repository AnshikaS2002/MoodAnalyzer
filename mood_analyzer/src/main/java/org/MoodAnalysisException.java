package org;

public class MoodAnalysisException extends Exception {
    private final MoodAnalysisError error;

    MoodAnalysisException(MoodAnalysisError error) {
        super(error.toString());
        this.error = error;
    }

    public MoodAnalysisError getError() {
        return error;
    }
}
