package com.company;

public class SocioHabilitado extends Socio {

    private Double costoPileta;
    private Boolean habilitado;


    public SocioHabilitado(String numeroSocio, String nombre, Double cuotaMensual, String actividad, Boolean habilitado) {
        super(numeroSocio, nombre, cuotaMensual, actividad);
        this.habilitado = habilitado;
        costoPileta = 500.0;
    }

    @Override
    public Double costoMensual() {
        if (habilitado){
            return super.costoMensual() + costoPileta;
        }else {
            return super.costoMensual();
        }
    }
}
