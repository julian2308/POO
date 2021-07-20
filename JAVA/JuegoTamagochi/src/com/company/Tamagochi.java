package com.company;

import com.company.estados.Estado;
import com.company.estados.Feliz;

public class Tamagochi {

    private String nombre;
    private Estado estadoActual;

    public Tamagochi(String nombre){
        this.nombre = nombre;
        estadoActual = new Feliz();
    }

    public void darDeComer(){
        estadoActual = estadoActual.comer();
    }

    public void darDeBeber(){
        estadoActual = estadoActual.beber();
    }

    public void hacerMimos(){
        estadoActual = estadoActual.mimar();
    }

    public void imprimirEstado(){
        System.out.println(estadoActual);
    }
}
