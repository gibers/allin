package com.modulej9.allin.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersDto {

    private Long userId;
    private String username;
    private String password;
    private String email;
    private String role;

}

