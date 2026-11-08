package com.lms.visitor.model;

import com.lms.visitor.visitor.ElementVisitor;

// Concrete Element 1
public class VideoLesson implements CourseElement {
    private final String title;
    private final int durationInMinutes;
    private final double fileSizeInMb;

    public VideoLesson(String title, int durationInMinutes, double fileSizeInMb) {
        this.title = title;
        this.durationInMinutes = durationInMinutes;
        this.fileSizeInMb = fileSizeInMb;
    }

    @Override
    public void accept(ElementVisitor visitor) {
        // Double Dispatch қадамы: осы ConcreteElement түрін Visitor-ға өзі береді
        visitor.visitVideoLesson(this);
    }

    public String getTitle() { return title; }
    public int getDurationInMinutes() { return durationInMinutes; }
    public double getFileSizeInMb() { return fileSizeInMb; }
}