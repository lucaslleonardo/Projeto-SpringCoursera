package com.lucalleog.projetoCousera.controller;

import com.lucalleog.projetoCousera.Dto.QuestionDto;
import com.lucalleog.projetoCousera.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@Controller
@RequestMapping("/v1/Question")
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping("/adicionarQuiz")
    public String adicionarQuiz(){
        return "adicionarQuiz";
    }

    @PostMapping("/adicionarQuiz")
    @ResponseStatus(HttpStatus.CREATED)
    public String adicionarQuizz(@ModelAttribute QuestionDto questionDto){
        questionService.addQuestion(questionDto);
        return "redirect:/v1/Question/admin/recuperarQuizz";
    }

    @GetMapping("/editQuiz")
    public String editQuiz(){
        return "editQuiz";
    }

    @PutMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String editQuiz(@ModelAttribute QuestionDto questionDto){
        questionService.editQuestion(questionDto);
        return "redirect:/v1/Question/admin/recuperarQuizz";
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteQuiz(@PathVariable Integer id ){
        questionService.deleteQuestion(id);
    }

    @GetMapping("/admin/recuperarQuizz")
    public String recuperarQuizz(Model model){
        model.addAttribute("questions", questionService.loadQuizzes());
        return "quizList";
    }

    @PostMapping("/responder")
    @ResponseStatus(HttpStatus.CREATED)
    public String enviarRespostas(@RequestParam HashMap<Integer, String> respostas){
        return "redirect:/v1/Question/resultados";
    }

    @GetMapping("/resultados")
    public String resultados(){
        return "resultados";
    }

}
