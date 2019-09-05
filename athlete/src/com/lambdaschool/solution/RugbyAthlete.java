package com.lambdaschool.solution;

//passes override information into mathods within RugbyAthleteCreationInjector.
public class RugbyAthlete implements Processor, CourtInjector
{
    @Override
    public void displayAthlete() {
        System.out.println("************/n");
        System.out.println("Rugby Athlete/n");
        System.out.println("************/n");
    }

    @Override
    public void displayCourt() {
        System.out.println("************/n");
        System.out.println("Rugby Pitch/n");
        System.out.println("************/n");
    }
}