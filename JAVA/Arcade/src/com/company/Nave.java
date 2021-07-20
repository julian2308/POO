package com.company;

public class Nave extends ObjetoGrafico{
    private Double velocidad;
    private Integer vida;

    public Nave(Integer posx, Integer posy, char direccion, Double velocidad, Integer vida) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida = vida;
    }

    @Override
    public void irA(Integer posx, Integer posy, char direccion) {
        if (getDireccion() == direccion){
            super.irA(posx, posy, direccion);
        } else {
            girar(direccion);
            setPosx(posx);
            setPosy(posy);
        }

    }

    public void girar(char direccion){
         setDireccion(direccion);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Nave{" +
                "velocidad=" + velocidad +
                ", vida=" + vida +
                '}';
    }
}


