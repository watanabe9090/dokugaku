package com.dokugaku.paragraph;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ParagraphServices {

    private final ParagraphRepository repository;

    public Paragraph save(Paragraph paragraphToBeCreated) {
        Paragraph paragraphSaved = repository.save(paragraphToBeCreated);
        return paragraphSaved;
    }
}
