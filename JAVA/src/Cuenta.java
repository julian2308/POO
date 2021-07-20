public class Cuenta {
    private int numeroDeCuenta;
    private Double saldo;

    public static void depositar (cantidadDeDinero) {
        saldo += cantidadDeDinero;
    }
    public  static void retirar (cantidadDeDinero) {
        if(saldo >= cantidadDeDinero){
            saldo = saldo - cantidadDeDinero;}
    }

    //no tocar esta funcion
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
