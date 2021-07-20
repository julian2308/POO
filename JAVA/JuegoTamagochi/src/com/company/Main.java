package com.company;

public class Main {

    public static void main(String[] args) {
	    Tamagochi tamagochi = new Tamagochi("Lean");

	    tamagochi.imprimirEstado();
	    tamagochi.darDeBeber();
		tamagochi.imprimirEstado();
	    tamagochi.darDeComer();
		tamagochi.imprimirEstado();
	    tamagochi.darDeBeber();
	    tamagochi.imprimirEstado();
	    tamagochi.hacerMimos();
	    tamagochi.imprimirEstado();
    }
}
