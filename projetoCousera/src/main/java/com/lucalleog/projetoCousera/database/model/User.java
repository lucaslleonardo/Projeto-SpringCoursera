package com.lucalleog.projetoCousera.database.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString(exclude = "password")
public class User {

    private String username;
    private String password;
    private String email;
    private String role;

}
