package com.company;

public class Main {

    public static void main(String[] args) {
	Equipo equipo = new Equipo("Huracan");

	equipo.agregarJugador(new Jugador(1, "Liam", true, true));
	equipo.agregarJugador(new Jugador(5, "Lean", true, false));
	equipo.agregarJugador(new Jugador(3, "Diego", false, false));
	equipo.agregarJugador(new Jugador(2, "Leo", true, true));
	equipo.agregarJugador(new Jugador(4, "Emilio", true, true));

	//System.out.println(equipo.getCantidadJugadoresLesionados());

	equipo.mostrarJugadoresTitulares();

    }


}
