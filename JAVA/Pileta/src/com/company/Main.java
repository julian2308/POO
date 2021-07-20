package com.company;

public class Main {

    public static void main(String[] args) {

        Socio primerSocio = new Socio("1", "Lean", 1000.0, "Futbol");
        Socio segundoSocio = new Socio("2", "Luciana", 2000.0, "Tennis");
        /* System.out.println(primerSocio.costoMensual());
        System.out.println(primerSocio.equals(segundoSocio));*/

        /*System.out.println(primerSocio.hashCode());
        System.out.println(segundoSocio.hashCode());*/

        SocioHabilitado socioHabilitado = new SocioHabilitado("3", "Guido",3000.0, "Polo", false);

        System.out.println(socioHabilitado.costoMensual());



    }
}
