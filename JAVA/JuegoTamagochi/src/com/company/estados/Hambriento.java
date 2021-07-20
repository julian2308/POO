package com.company.estados;

public class Hambriento implements Estado{
    @Override
    public Estado comer() {
        return new Feliz();
    }

    @Override
    public Estado beber() {
        return this;
    }

    @Override
    public Estado mimar() {
        return new Triste();
    }
}
