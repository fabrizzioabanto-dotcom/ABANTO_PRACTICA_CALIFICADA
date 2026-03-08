package com.edu.unu.primerapracticacalificadapoo.AbstractClasses;

public class CuentaCorrienteAbs extends CuentaBancariaAbs{
    public CuentaCorrienteAbs(String nombrePropietario, double saldo, String dniPropietario, String moneda, boolean estadoCuenta) {
        super(nombrePropietario, saldo, dniPropietario, moneda, estadoCuenta);
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Cuenta corriente permite sobregiro");
        double nuevoSaldo = getSaldo() - monto;
        setSaldo(nuevoSaldo);
        System.out.println("Retiro realizado con exito");
        System.out.println("Saldo resultante: " + getSaldo());

        if(getSaldo()<0){
            System.out.println("La cuenta se encuentra en estado de sobregiro");
        }
    }
}
