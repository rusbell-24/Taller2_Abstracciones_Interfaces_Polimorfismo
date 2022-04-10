package edu.rusbellruiz.quarrylevel2workshop2;

public class Shuttleship extends Spaceship implements IShuttleShip{


    public Shuttleship(String name, float weight, float distance) {
        super(name);
        this.weight = weight;
        this.distance = distance;
    }


    @Override
    public void amountOfFuel() {
        if (this.distance <= 500000)
            this.information.add(1500);
        else if (this.distance > 500000 && this.distance <= 1000000)
            this.information.add(5000);
        else
            this.information.add(19000);
    }


    @Override
    public void maximumSpeed() {
        if (this.weight < 400000)
            this.information.add(50000);
        else
            this.information.add(25000);
    }


    @Override
    public void decelerationTime() {
        this.information.add(2000);
    }


    @Override
    protected void energyIndependence() {
        this.information.add(60);
    }


    @Override
    public String getInformation(){
        amountOfFuel();
        maximumSpeed();
        decelerationTime();
        energyIndependence();
        return "Nave de tipo:---------------------Shuttleship\n" +
               "Nombre:---------------------------" + this.name + "\n" +
               "capacidad de combustibles de:-----" + this.information.get(0) + " litros\n" +
               "Velocidad maxima de:--------------" + this.information.get(1) + " km/s\n" +
               "Desaceleracion de:----------------" + this.information.get(2) +  " m/s\n" +
               "Independecia energetica de:-------" + this.information.get(3) + " dias";
    }
}
