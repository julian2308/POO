package com.company;

public class Main {

    public static void main(String[] args) {

        Mascota mascota = new Perro("Firuais", 100, "Pug");

        Perro perro = new Perro("Indiana", 10, "asd");
        Jirafa jirafa = new Jirafa("Profe", 5.0);

        perro.hacerRuido();
        jirafa.hacerRuido();
    }
}
