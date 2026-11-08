package com.lms.visitor.model;

import com.lms.visitor.visitor.ElementVisitor;

// Concrete Element 2
public class Assignment implements CourseElement {
    private final String title;
    private final int maxScore;
    private final int attachedFilesCount;

    public Assignment(String title, int maxScore, int attachedFilesCount) {
        this.title = title;
        this.maxScore = maxScore;
        this.attachedFilesCount = attachedFilesCount;
    }

    @Override
    public void accept(ElementVisitor visitor) {
        // Double Dispatch қадамы
        visitor.visitAssignment(this);
    }

    public String getTitle() { return title; }
    public int getMaxScore() { return maxScore; }
    public int getAttachedFilesCount() { return attachedFilesCount; }
}