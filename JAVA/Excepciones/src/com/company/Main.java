package com.company;

public class Main {

    public static void main(String[] args) {


        Cliente cliente = null;
        try {
            cliente = new Cliente("Emilio", "123", 1000.0, 500.0, 500.0);
        } catch (ClientesException e) {
            e.printStackTrace();
        }

        try {
            cliente.comprar(100000.0);
        }catch (Exception e){
            e.printStackTrace();
        }/*catch (NullPointerException e){
            System.out.println("El cliente esta en nulo");
        }*/

        System.out.println("Lleuge hasta aca");

    }
}
