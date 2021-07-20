package com.company.Cuentas;

import com.company.Cliente;
import com.company.Cuentas.Cuenta;
import com.company.GravadorImpuesto;

public class CuentaComitente extends Cuenta {

    private String cnv;

    public CuentaComitente(Cliente cliente, Double saldo, String cnv) {
        super(cliente, saldo);
        this.cnv = cnv;
    }

    @Override
    public void extraer(Double monto){
    if(monto <= getSaldo()/2){
        setSaldo(getSaldo()-monto);
        System.out.println("su nuevo saldo es de " + getSaldo());
    }else{
        System.out.println("saldo insuficiente, ingrese el codigo cnv para poder retirar mas dinero");
    }
    }
    public void extraer(Double monto, String codigo){
        if(codigo.equals(cnv)){
            if(monto <= getSaldo()){
                System.out.println("retiraste " + monto);
                setSaldo(getSaldo()-monto);
                System.out.println("nuevo Saldo " + getSaldo());
            }else{
                System.out.println("saldo insuficiente");
            }
        }else{
            System.out.println("pusiste mal el codigo");
        }
    }
    @Override
    public void depositar(Double monto){
        setSaldo(getSaldo() + 0.99*monto);
        System.out.println("su nuevo saldo es " + getSaldo());
    }}




