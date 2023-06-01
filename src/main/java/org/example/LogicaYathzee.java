package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LogicaYathzee {

    ArrayList<Jugador> jugadores = new ArrayList<>();
    Random valorAleatorio = new Random();

    Scanner leer = new Scanner(System.in);

    int turno;

    public LogicaYathzee() {

        generarJugadores();

        turno = 0; // true jugador 1 false jugador 2

    }

    public void generarCubilete(Jugador jugador, ArrayList<Dado> dadosTomados) {

        jugador.borrarDados();

        switch (jugador.getTipoCubilete()) {

            case 1 -> {
                for (int i = 0; i < 5 - dadosTomados.size(); i++) {

                    jugador.addDado(new DadoNumerico());

                }
                jugador.addDado(new DadoOvalo());
            }
            case 2 -> {
                for (int i = 0; i < 5 - dadosTomados.size(); i++) {

                    jugador.addDado(new DadoFigura());

                }
                jugador.addDado(new DadoOvalo());
            }
            default -> {
            }
        }
    }

    public int evaluarJugada(ArrayList<Dado> dadosTomados) {

        int puntuaje = 0;

        for (int i = 0; i < dadosTomados.size(); i++) {

            if (dadosTomados.get(i).getCaraVisible() == dadosTomados.get(0).getCaraVisible()) {

                puntuaje = dadosTomados.get(i).getCaraVisible() + puntuaje;

            }

        }
        return puntuaje;
    }

    public Jugador getJugador(int i) {

        return jugadores.get(i);

    }

    public int getTurno() {

        return turno;
    }

    public void cambiarTurno() {

        if (getTurno() == 1) {
            this.turno = 2;
        } else {
            this.turno = 1;
        }

    }

    public void generarJugadores() {

        Jugador jugador1;
        Jugador jugador2;

        do {

            jugador1 = new Jugador();

            jugador2 = new Jugador();

        } while (jugador1.getTipoCubilete() == jugador2.getTipoCubilete());

        jugadores.add(jugador1);
        jugadores.add(jugador2);

    }

}
