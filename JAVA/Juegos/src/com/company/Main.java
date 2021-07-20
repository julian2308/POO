package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario que desea");
        UsuarioJuego usuario1 = new UsuarioJuego("Julia", "soyrepro");
        usuario1.aumentarNivel();
        usuario1.aumentarPuntaje();
        usuario1.bonus(100);
        System.out.println("Tu puntaje es: " + usuario1.getPuntaje());
        System.out.println("Tu nivel es: " + usuario1.getNivel());
    }
}
