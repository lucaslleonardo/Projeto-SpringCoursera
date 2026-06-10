package com.lucalleog.projetoCousera.database.model;

import lombok.*;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Question {

    private Integer id;
    private String questionText;
    private ArrayList<String> options;
    private String correctAnswer;
}
