package com.company;

public class Main {

    public static void main(String[] args) {

        Puerto buenosAires = new Puerto();
        Contenedor contenedor1 = new Contenedor(1, "Desconocida", true);
        buenosAires.ingresarContenedor(contenedor1);
        Contenedor contenedor2 = new Contenedor(3, "Colombia", true);
        buenosAires.ingresarContenedor(contenedor2);
        Contenedor contenedor3 = new Contenedor(2, "Chile", false);
        buenosAires.ingresarContenedor(contenedor3);

        System.out.println(buenosAires.calcularCantidadPeligrosos());
        buenosAires.mostrarOrdenado();





    }
}
