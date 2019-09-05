package com.lambdaschool.solution;

public class TrackAthleteCreationInjector implements AthleteCreationInjector
{
    private TrackAthlete athlete = new TrackAthlete();

    @Override
    public Processor getProcess() {
        return athlete ;
    }
}