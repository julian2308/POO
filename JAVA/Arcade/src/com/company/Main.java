package com.company;

public class Main {

    public static void main(String[] args) {


        Nave nave1 = new Nave(2,3, 'N', 3.0, 8);
        nave1.irA(5, 7, 'N');
        System.out.println(nave1.toString());
        nave1.irA(7,9,'S');
        System.out.println(nave1.toString());
    }
}
