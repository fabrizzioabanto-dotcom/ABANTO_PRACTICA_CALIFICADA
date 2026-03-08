package com.edu.unu.primerapracticacalificadapoo.AbstractClasses;

public class CuentaAhorroAbs extends CuentaBancariaAbs{

    public CuentaAhorroAbs(String nombrePropietario, double saldo, String dniPropietario, String moneda, boolean estadoCuenta) {
        super(nombrePropietario, saldo, dniPropietario, moneda, estadoCuenta);
    }

    @Override
    public void retirar(double monto) {
        if(monto <= getSaldo()){
            setSaldo(getSaldo()-monto);
            System.out.println("Retiro realizado");
        }else{
            System.out.println("Cuenta de ahorros: No se puede retirar mas de su saldo.");
        }
    }
}
