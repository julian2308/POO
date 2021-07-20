package com.company;

public class ArmaLarga extends Arma implements Comparable{

    private Boolean tieneSelloRenar;
    private  String descripcion;
    private Integer nivelArma;

    public ArmaLarga(Integer cantidadMunicion, Integer alcanceAproxEnMetros, String marca, Double calibre, String estado, Boolean tieneSelloRenar, String descripcion, Integer nivelArma) {
        super(cantidadMunicion, alcanceAproxEnMetros, marca, calibre, estado);
        this.tieneSelloRenar = tieneSelloRenar;
        this.descripcion = descripcion;
        this.nivelArma = nivelArma;
    }


    @Override
    public int compareTo(Object o) {
        ArmaLarga armaLargaAComparar = (ArmaLarga) o;
        int valor = 0;
        if (this.nivelArma > armaLargaAComparar.nivelArma){
            valor = 1;
            return valor;
        } if (this.nivelArma < armaLargaAComparar.nivelArma){
            valor = -1;
            return valor;
        }
        return valor;
    }
}
