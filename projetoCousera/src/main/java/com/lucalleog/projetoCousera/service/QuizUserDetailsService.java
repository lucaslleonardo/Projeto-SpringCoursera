package com.lucalleog.projetoCousera.service;

import com.lucalleog.projetoCousera.Dto.UserDto;
import com.lucalleog.projetoCousera.database.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuizUserDetailsService {

    private List <User> users = new ArrayList<>();

    public UserDetails loadUserByUsername(String username, String password) throws UsernameNotFoundException {
        return users.stream()
                .filter(u -> u.getUsername().equals(username) && u.getPassword().equals(password))
                .findFirst()
                .map (u -> new org.springframework.security.core.userdetails.User(u.getUsername(), u.getPassword(), new ArrayList<>()))
                .orElseThrow(() -> new UsernameNotFoundException("Usuario não encontrado. "));
    }

    public void registerUser (UserDto userDto) {
        User newUser = User.builder()
                .username(userDto.getUsername())
                .password(userDto.getPassword())
                .email(userDto.getEmail())
                .role(userDto.getRole())
                .build();

        users.add(newUser);
    }
}
