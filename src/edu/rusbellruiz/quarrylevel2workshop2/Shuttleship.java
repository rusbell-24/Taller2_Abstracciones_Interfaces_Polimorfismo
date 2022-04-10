package edu.rusbellruiz.quarrylevel2workshop2;

/**
 * Representa las funcionalidades de una nave espacial tipo lanzadera, la cual extiende de Spaceship e implemente la interfaz IShuttleShip
 */
public class Shuttleship extends Spaceship implements IShuttleShip {

    /**
     * Constructor que inicializa el objeto nave tipo lanzadera con los siguientes parámetros mínimos
     *
     * @param name     corresponde al nombre personalizado que tendrá la nave
     * @param weight   corresponde al peso que deberá transportar la nave
     * @param distance corresponde a la distancia que deberá recorrer la nave
     */
    public Shuttleship(String name, float weight, float distance) {
        super(name);
        this.weight = weight;
        this.distance = distance;
    }


    /**
     * Este método se encarga de calcular el combustible que necesitara la nave dependiendo de la distancia que se va a recorrer.
     */
    @Override
    public void amountOfFuel() {
        if (this.distance <= 500000)
            this.information.add(15000);
        else if (this.distance > 500000 && this.distance <= 1000000)
            this.information.add(50000);
        else
            this.information.add(190000);
    }


    /**
     * Este método se encarga de calcular la velocidad máxima que podrá alcanzar la nave dependiendo del peso de la carga a transportar
     */
    @Override
    public void maximumSpeed() {
        if (this.weight < 20)
            this.information.add(30000);
        else if (this.weight >= 20 && this.weight < 40)
            this.information.add(25000);
        else
            this.information.add(15000);
    }


    /**
     * Este método se encarga de determinar el tiempo promedio de desaceleración que tendrá la nave dependiendo del peso de la carga
     */
    @Override
    public void decelerationTime() {
        if (this.weight < 20)
            this.information.add(10);
        else if (this.weight >= 20 && this.weight < 40)
            this.information.add(12);
        else
            this.information.add(14);

    }


    /**
     * Este método se encarga de determinar la independencia energética en días con la que contara la nave dependiendo de la distancia a recorrer
     */
    @Override
    protected void energyIndependence() {
        if (this.distance <= 500000)
            this.information.add(60);
        else if (this.distance > 500000 && this.distance <= 1000000)
            this.information.add(120);
        else
            this.information.add(240);

    }


    /**
     * Este método se encarga de determinar el sistema de comunicación con el cual contara la nave espacial dependiendo de la distancia de viaje
     */
    @Override
    protected void communicationSystems() {
        if (this.distance <= 500000)
            this.information.add("Por radiofrecuencia");
        else
            this.information.add("Láser");
    }


    /**
     * Este método permite acceder a la información sobre las especificaciones que tendrá la nave a partir de lo solicitado por el cliente
     *
     * @return retorna la información de la nave en una cadena de texto
     */
    @Override
    public String getInformation() {
        amountOfFuel();
        maximumSpeed();
        decelerationTime();
        energyIndependence();
        communicationSystems();
        return "Nave de tipo:---------------------Shuttleship\n" +
               "Nombre:---------------------------" + this.name + "\n" +
               "Capacidad de combustible de:------" + this.information.get(0) + " litros\n" +
               "Velocidad máxima de:--------------" + this.information.get(1) + " km/h\n" +
               "Desaceleración de:----------------" + this.information.get(2) + " km/s\n" +
               "Independencia energética de:------" + this.information.get(3) + " dias\n" +
               "Sistemas de comunicación:---------" + this.information.get(4);
    }
}
