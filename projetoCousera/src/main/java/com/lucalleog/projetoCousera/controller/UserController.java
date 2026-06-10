package com.lucalleog.projetoCousera.controller;

import com.lucalleog.projetoCousera.Dto.UserDto;
import com.lucalleog.projetoCousera.service.QuizUserDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final QuizUserDetailsService quizUserDetailsService;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createUser(@ModelAttribute UserDto userDto) {
            return "redirect:/v1/user/login";
    }



}
