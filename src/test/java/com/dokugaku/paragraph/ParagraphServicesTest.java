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
        Paragraph paragraphToBeCreated = new Paragraph();
        Paragraph paragraphCreated = paragraphServices.save(paragraphToBeCreated);
        assertNotNull(paragraphCreated.getId());
    }
}