package com.example.myfinalproject.dto;

import com.example.myfinalproject.annotation.ValidEmail;
import com.example.myfinalproject.annotation.ValidPassword;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginDto {
    @ValidEmail
    private String email;

    @ValidPassword
    private String password;
}
