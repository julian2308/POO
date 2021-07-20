package com.company.estados;

public class Triste implements Estado {
    @Override
    public Estado comer() {
        System.out.println("Beep Beep");
        System.out.println("Estoy vomitando");
        return this;
    }

    @Override
    public Estado beber() {
        System.out.println("Beep Beep Beep");
        System.out.println("");
        return this;
    }

    @Override
    public Estado mimar() {
        return new Feliz();
    }
}
