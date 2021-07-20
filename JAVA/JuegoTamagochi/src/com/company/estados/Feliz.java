package com.company.estados;

public class Feliz implements Estado {
    @Override
    public Estado comer() {
        return new Sediento();
    }

    @Override
    public Estado beber() {
        return new Hambriento();
    }

    @Override
    public Estado mimar() {
        return this;
    }
}
