package com.company;

import java.net.PortUnreachableException;
import java.util.Date;

public class Impresora {
    //Atributos
    private  String modelo;
    private  String tipoConexion;
    private Date fechaFabricacion;
    private Integer hojasDisponibles;

    //Constructor con todos los atributos

    public Impresora(String modelo, String tipoConexion, Date fechaFabricacion, Integer hojasDisponibles) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
        this.hojasDisponibles = hojasDisponibles;
    }


    //Constructor con hojas por default
    public Impresora (String modelo, String tipoConexion, Integer hojasDisponibles){
        hojasDisponibles = 0;
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.hojasDisponibles = hojasDisponibles;
    }

    private Boolean tienePapel (){
        return hojasDisponibles > 0;
    }

    public void imprimir(String texto){
        if(tienePapel()){
            System.out.println(texto);
            hojasDisponibles--;
        }else {
            System.out.println("No tengo papel");
        }
    }
}


