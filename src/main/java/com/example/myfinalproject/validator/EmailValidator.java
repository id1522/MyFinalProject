package com.example.myfinalproject.validator;

import com.example.myfinalproject.annotation.ValidEmail;
import com.example.myfinalproject.common.AppConstants;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements ConstraintValidator<ValidEmail, String> {
    @Override
    public void initialize(ValidEmail constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        Pattern pattern = Pattern.compile(AppConstants.EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        //pattern-шаблон
        //Шаблоны проектирования являются неотъемлемой частью разработки программного обеспечения.
        //Эти решения не только решают повторяющиеся проблемы,
        //но и помогают разработчикам понять структуру фреймворка, распознавая общие шаблоны.
        return matcher.matches() && (4 <= email.length() && email.length() <= 64);
    }
}
