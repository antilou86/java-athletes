package com.lambdaschool.solution;

public class BaseballAthleteInjector implements AthleteCreationInjector
{
    private BaseballAthlete athlete = new BaseballAthlete();

    @Override
    public Processor getProcess() {
        return athlete ;
    }
}