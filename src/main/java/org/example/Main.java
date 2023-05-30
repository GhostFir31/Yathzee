package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int opcion;

        //verficacionFuncionamiento();


        do {

            System.out.println("*****Menu*****");
            System.out.println("1.Jugar");
            System.out.println("2.Salir");

            opcion = leer.nextInt();
            switch (opcion) {

                case 1:

                    LogicaYathzee logicaJuego = new LogicaYathzee();

                    int numeroJugador=0;

                    Jugador jugadorEnTurno;

                    Cubilete cubileteJugadorEnTurno;


                    System.out.println("Jugador escoge los dados que quieres guardar");


                    break;

                case 2:
                    System.out.println("Saliendo");
                    break;

            }
        } while (opcion != 2);
    }


    public static void verficacionFuncionamiento() {

        LogicaYathzee logicaJuego = new LogicaYathzee();

        Jugador jugador1 = logicaJuego.getJugador(0);

        Jugador jugador2 = logicaJuego.getJugador(1);

        Cubilete cubileteJugador1 = jugador1.getCubileteJugador();

        Cubilete cubileteJugador2 = jugador2.getCubileteJugador();

        for (int i = 0; i < cubileteJugador1.cubilete.size(); i++) {

            System.out.println("Dado " + (i + 1) + cubileteJugador1.getCubilete(i));

        }

        System.out.println(" ");

        for (int i = 0; i < cubileteJugador2.cubilete.size(); i++) {

            System.out.println("Dado " + (i + 1) + cubileteJugador2.getCubilete(i));

        }

    }
}