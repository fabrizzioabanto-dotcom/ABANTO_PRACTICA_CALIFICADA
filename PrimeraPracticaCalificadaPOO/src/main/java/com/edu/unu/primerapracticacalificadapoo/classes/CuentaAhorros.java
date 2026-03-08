package com.edu.unu.primerapracticacalificadapoo.classes;

public class CuentaAhorros extends CuentaBancaria{
    public CuentaAhorros(String nombrePropietario, double saldo, String dniPropietario, String moneda, boolean estadoCuenta) {
        super(nombrePropietario, saldo, dniPropietario, moneda, estadoCuenta);
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Cuenta de ahorros");
        if(monto <= getSaldo()){
            super.retirar(monto);
        }else{
            System.out.println("Cuenta de ahorros: No se puede retirar mas de su saldo.");
        }
    }
}
