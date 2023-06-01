package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int opcion;
        int dadoElegido;
        int cantidadDadosElegidos;

        do {

            System.out.println("*****Menu*****");
            System.out.println("1.Jugar");
            System.out.println("2.Salir");

            opcion = leer.nextInt();

            switch (opcion) {

                case 1:

                    ArrayList<Dado> dadosTomados = new ArrayList<>();

                    ArrayList<Dado> cubileteJugadorEnTurno = new ArrayList<>();

                    Jugador jugadorEnTurno;

                    LogicaYathzee logicaJuego = new LogicaYathzee();

                    jugadorEnTurno = logicaJuego.getJugador(logicaJuego.getTurno());
    
                    do {

                        logicaJuego.generarCubilete(jugadorEnTurno, dadosTomados);

                        cubileteJugadorEnTurno = jugadorEnTurno.getCubileteJugador();

                        jugadorEnTurno.mostrarCubilete();

                        System.out.println("Cuantos dados quieres guardar de los 5:");

                        cantidadDadosElegidos = leer.nextInt();

                        if (cantidadDadosElegidos < 6) {

                            for (int i = 0; i < cantidadDadosElegidos; i++) {

                                System.out.println("Escoge el dado que guardar excepto el dado ovalo:");

                                dadoElegido = leer.nextInt();
                                if (dadoElegido < 6) {
                                    dadosTomados.add(cubileteJugadorEnTurno.get(dadoElegido - 1));
                                } else {
                                    i--;
                                    System.out.println("el dado ovalo solo es un multiplicador no lo puedes guardar");
                                }
                            }

                            for (int i = 0; i < dadosTomados.size(); i++) {

                                System.out.println("Dado Tomado " + (i + 1) + dadosTomados.get(i));

                            }
                        } else {
                            System.out.println("No puedes guardar mas de 5 el 6to es un multiplicador");
                        }

                    } while (dadosTomados.size() != 5);

                    logicaJuego.cambiarTurno();

                    break;

                case 2:
                    System.out.println("Saliendo");
                    break;

            }
        } while (opcion != 2);
    }

}