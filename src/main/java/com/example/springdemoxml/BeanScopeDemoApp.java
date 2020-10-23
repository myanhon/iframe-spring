package com.example.springdemoxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        // load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "bean-scope-applicationContext.xml");

        // retrieve the bean from the spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check if they are the same
        boolean result = (theCoach == alphaCoach);

        // print the results
        System.out.println("\n Pointing to the same object: " + result);
        System.out.println("\n Memory location to for theCoach: " + theCoach);
        System.out.println("\n Memory location to for alphaCoach: " + alphaCoach + "\n");
        // close the context
        context.close();
    }
}
