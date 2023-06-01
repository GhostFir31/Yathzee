package org.example;

import java.util.ArrayList;

public interface HerramientasDado {
    

public void generarCubilete(Jugador jugador,ArrayList<Dado> dadosTomados);
public void addDado(Dado dado);
public void getDado(Dado dado);
public void borrarDados();

}
