package org.example;

import java.util.Random;

public class Jugador implements HerramientasCubilete {

    private Random valorRandom = new Random();
    private int puntuaje;
    private Cubilete cubileteJugador = new Cubilete();
    private boolean tipoCubilete;
    private boolean ganador;

    public Jugador() {

        puntuaje = 0;

        cubileteJugador = new Cubilete();

        tipoCubilete = false;

        ganador = false;

    }

    public void generarCubileteJugador() {

        cubileteJugador.generarCubilete();

    }

    public void generarTipoCubilete() {

        this.tipoCubilete = valorRandom.nextBoolean();

    }

    public boolean comprobarTipoCubilete(Jugador jugador1, Jugador jugador2) {

        return jugador1.getTipocubilete() != jugador2.getTipocubilete();

    }

    public Cubilete getCubileteJugador() {

        return cubileteJugador;

    }

    public boolean getTipocubilete() {

        return tipoCubilete;
    }

    public int obtenerPuntuaje() {

        return puntuaje;

    }

    public int sumarPuntuaje() {

        return this.puntuaje + obtenerPuntuaje();

    }
}
