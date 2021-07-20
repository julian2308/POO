package com.company;

import java.util.Objects;

public class Socio {

    private String numeroSocio;
    private String nombre;
    private Double cuotaMensual;
    private String actividad;

    public Socio(String numeroSocio, String nombre, Double cuotaMensual, String actividad) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.cuotaMensual = cuotaMensual;
        this.actividad = actividad;
    }

    public Double costoMensual(){
        return cuotaMensual;
    }

    //toString
    @Override
    public String toString(){
        return "nombre :" + nombre + " id: " + numeroSocio;
    }

    @Override
    public boolean equals (Object object) {
        if (object == null){
            return false;
        }
        if (object.getClass() != Socio.class){
            return false;
        }
        Socio socio = (Socio)object;
        return this.numeroSocio.equals(socio.numeroSocio);

    }

    @Override
    public int hashCode(){
        return Objects.hash(numeroSocio, nombre);
    }
}
