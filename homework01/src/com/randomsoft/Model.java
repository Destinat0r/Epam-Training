package com.randomsoft;

public class Model {

    private String[] keywords;
    private String message = "";

    public Model(String... keywords) {
        this.keywords = keywords;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String[] getKeywords() {
        return keywords;
    }
}
