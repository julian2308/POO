import java.util.Scanner;

public class clase3 {
    public static void main(String[] args) {
        //Que el usuario ingrese el nombre
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de su perro");
        String nombre = scanner.nextLine();
        //Que el usuario ingrese la cantidad de comida que consume el perro}
        System.out.println("Ingrese la cantidad de comida que come su perro habitualmente");
        Double cantidadParaLlenarse = scanner.nextDouble();
        System.out.println(nombre + " come " + cantidadParaLlenarse + " kilos para llenarse");

        //Crear una función que calcule cuantos paquetes comio el perro
        Integer cantidadPaquetes = cuantosPaquetesComio(cantidadParaLlenarse);
        System.out.println(nombre + " consumio " + cantidadPaquetes + " para estar lleno");
    }

    public static  Integer cuantosPaquetesComio(Double cantidadParaLlenarse){
        Scanner scanner = new Scanner(System.in);
        Double  cantidadConsumida = 0.0;
        Integer cantidadDePaquetes = 0;
        while(cantidadConsumida < cantidadParaLlenarse){
            System.out.println("Ingresa el peso del paquete: ");
            Double pesoPaquete = scanner.nextDouble();
            cantidadConsumida += pesoPaquete;
            cantidadDePaquetes++;
        }
        return cantidadDePaquetes;
    }
}
// Debuggear en la tarde
