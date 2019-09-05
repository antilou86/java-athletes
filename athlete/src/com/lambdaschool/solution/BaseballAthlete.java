package com.lambdaschool.solution;

public class BaseballAthlete implements Processor, CourtInjector
{
    @Override
    public void displayAthlete() {
        System.out.println("************");
        System.out.println(Baseball Athlete);
        System.out.println("************/n");
    }

    @Override
    public void displayCourt() {
        System.out.println("************");
        System.out.println(Baseball Diamond);
        System.out.println("************/n");
    }
}