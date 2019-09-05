package com.lambdaschool.solution;

//passes override information into mathods within TrackAthleteCreationInjector.
public class TrackAthlete implements Processor, CourtInjector
{
    @Override
    public void displayAthlete() {
        System.out.println("************/n");
        System.out.println("Track Athlete/n");
        System.out.println("************/n");
    }

    @Override
    public void displayCourt() {
        System.out.println("************/n");
        System.out.println("Track/n");
        System.out.println("************/n");
    }
}