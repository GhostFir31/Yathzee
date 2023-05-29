package org.example;

public class DadoOvalo extends DadoFigura{
    private int multiplicador;

    public DadoOvalo() {
     super();
     super.setFigura("Ovalo");
     super.setCaras(7);
     multiplicador=0;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {

        this.multiplicador = multiplicador;

    }

    public void obtenerMultiplicador(){

        String color=super.getColor();

        System.out.println(color);
    }

    @Override
    public String toString() {
        return super.toString()+" multiplicador= "+multiplicador+"]";
    }
}
