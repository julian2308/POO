package com.company;

import java.util.Date;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;


    Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion) throws PacienteException
    {   Date hoy= new Date();
        this.nombre=nombre;
        this.apellido=apellido;
        fechaAlta=null;
        if (fechaInternacion.before(hoy))
            this.fechaInternacion=fechaInternacion;
        if (fechaInternacion.after(hoy)) throw new PacienteException("La fehca de internacion no puede ser mayor al dia actual");


    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta) throws PacienteException
    {
        if (fechaAlta.after(fechaInternacion)) {
            System.out.println("Ok");
            this.fechaAlta = fechaAlta;
        }
        else if(fechaAlta.before(fechaInternacion)) {
            throw new PacienteException("La fecha de alta no puede ser anterior a la fecha de internacion");
        }
        else
            System.out.println("No se puede");
    }



}
