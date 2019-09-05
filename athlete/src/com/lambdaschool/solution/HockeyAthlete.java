package com.lambdaschool.solution;

//passes override information into methods within HockeyAthleteCreationInjector.
public class HockeyAthlete implements Processor, CourtInjector
{
    @Override
    public void displayAthlete()
    {
        System.out.println("************/n");
        System.out.println("Hockey Athlete/n");
        System.out.println("************/n");
    }

    @Override
    public void displayCourt()
    {
        System.out.println("************/n");
        System.out.println("Hockey Rink/n");
        System.out.println("************/n");
    }
}