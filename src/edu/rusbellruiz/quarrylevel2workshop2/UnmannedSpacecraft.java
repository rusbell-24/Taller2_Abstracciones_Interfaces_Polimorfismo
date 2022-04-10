package edu.rusbellruiz.quarrylevel2workshop2;

/**
 * Representa las funcionalidades de una nave espacial no tripulada, la cual extiende de Spaceship e implemente la interfaz IUnmannedSpacecraft
 */
public class UnmannedSpacecraft extends Spaceship implements IUnmannedSpacecraft {
    /**
     * Constructor que inicializa el objeto nave tipo lanzadera con los siguientes parámetros mínimos.
     *
     * @param name corresponde al nombre personalizado que tendrá la nave
     */
    public UnmannedSpacecraft(String name) {
        super(name);
    }


    /**
     * Este método permite determinar el equipamiento con que debe contar la nave según el trabajo a realizar
     */
    @Override
    public void equipment() {
        if (typejob == 1)
            this.information.add("para mantenimiento de equipos espaciales");
        else
            this.information.add("para el estudio de cuerpos celestes");
    }


    /**
     * Este método determina la periodicidad de envió de información automática que tendrá la nave no tripulada, dependiendo del trabajo a realizar.
     */
    @Override
    public void SendInformation() {
        if (typejob == 1)
            this.information.add("cada semanana");
        else
            this.information.add("cada 24 horas");

    }


    /**
     * Este método se encarga de determinar la independencia energética en meses con la que contara la nave dependiendo del trabajo a realizar
     */
    @Override
    public void energyIndependence() {
        if (typejob == 1)
            this.information.add("12 meses");
        else
            this.information.add("36 meses");

    }

    /**
     * Este método se encarga de determinar el sistema de comunicación con el cual contara la nave espacial dependiendo del tipo de trabajo a realizar
     */
    @Override
    protected void communicationSystems() {
        if (typejob == 1)
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
        equipment();
        SendInformation();
        energyIndependence();
        communicationSystems();
        return "Nave de tipo:---------------------UnmannedSpacecraft\n" +
               "Nombre:---------------------------" + this.name + "\n" +
               "Equipos de última generación:-----" + this.information.get(0) + " \n" +
               "Envió de información:-------------" + this.information.get(1) + " \n" +
               "Independencia energética de:------" + this.information.get(2) + " \n" +
               "Sistemas de comunicación:---------" + this.information.get(3);
    }
}
