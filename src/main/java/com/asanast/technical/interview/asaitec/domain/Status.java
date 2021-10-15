package com.asanast.technical.interview.asaitec.domain;

public enum Status {

    READED("READED"),
    NOT_READED("NOT_READED");

    private String status;

    private Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
