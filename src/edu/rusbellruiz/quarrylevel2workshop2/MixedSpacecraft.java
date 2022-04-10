package edu.rusbellruiz.quarrylevel2workshop2;

/**
 * Representa las funcionalidades de una nave espacial tipo mixta (lanzadera tripulada), la cual extiende de Spaceship e implemente las interfaces IShuttleShip y IMannedSpacecraft
 */
public class MixedSpacecraft extends Spaceship implements IShuttleShip, IMannedSpacecraft {
    /**
     * Constructor que inicializa el objeto nave tipo mixta (lanzadera tripulada) con los siguientes parámetros mínimos
     *
     * @param name     corresponde al nombre personalizado que tendrá la nave
     * @param weight   corresponde al peso que deberá transportar la nave
     * @param distance corresponde a la distancia que deberá recorrer la nave
     */
    public MixedSpacecraft(String name, float weight, float distance) {
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
        if (this.weight < 30)
            this.information.add(14);
        else if (this.weight >= 30 && this.weight < 60)
            this.information.add(16);
        else
            this.information.add(18);
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
    protected void energyIndependence() {
        if (typejob == 1)
            this.information.add("18 meses");
        else if (this.typejob == 2)
            this.information.add("48 meses");
        else
            this.information.add("36 meses");

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
     * Este método se encarga se calibrar los diferentes módulos del sistema de escape de emergencia
     */
    public void emergencyEscapeSystem(){
        this.information.add("con calibración automática");
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
        equipment();
        energyIndependence();
        personnelAdequacy();
        communicationSystems();
        emergencyEscapeSystem();
        return "Nave de tipo:---------------------MixedSpacecraft\n" +
                "Nombre:---------------------------" + this.name + "\n" +
                "capacidad de combustibles de:-----" + this.information.get(0) + " litros\n" +
                "Velocidad maxima de:--------------" + this.information.get(1) + " km/h\n" +
                "Desaceleracion de:----------------" + this.information.get(2) + " km/s\n" +
                "Equipos de ultima generacion:-----" + this.information.get(3) + " \n" +
                "Independecia energetica de:-------" + this.information.get(4) + "\n" +
                "Instrumentos para:----------------" + this.information.get(5) + "\n" +
                "Sistemas de comunicación:---------" + this.information.get(6) + "\n" +
                "Sistemas de emergencia:-----------" + this.information.get(7);
    }

}
