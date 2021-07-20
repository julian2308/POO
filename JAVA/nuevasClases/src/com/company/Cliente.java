package com.company;

public class Cliente {

    //Atributos
    private Integer numeroCliente;
    private String nombre;
    private Double deuda;

    //Constructor
    public Cliente (Integer numeroCliente, String nombre){
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.deuda = 0.0;
    }

    //Metodos
    public void incrementarDeuda(Double monto){
        deuda += monto;
    }

    public void pagarDeuda (){
        System.out.println("Tu deuda fue saldada");
        deuda = 0.0;
    }


    //Getters y setters
    public Double getDeuda(){
        return deuda;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setNumeroCliente(Integer numeroCliente) {
        this.numeroCliente = numeroCliente;
    }
}
