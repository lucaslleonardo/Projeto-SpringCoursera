package com.lucalleog.projetoCousera.Dto;
import lombok.*;
import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class QuestionDto {

    private Integer id;
    private String questionText;
    private ArrayList<String> options;
    private String correctAnswer;
    
}
