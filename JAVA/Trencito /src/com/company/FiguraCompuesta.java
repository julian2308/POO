package com.company;

import java.util.ArrayList;
import java.util.List;

public class FiguraCompuesta implements Calculable{
    private List<Calculable> calculables;

    public FiguraCompuesta (){
        calculables = new ArrayList<>();
    }

    public void agregarCalculable(Calculable calculable){
        calculables.add(calculable);
    }

    @Override
    public Double calcularArea() {
        Double areaTotal = 0.0;
        for (Calculable calculable: calculables) {
            areaTotal += calculable.calcularArea();
        }
        return areaTotal;

    }
}
