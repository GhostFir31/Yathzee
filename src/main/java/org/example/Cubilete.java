package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Cubilete {

    ArrayList<Dado> cubilete ;

    public Cubilete() {

         cubilete=new ArrayList<>();

    }
    public void generarCubilete() {

        Random numeroAleatorio = new Random();

        int tipoDado = numeroAleatorio.nextInt(2) + 1;

        switch (tipoDado) {
            case 1 -> {
                for (int i = 0; i < 4; i++) {

                    cubilete.add(new Dado());

                }
                cubilete.add(new DadoOvalo());
            }
            case 2 -> {
                for (int i = 0; i < 4; i++) {

                    cubilete.add(new DadoFigura());

                }
                cubilete.add(new DadoOvalo());
            }
            default -> {
            }
        }

    }

    @Override
    public String toString() {
        return "Cubilete{" +
                 cubilete +
                '}';
    }
}
