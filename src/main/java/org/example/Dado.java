package org.example;

import java.util.Random;

public  class Dado {

    private int caras;
    private int valor;
    private String color;
    private int caraVisible;

    public Dado() {
        caras=0;
        valor=0;
        color=" ";
        caraVisible=0;
    }

    public int getCaras() {
        return caras;
    }

    public int getValor() {
        return valor;
    }

    public String getColor() {
        return color;
    }

    public int getCaraVisible() {
        return caraVisible;
    }

    public void setCaras(int caras) {
        this.caras = caras;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCaraVisible(int caraVisible) {
        this.caraVisible = caraVisible;
    }

    public void generarCara() {

        Random numeroRandom = new Random();

        this.caraVisible = numeroRandom.nextInt(6)+1;
    }

    public  void generarCaras(){




    }


}
