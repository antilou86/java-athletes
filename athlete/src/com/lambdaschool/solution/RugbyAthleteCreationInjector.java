package com.lambdaschool.solution;

//gives Main.java an instance of RugbyAthlete

public class RugbyAthleteCreationInjector implements AthleteCreationInjector
{
    private RugbyAthlete athlete = new RugbyAthlete();

    @Override
    public Processor getProcess() {
        return athlete ;
    }
}