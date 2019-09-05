package com.lambdaschool.solution;

public class HockeyAthleteInjector implements AthleteCreationInjector
{
    private HockeyAthlete athlete = new HockeyAthlete();

    @Override
    public Processor getProcess() {
        return athlete ;
    }
}