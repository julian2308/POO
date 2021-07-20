package com.company;

public class ObjetoGrafico {
    private Integer posx;
    private Integer posy;
    private char direccion;

    public ObjetoGrafico(Integer posx, Integer posy, char direccion) {
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }
    public void irA (Integer posx, Integer posy, char direccion){
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }

    public char getDireccion() {
        return direccion;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }

    public void setPosx(Integer posx) {
        this.posx = posx;
    }

    public void setPosy(Integer posy) {
        this.posy = posy;
    }

    @Override
    public String toString() {
        return "ObjetoGrafico{" +
                "posx = " + posx +
                ", posy = " + posy +
                ", direccion = " + direccion +
                '}';
    }


}
