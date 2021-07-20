package com.company;

public class Cliente {

    private String nombre;
    private String dni;
    private Double saldo;
    private Double limite;
    private Double deuda;

    public Cliente(String nombre, String dni, Double saldo, Double limite, Double deuda) throws ClientesException{
        if (saldo < 0){
            throw new ClientesException("Estas inicializando un cliente con saldo negativo");
        }
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = saldo;
        this.limite = limite;
        this.deuda = deuda;
    }

    public void comprar(Double monto) throws ClientesException{
        if(monto > limite){
            throw new ClientesException("Estas intentando comprar mas que tu limite");
        }

        if (saldo >= monto){
            saldo -= monto;
        }else {
            deuda += monto - saldo;
            saldo = 0.0;
        }

    }
}
