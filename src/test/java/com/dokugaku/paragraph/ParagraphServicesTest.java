package com.dokugaku.paragraph;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ParagraphServicesTest {

    @Autowired
    private ParagraphServices paragraphServices;

    @Test
    void CreateParagraph__WhenParametersAreOk() {
        Paragraph paragraphToBeCreated = new Paragraph("TEST--TITLE", "TEST--CONTENT");
        Paragraph paragraphCreated = paragraphServices.save(paragraphToBeCreated);
        assertNotNull(paragraphCreated.getId());
    }

    @Test
    void RetrieveParagraph__WhenIdExists() {
        Paragraph paragraphToBeCreated = new Paragraph("TEST--TITLE", "TEST--CONTENT");
        Paragraph paragraphCreated = paragraphServices.save(paragraphToBeCreated);
        Paragraph paragraphRetrieved = paragraphServices.getById(paragraphCreated.getId());
    }
}