package com.example.springdemoannonations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    
    private FortuneService fortuneService;
    @Value("${foo.email}")
    private String emailAddress;
    @Value("${foo.team}")
    private String team;

    @Autowired
    public CricketCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public String getTeam() {
        return this.team;
    }
    

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
}
