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

    public List<Jugador> obtenerReservas(){

        List<Jugador>jugadoresReserva = new ArrayList<>();
        for (int i = 18; i < jugadores.size(); i++){
            jugadoresReserva.add(jugadores.get(i));
        }


        return jugadoresReserva;
    }

    public void agregarJugador (Jugador jugador){
        jugadores.add(jugador);
    }

    public Integer cantidadJugadoresEnPosicion(String posicion) throws EquipoException{

        //toDo Crear la Exception aca
        if (!existeLaPosicion(posicion)){
            throw new EquipoException("La posicion " + posicion + " no existe dentro de los equipos");
        }


        Integer jugadoresEnPosicion = 0;
        for (Jugador jugador: jugadores) {
            if (jugador.getPosicion().equals(posicion)){
                jugadoresEnPosicion++;
            }
        }
        return jugadoresEnPosicion;
    }

    private Boolean existeLaPosicion(String posicion){
        List<String> posiciones = new ArrayList<>();
        posiciones.add("ARQUERO");
        posiciones.add("DEFENSOR");
        posiciones.add("MEDIOCAMPISTA");
        posiciones.add("DELANTERO");

        return posiciones.contains(posicion);
    }

}
