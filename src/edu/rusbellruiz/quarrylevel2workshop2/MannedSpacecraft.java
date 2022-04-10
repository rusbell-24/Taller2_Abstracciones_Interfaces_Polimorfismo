package edu.rusbellruiz.quarrylevel2workshop2;


public class MannedSpacecraft extends Spaceship implements IMannedSpacecraft{

    public MannedSpacecraft(String name){
        super(name);
    }

    public void equipment(){
        if (this.typejob == 1)
            this.information.add("para procesos de matenimiento interno y externo");
        else if(this.typejob == 2)
            this.information.add("para todo tipo de investigaciones espaciales");
        else
            this.information.add("para reparacion en espacios confinados y externos");
    }


    @Override
    public void energyIndependence(){
        if (typejob == 1)
            this.information.add("12 meses");
        else if(this.typejob == 2)
            this.information.add("36 meses");
        else
            this.information.add("24 meses");
    }


    @Override
    public void personnelAdequacy() {
        this.information.add(this.numberCrewmembers + " tripulantes  mas 2 pilotos");
    }


    @Override
    public String getInformation() {
        equipment();
        energyIndependence();
        personnelAdequacy();
        return "Nave de tipo:---------------------MannedSpacecraft\n" +
               "Nombre:---------------------------" + this.name + "\n" +
               "Equipos de ultima generacion:-----" + this.information.get(0) + " \n" +
               "Independecia energetica de:-------" + this.information.get(1) + " \n" +
               "Instrumentos para:----------------" + this.information.get(2) ;
    }

}

