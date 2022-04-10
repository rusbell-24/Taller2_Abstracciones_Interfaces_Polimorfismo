package edu.rusbellruiz.quarrylevel2workshop2;

import java.util.ArrayList;

public abstract class Spaceship {

    protected String name;
    protected int typejob;
    protected int numberCrewmembers;
    protected float weight;
    protected float distance;
    protected ArrayList information = new ArrayList();


    public Spaceship(String name){
        this.name= name;
    }

    protected abstract void energyIndependence();
    public abstract String getInformation();

}
