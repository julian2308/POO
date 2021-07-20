package com.company;

public class Main {

    public static void main(String[] args) {

        Producto hamburguesa = new Producto("hamburguesa", 5.0);
        Producto papasFritas = new Producto("PapasFritas", 1.5);
        Producto gaseosa = new Producto("Gaseosa", 1.0);
        Producto helado = new Producto("Helado", 2.5);

        Combo combo1 = new Combo(0.20);
        combo1.agregarProducto(hamburguesa);
        combo1.agregarProducto(papasFritas);
        combo1.agregarProducto(gaseosa);

        Combo combo2 = new Combo(0.25);
        combo2.agregarProducto(combo1);
        combo2.agregarProducto(combo1);
        combo2.agregarProducto(helado);
        combo2.agregarProducto(helado);

        Combo combo3 = new Combo(0.10);
        combo3.agregarProducto(combo1);
        combo3.agregarProducto(papasFritas);
        combo3.agregarProducto(combo2);
        combo3.agregarProducto(hamburguesa);

        Carrito carrito = new Carrito();
        carrito.agregarProductos(combo1);
        carrito.agregarProductos(combo2);
        carrito.agregarProductos(combo3);
        carrito.agregarProductos(helado);

        System.out.println(carrito.calcularPrecio());
    }
}
