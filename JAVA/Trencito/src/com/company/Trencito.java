package com.company;

import java.util.ArrayList;
import java.util.List;

public class Trencito {

    private List<Calculable> calculables;

    public Trencito (){
        calculables = new ArrayList<>();
    }

    public void agregarCalculable(Calculable calculable) {
        calculables.add(calculable);
    }

    public Double calcularAreaTotal (){
        Double areaTotal = 0.0;
        for (Calculable calculable: calculables) {
            areaTotal += calculable.calcularArea();
        }
        return areaTotal;
    }

}
