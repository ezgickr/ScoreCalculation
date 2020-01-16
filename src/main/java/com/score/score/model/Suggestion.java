package com.score.score.model;

public class Suggestion {

    public String suggType;
    public String type;
    public String value;
    public String refTag;
    public Boolean ghost;
    public Boolean help;
    public QueryUnderstandingFeatures[] QueryUnderstandingFeatures;
    public Boolean xcatOnly;
    public Boolean fallback;
    public Boolean blackListed;
    public Boolean spellCorrected;

    public Suggestion() {
    }

    public String getSuggType() {
        return suggType;
    }

    public void setSuggType(String suggType) {
        this.suggType = suggType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRefTag() {
        return refTag;
    }

    public void setRefTag(String refTag) {
        this.refTag = refTag;
    }

    public Boolean getGhost() {
        return ghost;
    }

    public void setGhost(Boolean ghost) {
        this.ghost = ghost;
    }

    public Boolean getHelp() {
        return help;
    }

    public void setHelp(Boolean help) {
        this.help = help;
    }

    public com.score.score.model.QueryUnderstandingFeatures[] getQueryUnderstandingFeatures() {
        return QueryUnderstandingFeatures;
    }

    public void setQueryUnderstandingFeatures(com.score.score.model.QueryUnderstandingFeatures[] queryUnderstandingFeatures) {
        QueryUnderstandingFeatures = queryUnderstandingFeatures;
    }

    public Boolean getXcatOnly() {
        return xcatOnly;
    }

    public void setXcatOnly(Boolean xcatOnly) {
        this.xcatOnly = xcatOnly;
    }

    public Boolean getFallback() {
        return fallback;
    }

    public void setFallback(Boolean fallback) {
        this.fallback = fallback;
    }

    public Boolean getBlackListed() {
        return blackListed;
    }

    public void setBlackListed(Boolean blackListed) {
        this.blackListed = blackListed;
    }

    public Boolean getSpellCorrected() {
        return spellCorrected;
    }

    public void setSpellCorrected(Boolean spellCorrected) {
        this.spellCorrected = spellCorrected;
    }
}
