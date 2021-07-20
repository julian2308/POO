package com.company;

public class Main {

    public static void main(String[] args) {

        Equipo equipo = new Equipo("C6");

        try {
            System.out.println(equipo.cantidadJugadoresEnPosicion("DELANTERO"));
        } catch (EquipoException e){
            e.printStackTrace();
        }


    }
}
