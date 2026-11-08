package com.lms.visitor.structure;

import com.lms.visitor.model.CourseElement;
import com.lms.visitor.visitor.ElementVisitor;

import java.util.ArrayList;
import java.util.List;

// Object Structure: Курс элементтерінің жиынтығын басқарады
public class Course {
    private final List<CourseElement> elements = new ArrayList<>();

    public void addElement(CourseElement element) {
        elements.add(element);
    }

    public void accept(ElementVisitor visitor) {
        for (CourseElement element : elements) {
            element.accept(visitor);
        }
    }
}