package com.score.score.model;

public class QueryUnderstandingFeatures {
    public String source;
    public String[] annotations;

    public QueryUnderstandingFeatures() {
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String[] getAnnotations() {
        return annotations;
    }

    public void setAnnotations(String[] annotations) {
        this.annotations = annotations;
    }
}
