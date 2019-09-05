package com.lambdaschool.solution;

//passes override information into mathods within BaseballAthleteCreationInjector.
public class BaseballAthlete implements Processor, CourtInjector
{
    @Override
    public void displayAthlete() {
        System.out.println("************");
        System.out.println("Baseball Athlete");
        System.out.println("************");
    }

    @Override
    public void displayCourt() {
        System.out.println("************");
        System.out.println("Baseball Diamond");
        System.out.println("************");
    }
}