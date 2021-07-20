package com.company;

public class Jirafa extends Mascota{

    private Double altura;

    public Jirafa(String nombre, Double altura){
        super(nombre, 50);
        this.altura = altura;
    }

    @Override
    public void hacerRuido() {
        System.out.println("Romromromrrrrrr");
    }
}
