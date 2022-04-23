package com.dokugaku.paragraph;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
@Entity
@NoArgsConstructor
public class Paragraph {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "paragraph_sequence")
    @SequenceGenerator(name = "paragraph_sequence", sequenceName = "paragraph_sequence")
    private Long id;
    private String title;
    @Lob
    private String text;

    public Paragraph(String title, String text) {
        this.title = title;
        this.text = text;
    }
}
