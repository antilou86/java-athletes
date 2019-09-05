package com.lambdaschool.solution;

//passes override information into mathods within BaseballAthleteCreationInjector.
public class BaseballAthlete implements Processor, CourtInjector
{
    @Override
    public void displayAthlete() {
        System.out.println("************/n");
        System.out.println("Baseball Athlete/n");
        System.out.println("************/n");
    }

    @Override
    public void displayCourt() {
        System.out.println("************/n");
        System.out.println("Baseball Diamond/n");
        System.out.println("************/n");
    }
}