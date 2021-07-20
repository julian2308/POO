package com.company;

public abstract class Arma {
    private Integer cantidadMunicion;
    private Integer alcanceAproxEnMetros;
    private String marca;
    private Double calibre;
    private String estado;

    public Arma(Integer cantidadMunicion, Integer alcanceAproxEnMetros, String marca, Double calibre, String estado) {
        this.cantidadMunicion = cantidadMunicion;
        this.alcanceAproxEnMetros = alcanceAproxEnMetros;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }

    public Boolean usarEnEnfrentamiento(){
        return estado.equals("EN USO") && calibre >= 9;
    }

    public Integer getAlcanceAproxEnMetros() {
        return alcanceAproxEnMetros;
    }
}
