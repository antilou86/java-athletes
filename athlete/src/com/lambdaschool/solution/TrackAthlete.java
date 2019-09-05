package com.lambdaschool.solution;

//passes override information into mathods within TrackAthleteCreationInjector.
public class TrackAthlete implements Processor, CourtInjector
{
    @Override
    public void displayAthlete() {
        System.out.println("************");
        System.out.println("Track Athlete");
        System.out.println("************");
    }

    @Override
    public void displayCourt() {
        System.out.println("************");
        System.out.println("Track");
        System.out.println("************");
    }
}