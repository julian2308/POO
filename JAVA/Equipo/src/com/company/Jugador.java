package com.company;

public class Jugador implements Comparable<Jugador>{

    private Integer numeroCamiseta;
    private String nombre;
    private Boolean esTitular;
    private Boolean estaLesionado;

    public Jugador(Integer numeroCamiseta, String nombre, Boolean esTitular, Boolean estaLesionado) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.esTitular = esTitular;
        this.estaLesionado = estaLesionado;
    }

    @Override
    public int compareTo(Jugador jugador) {

        //return this.numeroCamiseta.compareTo(jugador.numeroCamiseta);
        if (this.numeroCamiseta > jugador.numeroCamiseta){
            return 1;
        }
        if (this.numeroCamiseta < jugador.numeroCamiseta){  //Es lo mismo hacerlo de ambas formas :D
            return -1;
        }
        return 0;
    }

    public Boolean getEsTitular() {
        return esTitular;
    }

    public Boolean getEstaLesionado() {
        return estaLesionado;
    }

    @Override
    public String toString() {
        return numeroCamiseta + " " + nombre;
    }
}
