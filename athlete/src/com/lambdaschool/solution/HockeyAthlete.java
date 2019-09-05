package com.lambdaschool.solution;

//passes override information into methods within HockeyAthleteCreationInjector.
public class HockeyAthlete implements Processor, CourtInjector
{
    @Override
    public void displayAthlete()
    {
        System.out.println("************");
        System.out.println("Hockey Athlete");
        System.out.println("************");
    }

    @Override
    public void displayCourt()
    {
        System.out.println("************");
        System.out.println("Hockey Rink");
        System.out.println("************");
    }
}