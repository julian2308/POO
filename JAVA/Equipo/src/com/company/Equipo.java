package com.company;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombre;
    private List<Jugador> jugadores;

    public Equipo(String nombre){
        this.nombre = nombre;
        jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }

    public Integer getCantidadJugadoresLesionados(){
        //Contador en cero
        Integer cantidadLesionados = 0;
        for (Jugador jugador: jugadores){
            if (jugador.getEsTitular() && jugador.getEstaLesionado()){
                cantidadLesionados++;
            }
        }


        return cantidadLesionados;
    }

    public void mostrarJugadoresTitulares(){
        List<Jugador> jugadoresTitulares = new ArrayList<>();

        for (Jugador jugador : jugadores) {
            if (jugador.getEsTitular()){
                jugadoresTitulares.add(jugador);
            }
        }

        jugadoresTitulares.sort(null);

        // System.out.println(jugadoresTitulares);

        for (Jugador jugadorTitular : jugadoresTitulares){
            System.out.println(jugadorTitular   );
        }
    }

}
