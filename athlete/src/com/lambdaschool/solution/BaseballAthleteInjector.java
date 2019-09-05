package com.lambdaschool.solution;

public class BaseballAthleteCreationInjector implements AthleteCreationInjector
{
    private BaseballAthlete athlete = new BaseballAthlete();

    @Override
    public Processor getProcess() {
        return athlete ;
    }
}