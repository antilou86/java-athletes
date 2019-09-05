package com.lambdaschool.solution;

//gives Main.java an instance of BaseballAthlete
public class BaseballAthleteCreationInjector implements AthleteCreationInjector
{
    private BaseballAthlete athlete = new BaseballAthlete();

    @Override
    public Processor getProcess() {
        return athlete ;
    }
}