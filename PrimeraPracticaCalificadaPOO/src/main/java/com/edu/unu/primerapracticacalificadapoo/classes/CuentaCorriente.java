package com.edu.unu.primerapracticacalificadapoo.classes;

public class CuentaCorriente extends CuentaBancaria{
    public CuentaCorriente(String nombrePropietario, double saldo, String dniPropietario, String moneda, boolean estadoCuenta) {
        super(nombrePropietario, saldo, dniPropietario, moneda, estadoCuenta);
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Cuenta corriente permite sobregiro");
        double nuevoSaldo = getSaldo() - monto;
        setSaldo(nuevoSaldo);

        System.out.println("Retiro realizado");
        System.out.println("Nuevo saldo:" + getSaldo());
    }
}
