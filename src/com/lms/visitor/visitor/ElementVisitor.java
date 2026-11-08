package com.lms.visitor.visitor;

import com.lms.visitor.model.Assignment;
import com.lms.visitor.model.VideoLesson;

// Visitor Interface: Әр элемент түріне бөлек visit әдісі анықталған
public interface ElementVisitor {
    void visitVideoLesson(VideoLesson video);
    void visitAssignment(Assignment assignment);
}