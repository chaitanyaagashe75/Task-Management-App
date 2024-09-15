package com.example.task.enums;

public enum TaskStatus {
    PENDING("PENDING"),
    IN_PROGRESS("IN_PROGRESS"),
    COMPLETED("COMPLETED");

    private String label;  // Field to hold the label

    // Constructor to set the label for each constant
    TaskStatus(String label) {
        this.label = label;
    }

    // Getter method to retrieve the label
    public String getLabel() {
        return label;
    }
}

