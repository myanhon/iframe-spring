package com.example.springdemoannonations;

import org.springframework.stereotype.Component;

@Component // So Spring can register this component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }

}
