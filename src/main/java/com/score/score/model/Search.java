package com.score.score.model;

public class Search {
    public String alias;
    public String prefix;
    public String suffix;
    public Suggestion[] suggestions;
    public String suggestionTitleId;
    public String responseId;
    public Boolean shuffled;

    public Search() {
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Suggestion[] getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(Suggestion[] suggestions) {
        this.suggestions = suggestions;
    }

    public String getSuggestionTitleId() {
        return suggestionTitleId;
    }

    public void setSuggestionTitleId(String suggestionTitleId) {
        this.suggestionTitleId = suggestionTitleId;
    }

    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public Boolean getShuffled() {
        return shuffled;
    }

    public void setShuffled(Boolean shuffled) {
        this.shuffled = shuffled;
    }
}
