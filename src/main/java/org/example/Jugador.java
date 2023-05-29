package org.example;


public class Jugador {

    private int puntuaje;
    private Cubilete cubileteJugador;
    private boolean ganador;
    public Jugador() {

        puntuaje=0;

        this.cubileteJugador;

        ganador=false;

    }

    public int obtenerPuntuaje(){

        return puntuaje;

    }

    public int sumarPuntuaje(){

        return this.puntuaje + obtenerPuntuaje();

    }
}
