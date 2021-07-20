package com.company.Cuentas;

import com.company.Cliente;

public abstract class Cuenta {


        private Cliente cliente;
        private Double saldo;


        public Cuenta(Cliente cliente, Double saldo) {
            this.cliente = cliente;
            this.saldo = saldo;
        }

        public Cuenta(Cliente cliente){
            this.cliente = cliente;
            this.saldo = 0.0;
        }

        public void depositar(Double monto){
            System.out.println("se depositaron " + monto + " pesos");
            saldo += monto;
            System.out.println("tu nuevo saldo es de " + saldo);
        }

        public abstract void extraer(Double monto);

        protected Double getSaldo() {
            return saldo;
        }

        protected void setSaldo(Double saldo) {
            this.saldo = saldo;
        }
    }


