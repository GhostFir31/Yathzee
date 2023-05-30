package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Cubilete {

    ArrayList<Dado> cubilete ;

    public Cubilete() {

         cubilete=new ArrayList<>();

    }

    public Dado getCubilete(int i) {

        return cubilete.get(i);

    }


    @Override
    public String toString() {
        return "Cubilete " +
                 cubilete
                ;
    }
}
