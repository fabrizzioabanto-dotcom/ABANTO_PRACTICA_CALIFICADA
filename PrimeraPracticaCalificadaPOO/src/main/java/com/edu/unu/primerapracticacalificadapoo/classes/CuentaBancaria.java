package com.edu.unu.primerapracticacalificadapoo.classes;

public class CuentaBancaria {
    private String nombrePropietario;
    private double saldo;
    private String dniPropietario;
    private String moneda;
    private boolean estadoCuenta;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String nombrePropietario, double saldo, String dniPropietario, String moneda, boolean estadoCuenta) {
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

    public void depositar(double monto){
        if(monto <= 0){
            System.out.println("Monto invalido");
            return;
        }else{
            System.out.println("Deposuto realizado");
            saldo += monto;
        }
    }

    public void retirar(double monto){
        if(monto <= saldo){
            saldo -=monto;
            System.out.println("Retiro realizado");
        }else{
            System.out.println("Saldo insuficiente");
        }

    }

    public void consultarSaldo(){
        System.out.println("Saldo actual del propietario " + nombrePropietario + " es: " + saldo);
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "nombrePropietario='" + nombrePropietario + '\'' +
                ", saldo=" + saldo +
                ", dniPropietario='" + dniPropietario + '\'' +
                ", moneda='" + moneda + '\'' +
                ", estadoCuenta=" + estadoCuenta +
                '}';
    }
}
