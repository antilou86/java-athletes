package com.lambdaschool.solution;

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