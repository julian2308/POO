package com.company;

import java.util.ArrayList;
import java.util.List;

public class Puerto {
    private List<Contenedor> contenedores;

    public Puerto() {
        this.contenedores = new ArrayList<>();
    }

    public void ingresarContenedor(Contenedor contenedor){
        contenedores.add(contenedor);
    }

    public void mostrarOrdenado(){
        List<Contenedor> contenedoresOrdenados = new ArrayList<>();
        for ( Contenedor contedor: contenedores) {
            contenedoresOrdenados.add(contedor);
        }
        contenedoresOrdenados.sort(null);
        System.out.println(contenedoresOrdenados);
        System.out.println(contenedores);
    }

    public Integer calcularCantidadPeligrosos(){
        Integer cantidadPeligrosos = 0;
        for (Contenedor contedor:contenedores ) {
            if (contedor.getPais().equals("Desconocida") && contedor.getMarcaPeligroso()){
                cantidadPeligrosos++;
            }
        }
        return cantidadPeligrosos;
    }
}
