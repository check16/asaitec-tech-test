package com.asanast.technical.interview.asaitec.utils;

public enum Role {

    CLIENT("CLIENT"),
    OPERATOR("OPERATOR"),
    ADMIN("ADMIN");

    private String role;

    private Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
