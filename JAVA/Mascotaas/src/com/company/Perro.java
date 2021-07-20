package com.company;

public class Perro extends Mascota{

    private String raza;

    public Perro(String nombre, Integer energia, String raza) {
        super(nombre, energia);
        this.raza = raza;
    }

    @Override
    public void hacerRuido() {
        System.out.println("Guau guau");
    }

    public void pasear(){
        System.out.println("Estoy paseando");
    }
}
