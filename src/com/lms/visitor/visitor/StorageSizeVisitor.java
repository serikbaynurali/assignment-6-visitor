package com.lms.visitor.visitor;

import com.lms.visitor.model.Assignment;
import com.lms.visitor.model.VideoLesson;

// Concrete Visitor 1: Ресурстардың серверде алатын жалпы көлемін есептейді
public class StorageSizeVisitor implements ElementVisitor {
    private double totalStorageSizeMb = 0.0;

    @Override
    public void visitVideoLesson(VideoLesson video) {
        totalStorageSizeMb += video.getFileSizeInMb();
    }

    @Override
    public void visitAssignment(Assignment assignment) {
        // Әрбір тіркелген файл орташа есеппен 2.5 МБ орын алады делік
        totalStorageSizeMb += assignment.getAttachedFilesCount() * 2.5;
    }

    public double getTotalStorageSizeMb() {
        return totalStorageSizeMb;
    }
}