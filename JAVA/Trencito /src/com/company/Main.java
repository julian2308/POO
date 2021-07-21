package com.company;

public class Main {

    public static void main(String[] args) {
		Rectangulo rec1 = new Rectangulo(5.0, 4.0);
		Rectangulo rec2 = new Rectangulo(6.0, 4.0);
		Circulo cir1 = new Circulo(1.0);
		Circulo cir2 = new Circulo(1.0);
		Circulo cir3 = new Circulo(1.0);
		Triangulo tri1 = new Triangulo(2.0, 2.0);
		FiguraCompuesta vagon1 = new FiguraCompuesta();

		vagon1.agregarCalculable(cir1);
		vagon1.agregarCalculable(cir2);
		vagon1.agregarCalculable(cir3);
		vagon1.agregarCalculable(rec1);

		System.out.println(vagon1.calcularArea());

		FiguraCompuesta locomotora1 = new FiguraCompuesta();

		locomotora1.agregarCalculable(cir1);
		locomotora1.agregarCalculable(cir2);

		System.out.println(locomotora1.calcularArea());

		Trencito batmansTrain = new Trencito();
		batmansTrain.agregarCalculable(vagon1);
		batmansTrain.agregarCalculable(locomotora1);
		System.out.println(batmansTrain.calcularAreaTotal());

    }
}
