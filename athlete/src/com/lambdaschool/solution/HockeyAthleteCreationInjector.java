package com.lambdaschool.solution;

public class HockeyAthleteCreationInjector implements AthleteCreationInjector
{
    private HockeyAthlete athlete = new HockeyAthlete();

    @Override
    public Processor getProcess() {
        return athlete ;
    }
}