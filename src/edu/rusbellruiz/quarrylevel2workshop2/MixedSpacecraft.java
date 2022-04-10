package edu.rusbellruiz.quarrylevel2workshop2;

public class MixedSpacecraft extends Spaceship implements IShuttleShip,IMannedSpacecraft{

    public MixedSpacecraft(String name, float weight, float distance) {
        super(name);
        this.weight = weight;
        this.distance = distance;
    }

    @Override
    public void amountOfFuel() {

    }


    @Override
    public void maximumSpeed() {

    }


    @Override
    public void decelerationTime() {

    }


    @Override
    public void equipment() {

    }


    @Override
    public void personnelAdequacy() {

    }


    @Override
    protected void energyIndependence() {


    }


    @Override
    public String getInformation() {
        return null;
    }

}
