package com.example.springdemoannonations;

public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is sad day";
    }
    
}
