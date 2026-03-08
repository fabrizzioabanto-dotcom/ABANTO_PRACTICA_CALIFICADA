package com.edu.unu.primerapracticacalificadapoo.classes;

public class CuentaCorriente extends CuentaBancaria{
    public CuentaCorriente(String nombrePropietario, double saldo, String dniPropietario, String moneda, boolean estadoCuenta) {
        super(nombrePropietario, saldo, dniPropietario, moneda, estadoCuenta);
    }
}
