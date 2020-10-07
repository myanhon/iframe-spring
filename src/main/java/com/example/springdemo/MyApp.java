package com.example.springdemo;

public class MyApp {
    public static void main(String[] args) {
        // create the object
        Coach theCoach = new TrackCoach();
        // use the Object
        System.out.println(theCoach.getDailyWorkout());
        
    }
}
