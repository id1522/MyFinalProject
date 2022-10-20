package com.example.myfinalproject.error;

import lombok.*;

@Builder
@Getter
@Setter
public class ValidationError {
    private String code;
    private String message;
}
