package com.company.Cuentas;

import com.company.Cliente;
import com.company.Cuentas.Cuenta;
import com.company.GravadorImpuesto;

public class CuentaCorriente extends Cuenta implements GravadorImpuesto {


        private Double montoAutorizado;

        public CuentaCorriente(Cliente cliente, Double saldo, Double montoAutorizado) {
            super(cliente, saldo);
            this.montoAutorizado = montoAutorizado;
        }


        @Override
        public void extraer(Double monto) {
            if(monto <= getSaldo() + montoAutorizado){
                System.out.println("ser retiraron " + monto + " pesos");
                setSaldo(getSaldo() - monto);
                System.out.println("nuevo saldo: " + getSaldo());
            }else{
                System.out.println("saldo insuficiente");
            }
        }

        @Override
        public Double gravarImpuesto(Double porcentaje) {
            Double montoDescontar = getSaldo()* porcentaje;
            setSaldo(getSaldo() - montoDescontar);
            return montoDescontar;
        }

    }


