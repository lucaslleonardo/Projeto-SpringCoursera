package com.lucalleog.projetoCousera.Dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString(exclude = "password")
public class UserDto {
    
    private String username;
    private String password;
    private String email;
    private String role;
}
