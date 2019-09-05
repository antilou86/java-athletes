package com.lambdaschool.solution;

//gives Main.java an instance of TrackAthlete

public class TrackAthleteCreationInjector implements AthleteCreationInjector
{
    private TrackAthlete athlete = new TrackAthlete();

    @Override
    public Processor getProcess() {
        return athlete ;
    }
}