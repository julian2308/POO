public class ejercitacion {
    public static void main(String[] args) {
    /* Hacer una función que reciba como parámetro dos valores y devuelva un boolean. La
    función debe comprobar si el primer número es divisible por el segundo.
    boolean esDivisible(int n, int divisor)
    NOTA: Que sea divisible quiere decir que al dividir da un valor exacto, es decir, sin
    decimales.*/
     // System.out.println(esDivisible(10,6));

    /*Hacer una función que dado un número indica si es un número primo o no. Un número
    primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo,
    ya que 25 es divisible por 1, 5 y 25. 17 sí es primo porque solo se puede dividir por 1 y por
    17.
    Usar esta función en un programa, que permita el ingreso de un número y luego llame a la
    función desarrollada para comprobar si es primo o no. Para resolverlo usar la función
    obtenida en el ejercicio desarrollado en la clase asincrónica. boolean esDivisible(int n, int
    divisor)*/

        /* boolean prime = isPrime(1000000000);
        System.out.println(prime);*/
    /*Escribir una función que reciba tres números y devuelva el máximo entre los tres números.
    Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer
    unNumeroC)
    Luego hacer un programa que permita el ingreso de 3 valores, utilice la función y muestre
    el resultado.    */

    };
    static boolean esDivisible (Integer n, Integer divisor) {
        if (n%divisor == 0) {
            return true;
        } else {
            return false;
        }

    }
    static boolean isPrime (Integer number){
        boolean prime;
        Integer count = 0;
        for (int i = 2; i <=number ; i++) {
            prime = esDivisible(number, i);
            if (prime){
                System.out.println(i);
                count++;
            }
        }
        if (count > 2){
            return false;
        }

        return true;
    }

}
