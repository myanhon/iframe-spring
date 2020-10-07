package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {
        // load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class); // Coach.class interface implementation

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        // close the context
        context.close();
    }
}
