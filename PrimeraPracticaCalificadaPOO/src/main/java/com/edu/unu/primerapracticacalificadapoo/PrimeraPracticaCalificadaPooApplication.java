package com.edu.unu.primerapracticacalificadapoo;

import com.edu.unu.primerapracticacalificadapoo.classes.CuentaBancaria;
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
    }



}
