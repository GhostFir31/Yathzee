package org.example;

public class DadoFigura extends Dado{
    private String Figura;
    public DadoFigura() {

        super();
        Figura = "";
    }

    public String getFigura() {
        return Figura;
    }

    public void setFigura(String figura) {
        Figura = figura;
    }

}
