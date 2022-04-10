package edu.rusbellruiz.quarrylevel2workshop2;

/**
 * Interface que contiene las capacidades mínimas que le debemos garantizar a una nave tipo no tripulada según los requisitos del cliente
 */
public interface IUnmannedSpacecraft {

    /**
     * este método permite determinar el equipamiento con que debe contar la nave según el trabajo a realizar
     */
    public void equipment();

    /**
     * Este método determina la periodicidad de envió de información automática que tendrá la nave no tripulada.
     */
    public void SendInformation();

}
