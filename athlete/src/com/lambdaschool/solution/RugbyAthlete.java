package com.lambdaschool.solution;

//passes override information into mathods within RugbyAthleteCreationInjector.
public class RugbyAthlete implements Processor, CourtInjector
{
    @Override
    public void displayAthlete() {
        System.out.println("************");
        System.out.println("Rugby Athlete");
        System.out.println("************");
    }

    @Override
    public void displayCourt() {
        System.out.println("************");
        System.out.println("Rugby Pitch");
        System.out.println("************");
    }
}