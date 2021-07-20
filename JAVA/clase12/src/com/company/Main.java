package com.company;

import com.company.Cuentas.Cuenta;
import com.company.Cuentas.CuentaCajaDeAhorra;
import com.company.Cuentas.CuentaComitente;
import com.company.Cuentas.CuentaCorriente;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(123,1234,1,"Perez");

        Cuenta cuenta = new CuentaCorriente(cliente,500.0,300.0);

        



    }
}
