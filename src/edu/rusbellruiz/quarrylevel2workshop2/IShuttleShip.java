package edu.rusbellruiz.quarrylevel2workshop2;

/**
 * Interface que contiene las capacidades mínimas que le debemos garantizar a una nave tipo lanzadera según los requisitos del cliente
 */
public interface IShuttleShip {

    /**
     * Este método se encarga de calcular la capacidad de combustible que tendrá la nave para cumplir con las exigencias del cliente
     */
    public void amountOfFuel();

    /**
     * Este método se encarga de calcular la velocidad máxima que podrá alcanzar la nave según la información suministrada por el cliente
     */
    public void maximumSpeed();

    /**
     * Este método se encarga de calcular la desaceleración que tendrá la nave a partir de la información suministrada por el cliente
     */
    public void decelerationTime();

}
