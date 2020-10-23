package com.example.springdemoannonations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CricketCoachApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext-annonations.xml");

        CricketCoach cricketUser = context.getBean("cricketCoach", CricketCoach.class);
        System.out.println(cricketUser.getDailyFortune());
        System.out.println(cricketUser.getTeam());
        context.close();
    }
}
