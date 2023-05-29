package org.example;

import java.util.Random;

public class Dado {
    Random numeroRandom = new Random();
    private int caras;
    private String color;
    private int caraVisible;

    public Dado() {
        caras = 6;
        color = generarColor();
        caraVisible = generarCara();
    }

    public int getCaras() {
        return caras;
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


    public void setColor(String color) {
        this.color = color;
    }

    public void setCaraVisible(int caraVisible) {
        this.caraVisible = caraVisible;
    }

    public int generarCara() {

       return caraVisible = numeroRandom.nextInt(6) + 1;
    }

    public String generarColor() {

        String color="";

        int colorAleatorio = numeroRandom.nextInt(6)+1;

        switch (colorAleatorio) {
            case 1 -> color = "Rojo";
            case 2 -> color = "Azul";
            case 3 -> color = "Verde";
            case 4 -> color = "Amarillo";
            case 5 -> color = "Negro";
            case 6 -> color = "Naranja";
        }

        return color;

    }

    @Override
    public String toString() {
        return "**[Dado " +
                ", caras=" + caras +
                ", color='" + color + '\'' +
                ", caraVisible=" + caraVisible
                ;
    }
}
