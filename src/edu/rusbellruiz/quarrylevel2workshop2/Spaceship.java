package edu.rusbellruiz.quarrylevel2workshop2;

/**
 * Importación de librería para poder usar Arrayáis
 */

import java.util.ArrayList;

/**
 * Clase abstracta de la cual extienden todos los tipos de naves espaciales
 */
public abstract class Spaceship {
    /**
     * Representa el nombre personalizado que tendrá la nave espacial
     */
    protected String name;
    /**
     * Representa el tipo de trabajo que se desea hacer con la nave
     */
    protected int typejob;
    /**
     * Numero de tripulantes que deberá alojar la nave, de necesitarlo
     */
    protected int numberCrewmembers;
    /**
     * Peso de la carga que transportara la nave en cuestión, de necesitarlo
     */
    protected float weight;
    /**
     * Distancia que se desea recorrer con la nave
     */
    protected float distance;
    /**
     * Almacena la información ordenada de las especificaciones que tendrá la nave según lo solicitado por el cliente
     */
    protected ArrayList information = new ArrayList();

    /**
     * Constructor que inicializa el objeto nave con el siguiente parámetro mínimo
     *
     * @param name corresponde al nombre personalizado que tendrá la nave
     */
    public Spaceship(String name) {
        this.name = name;
    }


    /**
     * Este método se encarga de calcular la independencia energética necesaria según la información suministrada por el cliente
     */
    protected abstract void energyIndependence();

    /**
     * Este método se encarga de determinar el sistema de comunicación con el cual contara la nave espacial
     */
    protected abstract  void communicationSystems();


    /**
     * Este método permite acceder a la información sobre las especificaciones que tendrá la nave a partir de lo solicitado por el cliente
     *
     * @return retorna la información de la nave en una cadena de texto
     */
    public abstract String getInformation();

}
