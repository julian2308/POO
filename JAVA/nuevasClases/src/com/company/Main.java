package com.company;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Batman");

        Cliente cliente1 = new Cliente(2, "Lean");

        cliente.incrementarDeuda(150.0);

        cliente.incrementarDeuda(350.0);

        System.out.println(cliente.getDeuda());


    }
}
