package com.company;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Comprable{

    private List<Comprable> productos;
    private Double porcentajeDescuento;

    public Combo(Double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
        productos = new ArrayList<>();
    }

    public void agregarProducto (Comprable comprable){
        productos.add(comprable);
    }

    @Override
    public Double informarPrecio() {
        Double sumaPrecios = 0.0;
        for (Comprable comprable:productos) {
            sumaPrecios += comprable.informarPrecio();
        }
        return sumaPrecios - (sumaPrecios*porcentajeDescuento);


    }
}
