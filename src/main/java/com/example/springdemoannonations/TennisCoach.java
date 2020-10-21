package com.example.springdemoannonations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // Spring will automaticall register this bean -> the default bean id (make
           // first letter lower-case) -> tennisCoach
public class TennisCoach implements Coach {
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println(">> inside default constructor");
    }

    // define my init method
    @PostConstruct // code will execute after constructor and after injection of dependencies
    public void doMyStartupStuff(){
        System.out.println(">> Tenniscoach: inside of doMyStartupStuff()");
    }

    // define my destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println(">> Tenniscoach: inside of doMyCleanupStuff()");
    }

    /*
     * @Autowired public TennisCoach (FortuneService theFortuneService){
     * fortuneService = theFortuneService; }
     */

    /*
     * // define a setter method
     * 
     * @Autowired public void setFortuneService(FortuneService theFortuneService) {
     * System.out.println(">> TennisCoach: inside setFortuneService() method");
     * fortuneService = theFortuneService;
     * System.out.println("setFortuneService obj: " + theFortuneService); }
     */

    /*
     * //define setter method injection
     * 
     * @Autowired public void doSomeCrazyStuff(FortuneService theFortuneService) {
     * System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
     * fortuneService = theFortuneService;
     * System.out.println("doSomeCrazyStuff obj: " + theFortuneService); }
     */
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
