package com.dokugaku.paragraph;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
@Entity
public class Paragraph {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "paragraph_sequence")
    @SequenceGenerator(name = "paragraph_sequence", sequenceName = "paragraph_sequence")
    private Long id;
    private String title;
    private String text;
}
