package org.example;

import java.util.ArrayList;
import java.util.Collections;
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
                    Jugador jugador1;
                    Jugador jugador2;
                    do {
                        LogicaYathzee logicaJuego = new LogicaYathzee();

                        ArrayList<Dado> dadosTomados;

                        ArrayList<Dado> cubileteJugadorEnTurno = new ArrayList<>();

                        Jugador jugadorEnTurno;

                        int intentos = 0;

                        dadosTomados = new ArrayList<>(Collections.nCopies(5, new DadoNumerico()));

                        cubileteJugadorEnTurno = new ArrayList<>();

                        jugadorEnTurno = logicaJuego.getJugador(logicaJuego.getTurno());

                        do {

                            logicaJuego.generarCubilete(jugadorEnTurno);

                            cubileteJugadorEnTurno = jugadorEnTurno.getCubileteJugador();

                            System.out.println(cubileteJugadorEnTurno);

                            System.out.println("Cuantos dados quieres guardar:");

                            cantidadDadosElegidos = leer.nextInt();

                            for (int i = 0; i < cantidadDadosElegidos; i++) {

                                System.out.println("Escoge el dado que guardar:");

                                dadoElegido = leer.nextInt();

                                dadosTomados.set(i, cubileteJugadorEnTurno.get(dadoElegido));

                            }
                            intentos++;

                        } while (intentos <= 3);



                        logicaJuego.cambiarTurno();

                        jugador1 = logicaJuego.getJugador(0);
                        jugador2 = logicaJuego.getJugador(1);

                    } while (!jugador1.getGanador() || !jugador2.getGanador());


                    break;

                case 2:
                    System.out.println("Saliendo");
                    break;

            }
        } while (opcion != 2);
    }


}