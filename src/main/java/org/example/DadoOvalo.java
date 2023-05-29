package org.example;

public class DadoOvalo extends DadoFigura{
    private int multiplicador;
    private String figura;
    public DadoOvalo() {
     super();
     figura = "Ovalo";
     multiplicador=0;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {

        this.multiplicador = multiplicador;

    }


}
