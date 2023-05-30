package org.example;

import java.util.ArrayList;

public class LogicaYathzee {

    ArrayList<Jugador> jugadores = new ArrayList<>();
    boolean turno;
    public LogicaYathzee() {

      generarJugadores();

      turno= true; //true jugador 1 false jugador 2

    }

    public Jugador getJugador(int i){

        return jugadores.get(i);

    }
    public boolean cambiarturno(){

        return !this.turno;

    }
    public void generarJugadores(){

        Jugador jugador1;
        Jugador jugador2;

        do {

            jugador1 = new Jugador();

            jugador2 = new Jugador();

        }while(jugador1.getTipocubilete() == jugador2.getTipocubilete());

        jugadores.add(jugador1);
        jugadores.add(jugador2);

    }



}
