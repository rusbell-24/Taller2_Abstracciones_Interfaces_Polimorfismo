package edu.rusbellruiz.quarrylevel2workshop2;

import java.util.Scanner;
public class Main {


    public static void main(String[] args) throws InterruptedException {
        int option;
        String name;
        float weight;
        float distance;
        boolean exit = false;


        Scanner userData = new Scanner(System.in);

        do{
            System.out.println("-----------------MENU PRINCIPAL-----------\n");
            System.out.println("1.      Escoja el tipo de nave que necesita para su su viaje espacial\n\n");
            System.out.println("--------OPCIONES-------\n");
            System.out.println("1. Shuttleship (lanzadera)");
            System.out.println("2. unmannedSpacecraft (no tripulada)");
            System.out.println("3. mannedSpacecraft (tripulada)");
            System.out.println("4. mixedSpacecraft (lanzadera tripulada)");
            System.out.println("5. Exit the program\n\n");
            System.out.println("Ingrese su opcion: ");
            option = userData.nextInt();
            switch(option){
                case 1:
                    System.out.println("Ingrese el nombre que tendra su Shuttleship: ");
                    name = userData.next();
                    System.out.println("Por favor ingrese el peso de la carga a transportar(en Kg):");
                    weight = userData.nextInt();
                    System.out.println("Finalmente indique la distacia a recorrer (en Km):");
                    distance = userData.nextInt();

                    Shuttleship spaceshipOne = new Shuttleship(name,weight,distance);

                    System.out.println("----------------------------------------------------------------\n");
                    System.out.println("su nave tendra las siguientes especificaciones: \n" + spaceshipOne .getInformation());
                    System.out.println("-----------------------------------------------------------------\n");

                    break;
                case 2:
                    System.out.println("Ingrese el nombre que tendra su unmannedSpacecraft");
                    name = userData.next();
                    UnmannedSpacecraft spaceshipTwo = new UnmannedSpacecraft(name);
                    do {
                        System.out.println("-----Tipos de trabajo que pueden realizar----\n");
                        System.out.println("1. Mantenimiento");
                        System.out.println("2. Estudio de cuerpos celestes\n");
                        System.out.println("Indique el tipo de trabajo a realizar: ");
                        spaceshipTwo.typejob = userData.nextInt();
                    }while (spaceshipTwo.typejob !=1 && spaceshipTwo.typejob !=2);
                    System.out.println("----------------------------------------------------------------\n");
                    System.out.println("su nave tendra las siguientes especificaciones: \n" + spaceshipTwo.getInformation());
                    System.out.println("----------------------------------------------------------------\n");
                    break;
                case 3:
                    System.out.println("Ingrese el nombre que tendra su mannedSpacecraft");
                    name = userData.next();

                    MannedSpacecraft spaceshipTree = new MannedSpacecraft(name);

                    System.out.println("Ingrese el numero de tripulantes");
                    spaceshipTree.numberCrewmembers = userData.nextInt();

                    do {
                        System.out.println("-----Tipos de trabajo que pueden realizar----\n");
                        System.out.println("1. Mantenimiento");
                        System.out.println("2. Investigacion");
                        System.out.println("3. Reparacion\n");

                        System.out.println("Indique el tipo de trabajo a realizar: ");
                        spaceshipTree.typejob = userData.nextInt();
                    }while (spaceshipTree.typejob !=1 && spaceshipTree.typejob !=2 && spaceshipTree.typejob !=3);
                    System.out.println("----------------------------------------------------------------\n");
                    System.out.println("su nave tendra las siguientes especificaciones: \n" + spaceshipTree.getInformation());
                    System.out.println("----------------------------------------------------------------\n");
                    break;
                case 4:
                    System.out.println("Ingrese el nombre que tendra su mixedSpacecraft: ");
                    name = userData.next();
                    System.out.println("Por favor ingrese el peso de la carga a transportar(en Kg):");
                    weight = userData.nextInt();
                    System.out.println("Finalmente indique la distacia a recorrer (en Km):");
                    distance = userData.nextInt();

                    MixedSpacecraft spaceshipFour = new MixedSpacecraft(name,weight,distance);

                    System.out.println("Ingrese el numero de tripulantes");
                    spaceshipFour.numberCrewmembers = userData.nextInt();

                    do {
                        System.out.println("-----Tipos de trabajo que pueden realizar----\n");
                        System.out.println("1. Mantenimiento");
                        System.out.println("2. Investigacion");
                        System.out.println("3. Reparacion\n");

                        System.out.println("Indique el tipo de trabajo a realizar: ");
                        spaceshipFour.typejob = userData.nextInt();
                    }while (spaceshipFour.typejob !=1 && spaceshipFour.typejob !=2 && spaceshipFour.typejob !=3);
                    System.out.println("----------------------------------------------------------------\n");
                    System.out.println("su nave tendra las siguientes especificaciones: \n" + spaceshipFour.getInformation());
                    System.out.println("----------------------------------------------------------------\n");
                    break;
                case 5:
                    System.out.println("Saliste del programa");
                    exit=true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 5\n\n");
            }
            if (option == 1 || option == 2|| option == 3||option == 4) {
                System.out.println("Su nave se le entregara dentro de 6 meses.\n");
                System.out.println("-----------------------------------------------------------------\n");
                System.out.println("---------A continuacion volvera al menu principal---------------\n\n\n\n\n");
                Thread.sleep(40000);
            }
        }
        while(!exit);

    }

}
