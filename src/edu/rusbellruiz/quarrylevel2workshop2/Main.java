package edu.rusbellruiz.quarrylevel2workshop2;
/**
 * Se importa librería que permite tomar los datos ingresados por consola
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        /**
         * Representa la opción seleccionada por el usuario
         */
        int option;
        /**
         * Corresponde al nombre personalizado que el usuario desea dar a su nave
         */
        String name;
        /**
         * Corresponde al peso que transportara la nave
         */
        float weight;
        /**
         * Corresponde a la distancia que recorrerá la nave
         */
        float distance;
        /**
         * Variable que controla la terminación del ciclo del menú
         */
        boolean exit = false;

        /**
         * Variable que tendrá el método para capturar la información ingresada por consola
         */
        Scanner userData = new Scanner(System.in);

        do {
            /**
             * Opciones con las que cuenta nuestro menú de venta
             */
            System.out.println("-----------------MENU PRINCIPAL-----------\n");
            System.out.println("Escoja el tipo de nave que necesita para suviaje espacial\n\n");
            System.out.println("--------OPCIONES-------\n");
            System.out.println("1. Shuttleship (lanzadera)");
            System.out.println("2. UnmannedSpacecraft (no tripulada)");
            System.out.println("3. MannedSpacecraft (tripulada)");
            System.out.println("4. MixedSpacecraft (lanzadera tripulada)");
            System.out.println("5. Exit the program\n\n");
            System.out.println("Ingrese su opción: ");
            option = userData.nextInt();


            /**
             * Se controla el caso a evaluar dependiendo de la opción ingresada por el usuario
             */
            switch (option) {
                case 1:
                    System.out.println("Ingrese el nombre que tendrá su Shuttleship: ");
                    /**
                     * Instrucción que captura la información ingresada por consola
                     */
                    name = userData.next();


                    System.out.println("Ingrese el peso de la carga a transportar (en Toneladas):");
                    weight = userData.nextInt();
                    System.out.println("Finalmente indique la distancia a recorrer (en Kilometros):");
                    distance = userData.nextInt();


                    /**
                     * Se instancia el objeto tipo Shuttleship
                     */
                    Shuttleship spaceshipOne = new Shuttleship(name, weight, distance);

                    System.out.println("----------------------------------------------------------------\n");
                    System.out.println("Su nave tendrá las siguientes especificaciones: \n" + spaceshipOne.getInformation());
                    System.out.println("-----------------------------------------------------------------\n");

                    break;
                case 2:
                    System.out.println("Ingrese el nombre que tendrá su UnmannedSpacecraft");
                    name = userData.next();


                    /**
                     * Se instancia el objeto tipo UnmannedSpacecraft
                     */
                    UnmannedSpacecraft spaceshipTwo = new UnmannedSpacecraft(name);

                    do {
                        System.out.println("-----Tipos De Trabajo Que Puede Realizar----\n");
                        System.out.println("1. Mantenimiento");
                        System.out.println("2. Estudio de cuerpos celestes\n");
                        System.out.println("Indique el tipo de trabajo a realizar: ");
                        spaceshipTwo.typejob = userData.nextInt();
                    } while (spaceshipTwo.typejob != 1 && spaceshipTwo.typejob != 2);
                    System.out.println("----------------------------------------------------------------\n");
                    System.out.println("Su nave tendrá las siguientes especificaciones: \n" + spaceshipTwo.getInformation());
                    System.out.println("----------------------------------------------------------------\n");
                    break;
                case 3:
                    System.out.println("Ingrese el nombre que tendrá su mannedSpacecraft");
                    name = userData.next();


                    /**
                     * Se instancia el objeto tipo MannedSpacecraft
                     */
                    MannedSpacecraft spaceshipTree = new MannedSpacecraft(name);

                    System.out.println("Ingrese el número de tripulantes: ");
                    spaceshipTree.numberCrewmembers = userData.nextInt();

                    do {
                        System.out.println("-----Tipos De Trabajo Que Puede Realizar----\n");
                        System.out.println("1. Mantenimiento");
                        System.out.println("2. Investigación");
                        System.out.println("3. Reparación\n");

                        System.out.println("Indique el tipo de trabajo a realizar: ");
                        spaceshipTree.typejob = userData.nextInt();
                    } while (spaceshipTree.typejob != 1 && spaceshipTree.typejob != 2 && spaceshipTree.typejob != 3);
                    System.out.println("----------------------------------------------------------------\n");
                    System.out.println("Su nave tendrá las siguientes especificaciones: \n" + spaceshipTree.getInformation());
                    System.out.println("----------------------------------------------------------------\n");
                    break;
                case 4:
                    System.out.println("Ingrese el nombre que tendrá su mixedSpacecraft: ");
                    name = userData.next();
                    System.out.println("Ingrese el peso de la carga a transportar (en Toneladas):");
                    weight = userData.nextInt();
                    System.out.println("Ingrese la distancia a recorrer (en Kilometros):");
                    distance = userData.nextInt();


                    /**
                     * Se instancia el objeto tipoMixedSpacecraft
                     */
                    MixedSpacecraft spaceshipFour = new MixedSpacecraft(name, weight, distance);

                    System.out.println("Ingrese el número de tripulantes: ");
                    spaceshipFour.numberCrewmembers = userData.nextInt();

                    do {
                        System.out.println("-----Tipos De Trabajo Que Puede Realizar----\n");
                        System.out.println("1. Mantenimiento");
                        System.out.println("2. Investigación");
                        System.out.println("3. Reparación\n");

                        System.out.println("Indique el tipo de trabajo a realizar: ");
                        spaceshipFour.typejob = userData.nextInt();
                    } while (spaceshipFour.typejob != 1 && spaceshipFour.typejob != 2 && spaceshipFour.typejob != 3);
                    System.out.println("----------------------------------------------------------------\n");
                    System.out.println("Su nave tendrá las siguientes especificaciones: \n" + spaceshipFour.getInformation());
                    System.out.println("----------------------------------------------------------------\n");
                    break;
                case 5:
                    System.out.println("Saliste del programa");
                    exit = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 5\n\n");
            }
            if (option == 1 || option == 2 || option == 3 || option == 4) {
                System.out.println("Su nave se le entregara dentro de 6 meses.\n");
                System.out.println("-----------------------------------------------------------------\n");
                System.out.println("---------A continuación, volverá al menú principal---------------\n\n\n\n\n");
                Thread.sleep(35000);
            }
        }
        while (!exit);

    }
}
