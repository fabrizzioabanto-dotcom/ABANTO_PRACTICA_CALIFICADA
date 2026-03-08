package com.edu.unu.primerapracticacalificadapoo.AbstractClasses;

public abstract class CuentaBancariaAbs {
    private String nombrePropietario;
    private double saldo;
    private String dniPropietario;
    private String moneda;
    private boolean estadoCuenta;

    public CuentaBancariaAbs(String nombrePropietario, double saldo, String dniPropietario, String moneda, boolean estadoCuenta) {
        this.nombrePropietario = nombrePropietario;
        this.saldo = saldo;
        this.dniPropietario = dniPropietario;
        this.moneda = moneda;
        this.estadoCuenta = estadoCuenta;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDniPropietario() {
        return dniPropietario;
    }

    public void setDniPropietario(String dniPropietario) {
        this.dniPropietario = dniPropietario;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public boolean isEstadoCuenta() {
        return estadoCuenta;
    }

    public void setEstadoCuenta(boolean estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }

    public abstract void retirar(double monto);

    public void consultarSueldo(){
        System.out.println("Saldo actual de la cuenta" + numeroCuenta + ": " + saldo);
    }
}
