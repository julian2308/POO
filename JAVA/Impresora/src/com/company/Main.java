package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Impresora impresora = new Impresora("HP", "USB",new Date(), 100);

        Impresora otraImpresora = new Impresora("Epson", "wifi", 100);

        impresora.imprimir("Hola");
        otraImpresora.imprimir("Hola");
    }
}
