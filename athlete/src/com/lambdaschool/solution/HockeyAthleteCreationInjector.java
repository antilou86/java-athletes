package com.lambdaschool.solution;

//gives Main.java an instance of RugbyAthlete
public class HockeyAthleteCreationInjector implements AthleteCreationInjector
{
    private HockeyAthlete athlete = new HockeyAthlete();

    @Override
    public Processor getProcess() {
        return athlete ;
    }
}