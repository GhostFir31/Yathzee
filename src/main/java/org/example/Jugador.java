package org.example;

public class Jugador {

    private int puntuaje;
    private Cubilete cubileteJugador=new Cubilete();
    private boolean ganador;
    public Jugador() {

        puntuaje=0;

        cubileteJugador.generarCubilete();

        ganador=false;

    }

    public int obtenerPuntuaje(){

        return puntuaje;

    }

    public int sumarPuntuaje(){

        return this.puntuaje + obtenerPuntuaje();

    }
}
