package com.company;

public class Asteroide extends ObjetoGrafico{
    private Integer lesion;

    public Asteroide(Integer posx, Integer posy, char direccion, Integer lesion) {
        super(posx, posy, direccion);
        this.lesion = lesion;
    }

    @Override
    public void irA(Integer posx, Integer posy, char direccion) {
        super.irA(posx, posy, direccion);
    }
}
