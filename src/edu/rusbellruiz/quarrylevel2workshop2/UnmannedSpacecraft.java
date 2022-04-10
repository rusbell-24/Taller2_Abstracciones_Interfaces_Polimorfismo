package edu.rusbellruiz.quarrylevel2workshop2;


public class UnmannedSpacecraft extends Spaceship implements IUnmannedSpacecraft {

    public UnmannedSpacecraft(String name){
        super(name);

    }

    public void equipment(){
        if (typejob == 1)
            this.information.add("para mantenimiento de equipos espaciales");
        else
            this.information.add("para el estudio de cuerpos celestes");
    }


    @Override
    public void SendInformation() {
        if (typejob == 1)
            this.information.add("cada semanana");
        else
            this.information.add("cada 24 horas");

    }


    @Override
    public void energyIndependence() {
        if (typejob == 1)
            this.information.add("12 meses");
        else
            this.information.add("36 meses");

    }


    @Override
    public String getInformation(){
        equipment();
        SendInformation();
        energyIndependence();
        return "Nave de tipo:---------------------UnmannedSpacecraft\n" +
               "Nombre:---------------------------" + this.name + "\n" +
               "Equipos de ultima generacion:-----" + this.information.get(0) + " \n" +
               "Envio de informacion:-------------" + this.information.get(1) +  " \n" +
               "Independecia energetica de:-------" + this.information.get(2) + " ";
    }
}
