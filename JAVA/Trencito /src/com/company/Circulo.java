package com.company;

public class Circulo implements Calculable{

    private Double radio;

    public Circulo (Double radio){
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {
        return Math.PI*radio*radio;
    }
}
