package org.example;

public class DadoFigura extends Dado{
    private String figura;
    public DadoFigura() {

        super();

        figura = generarFigura();
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        figura = figura;
    }
    public String generarFigura() {
        String figura="";
        int figuraAleatoria = numeroRandom.nextInt(6)+1;

        switch (figuraAleatoria) {
            case 1 -> figura = "Circulo";
            case 2 -> figura = "Cuadro";
            case 3 -> figura = "Rectangulo";
            case 4 -> figura = "Triangulo";
            case 5 -> figura = "Pentagono";
            case 6 -> figura = "Rombo";
        }
        return figura;
    }

    @Override
    public String toString() {
        return super.toString()+" Figura= "+figura;
    }
}
