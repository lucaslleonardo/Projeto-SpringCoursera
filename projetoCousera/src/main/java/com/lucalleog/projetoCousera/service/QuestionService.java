package com.lucalleog.projetoCousera.service;
import com.lucalleog.projetoCousera.Dto.QuestionDto;
import com.lucalleog.projetoCousera.database.model.Question;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Service
public class QuestionService {

    private HashMap<Integer, Question > questions = new  HashMap<>();

    public List<Question> loadQuizzes() {
        return new ArrayList<>(questions.values());
    }

    public void addQuestion(QuestionDto questionDto) {
        Question question = Question.builder()
                .id(questionDto.getId())
                .questionText(questionDto.getQuestionText())
                .options(questionDto.getOptions())
                .correctAnswer(questionDto.getCorrectAnswer())
                .build();

        questions.put(question.getId(), question);
    }

    public void editQuestion(QuestionDto questionDto) {
        Question question = Question.builder()
                .id(questionDto.getId())
                .questionText(questionDto.getQuestionText())
                .options(questionDto.getOptions())
                .correctAnswer(questionDto.getCorrectAnswer())
                .build();

        questions.put(question.getId(), question);

    }

    public void deleteQuestion(Integer id) {
        questions.remove(id);
    }

}
