import java.util.Scanner;

public class Desafios3 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner (System.in);
//        System.out.println("Ingresa tu nombre de Gamer");
//        String nombre1 = scanner.nextLine();
//        System.out.println("Ingresa tu nombre de Gamer");
//        String nombre2 = scanner.nextLine();
//        System.out.println("Ingresa la primera jugada");
//
//
//
//
//    cualGana(85,1);
//    }
//    public static Integer cualGana (String opcion1, String opcion2) {
//        // Piedra = 1. Papel = 2. Tijera = 3
//        Integer puntaje1 = 0;
//        Integer puntaje2 = 0;
//        if (opcion1.equals(opcion2)){
//            System.out.println("Hubo un empate");;
//        } else if ((opcion1-opcion2)%3==(1)){
//            puntaje1++;
//            System.out.println("Ganador jugador 1");
//        } else {
//            puntaje2++;
//            System.out.println("Ganador jugador 2");
//        } return 0;
//    }
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresar la cantidad de numeros primos deseados");
    Integer cantidadPrimos = scanner.nextInt();
    primerosPrimos(cantidadPrimos);


    }
    static boolean esDivisible(int n, int divisor) {
        boolean bool = n % divisor == 0;
        return bool;
    }

    static boolean esPrimo(int p){
        int cont=0;

        for (int i = 2; i < p; i++) {
            if (esDivisible(p,i)) {
                cont++;
            }

        }
        return cont == 0 && p>1;
    }

    static void primerosPrimos (Integer n){
        Integer contador = 0;
        Integer contador2 = 1;
        while (contador2 <= n ){
            if (esPrimo(contador)){
                System.out.println(contador);
                contador2++;
            } contador++;
        }
    }

}
