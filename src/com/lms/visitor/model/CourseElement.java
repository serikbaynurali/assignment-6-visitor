package com.lms.visitor.model;

import com.lms.visitor.visitor.ElementVisitor;

// Element Interface
public interface CourseElement {
    void accept(ElementVisitor visitor);
}