package com.company;

public class ArmaCorta extends Arma{
    private Boolean esAutomatica;

    public ArmaCorta(Integer cantidadMunicion, Integer alcanceAproxEnMetros, String marca, Double calibre, String estado, Boolean esAutomatica) {
        super(cantidadMunicion, alcanceAproxEnMetros, marca, calibre, estado);
        this.esAutomatica = esAutomatica;
    }

    public Boolean alcanceMayor200Metros(){
        return super.getAlcanceAproxEnMetros() > 200;
    }
}
