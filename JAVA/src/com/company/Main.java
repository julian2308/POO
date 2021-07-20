package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*String nombre = "Victoria";
        int edad = 26;
        double altura = 1.61;

        String suma = nombre + edad + altura;


        System.out.println("Mi nombre es: " + nombre);*/

        // Scanner
        /* Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = scanner.nextLine();
        // System.out.println("Tu nombres es: " + nombre);
        System.out.println("Ingresa tu edad");
        Integer edad = scanner.nextInt();

        //Condicionales
        if (nombre.toLowerCase().equals("Nicolas")){
            System.out.println("Puedes subir");
        }else{
            System.out.println("No puedes subir");3
        }; */

        //Funciones
        // System.out.println(suma(2,2));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        Integer numeroAContar = scanner.nextInt();
        contarHasta(numeroAContar);

    }

    static void contarHasta(Integer numero){
        for(Integer i = 1; i <=numero; i++){
            System.out.println(i);
        }
    }

    static Integer suma(Integer numero1, Integer numero2){
        return numero1 + numero2;
    }

}
