package com.lms.visitor;

import com.lms.visitor.model.Assignment;
import com.lms.visitor.model.VideoLesson;
import com.lms.visitor.structure.Course;
import com.lms.visitor.visitor.PdfExportVisitor;
import com.lms.visitor.visitor.StorageSizeVisitor;

public class Main {
    public static void main(String[] args) {
        Course sdpCourse = new Course();
        sdpCourse.addElement(new VideoLesson("Lecture 9: Visitor Pattern", 45, 250.5));
        sdpCourse.addElement(new Assignment("Assignment #6 - Visitor Implementation", 100, 3));
        sdpCourse.addElement(new VideoLesson("Lecture 10: State Pattern", 50, 280.0));

        // 1. Storage Calculation Operation
        StorageSizeVisitor storageVisitor = new StorageSizeVisitor();
        sdpCourse.accept(storageVisitor);
        System.out.printf("Total storage size required: %.2f MB\n\n", storageVisitor.getTotalStorageSizeMb());

        // 2. PDF Export Operation
        PdfExportVisitor pdfVisitor = new PdfExportVisitor();
        sdpCourse.accept(pdfVisitor);
        System.out.println(pdfVisitor.getFormattedPdfReport());
    }
}