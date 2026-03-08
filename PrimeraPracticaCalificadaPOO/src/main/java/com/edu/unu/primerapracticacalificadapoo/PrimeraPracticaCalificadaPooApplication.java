package com.edu.unu.primerapracticacalificadapoo;

import com.edu.unu.primerapracticacalificadapoo.classes.CuentaAhorros;
import com.edu.unu.primerapracticacalificadapoo.classes.CuentaBancaria;
import com.edu.unu.primerapracticacalificadapoo.classes.CuentaCorriente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeraPracticaCalificadaPooApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrimeraPracticaCalificadaPooApplication.class, args);

        CuentaBancaria cuenta1 = new CuentaBancaria(
                "Fabrizzio",
                1500,
                "12345678",
                "PEN",
                true
        );

        cuenta1.depositar(500);
        cuenta1.consultarSaldo();
        cuenta1.retirar(600);
        cuenta1.consultarSaldo();

        System.out.println("\n POLIMORFISMO");

        CuentaAhorros cuentaAhorrosPo1 = new CuentaAhorros(
                "Juan",
                1500,
                "1234567",
                "PEN",
                true
        );

        CuentaCorriente cuentaCorrientePo1 = new CuentaCorriente(
                "Pedro",
                1500,
                "1234567",
                "PEN",
                true
        );

        cuentaAhorrosPo1.retirar(1600);
        cuentaCorrientePo1.retirar(2000);
        cuentaAhorrosPo1.consultarSaldo();
        cuentaCorrientePo1.consultarSaldo();

    }



}
