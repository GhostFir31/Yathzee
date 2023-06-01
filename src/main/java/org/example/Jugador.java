package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Jugador {

    private Random valorRandom = new Random();
    private int puntuaje;
    private ArrayList<Dado> cubileteJugador;
    private int tipoCubilete;
    private boolean ganador;

    public Jugador() {

        puntuaje = 0;

        cubileteJugador = new ArrayList<>();

        tipoCubilete = valorRandom.nextInt(2) + 1;

        ganador = false;

    }

    public boolean getGanador() {
        return ganador;
    }

    public void setGanador(boolean ganador) {
        this.ganador = ganador;
    }

    public void addDado(Dado dado) {

        cubileteJugador.add(dado);

    }

    public void borrarDados() {

        cubileteJugador.clear();

    }

    public Dado getDado(int i) {

        return cubileteJugador.get(i);

    }

    public ArrayList<Dado> getCubileteJugador() {

        return cubileteJugador;

    }

    public int getTipoCubilete() {

        return tipoCubilete;
    }

    public int obtenerPuntuaje() {

        return this.puntuaje;

    }

    public int sumarPuntuaje() {

        return this.puntuaje + obtenerPuntuaje();

    }

    @Override
    public String toString() {
        return " Jugador {" +
                " puntuaje= " + puntuaje +
                " cubileteJugador= " + cubileteJugador +
                " tipoCubilete= " + tipoCubilete +
                " ganador= " + ganador +
                "}";
    }

    public void mostrarCubilete() {

        for (int i = 0; i < cubileteJugador.size(); i++) {

           if(i<5){

            System.out.println("Dado " + (i + 1) + cubileteJugador.get(i));

           }else{

            System.out.println("Dado Ovalo =" + cubileteJugador.get(i));

           }

        }

    }

    
}
