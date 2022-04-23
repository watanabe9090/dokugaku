package com.dokugaku.paragraph;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class ParagraphServicesTest {

    @Autowired
    private ParagraphServices paragraphServices;

    @Test
    void CreateParagraph__WhenParametersAreOk() {
        Paragraph paragraphToBeCreated = new Paragraph();
        Paragraph paragraphCreated = paragraphServices.save(paragraphToBeCreated);
        assertNotNull(paragraphCreated.getId());
    }
}