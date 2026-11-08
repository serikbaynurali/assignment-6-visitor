package com.lms.visitor.visitor;

import com.lms.visitor.model.Assignment;
import com.lms.visitor.model.VideoLesson;

// Concrete Visitor 2: Курс ішіндегі ақпараттарды PDF форматына дайындау логикасы
public class PdfExportVisitor implements ElementVisitor {
    private final StringBuilder pdfContent = new StringBuilder();

    public PdfExportVisitor() {
        pdfContent.append("=== COURSE CONTENTS REPORT ===\n\n");
    }

    @Override
    public void visitVideoLesson(VideoLesson video) {
        pdfContent.append(String.format("[VIDEO] Title: %s | Duration: %d mins | Size: %.1f MB\n",
                video.getTitle(), video.getDurationInMinutes(), video.getFileSizeInMb()));
    }

    @Override
    public void visitAssignment(Assignment assignment) {
        pdfContent.append(String.format("[ASSIGNMENT] Title: %s | Max Score: %d | Files: %d\n",
                assignment.getTitle(), assignment.getMaxScore(), assignment.getAttachedFilesCount()));
    }

    public String getFormattedPdfReport() {
        return pdfContent.toString();
    }
}