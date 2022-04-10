package edu.rusbellruiz.quarrylevel2workshop2;

/**
 * Interface que contiene las capacidades mínimas que le debemos garantizar a una nave tipo tripulada según los requisitos del cliente
 */
public interface IMannedSpacecraft {
    /**
     * Este método permite determinar el equipamiento con que debe contar la nave según el trabajo a realizar
     */
    public void equipment();

    /**
     * Este método permite determinar el equipamiento con que debe contar la nave para suministrar lo necesario a cada tripulante abordo
     */
    public void personnelAdequacy();

}
