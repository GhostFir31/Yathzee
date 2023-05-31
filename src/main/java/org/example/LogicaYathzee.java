package org.example;

import java.util.ArrayList;
import java.util.Random;

public class LogicaYathzee {

    ArrayList<Jugador> jugadores = new ArrayList<>();
    Random valorAleatorio = new Random();
    int turno;

    public LogicaYathzee() {

        generarJugadores();

        turno = 1; //true jugador 1 false jugador 2

    }

    public void generarCubilete(Jugador jugador) {

        switch (jugador.getTipoCubilete()) {

            case 1 -> {
                for (int i = 0; i < 5; i++) {

                    jugador.addDado(new DadoNumerico());

                }
                jugador.addDado(new DadoOvalo());
            }
            case 2 -> {
                for (int i = 0; i < 5; i++) {

                    jugador.addDado(new DadoFigura());

                }
                jugador.addDado(new DadoOvalo());
            }
            default -> {
            }
        }
    }

    public Jugador getJugador(int i) {

        return jugadores.get(i);

    }
   public int getTurno(){

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
public void determinarJugada(Jugador jugador){

ArrayList<Dado> cubilete = new ArrayList<>();

cubilete=jugador.getCubileteJugador();



}

}
