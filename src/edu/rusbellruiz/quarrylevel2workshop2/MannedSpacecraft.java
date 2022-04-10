package edu.rusbellruiz.quarrylevel2workshop2;

/**
 * Representa las funcionalidades de una nave espacial tipo tripulada, la cual extiende de Spaceship e implemente la interfaz IMannedSpacecraft
 */
public class MannedSpacecraft extends Spaceship implements IMannedSpacecraft {
    /**
     * Constructor que inicializa el objeto nave tipo tripulada con los siguientes parámetros mínimos
     *
     * @param name corresponde al nombre personalizado que tendrá la nave
     */
    public MannedSpacecraft(String name) {
        super(name);
    }

    /**
     * Este método permite determinar el equipamiento con que contará la nave según el trabajo a realizar
     */
    @Override
    public void equipment() {
        if (this.typejob == 1)
            this.information.add("para procesos de mantenimiento interno y externo");
        else if (this.typejob == 2)
            this.information.add("para todo tipo de investigaciones espaciales");
        else
            this.information.add("para reparación en espacios confinados y externos");
    }


    /**
     * Este método se encarga de determinar la independencia energética en meses con la que contara la nave dependiendo del trabajo a realizar
     */
    @Override
    public void energyIndependence() {
        if (typejob == 1)
            this.information.add("12 meses");
        else if (this.typejob == 2)
            this.information.add("36 meses");
        else
            this.information.add("24 meses");
    }


    /**
     * Este método permite determinar el equipamiento con que debe contar la nave para suministrar lo necesario a cada tripulante abordo
     */
    @Override
    public void personnelAdequacy() {
        this.information.add(this.numberCrewmembers + " tripulantes más 2 pilotos");
    }


    /**
     * Este método se encarga de determinar el sistema de comunicación con el cual contara la nave espacial dependiendo del tipo de trabajo a realizar
     */
    @Override
    protected void communicationSystems() {
        if (this.typejob == 1)
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
        energyIndependence();
        personnelAdequacy();
        communicationSystems();
        return "Nave de tipo:---------------------MannedSpacecraft\n" +
               "Nombre:---------------------------" + this.name + "\n" +
               "Equipos de última generación:-----" + this.information.get(0) + " \n" +
               "Independencia energética de:-------" + this.information.get(1) + " \n" +
               "Instrumentos para:----------------" + this.information.get(2) + " \n" +
               "Sistemas de comunicación:---------" + this.information.get(3);
    }

}

