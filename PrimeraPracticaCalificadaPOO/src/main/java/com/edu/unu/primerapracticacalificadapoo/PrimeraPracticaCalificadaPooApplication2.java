package com.edu.unu.primerapracticacalificadapoo;

import com.edu.unu.primerapracticacalificadapoo.AbstractClasses.CuentaAhorroAbs;
import com.edu.unu.primerapracticacalificadapoo.AbstractClasses.CuentaBancariaAbs;
import com.edu.unu.primerapracticacalificadapoo.AbstractClasses.CuentaCorrienteAbs;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeraPracticaCalificadaPooApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(PrimeraPracticaCalificadaPooApplication2.class, args);

        CuentaBancariaAbs cuentaAhorrosAbs1 = new CuentaAhorroAbs(
                "Jose",
                1500,
                "12345678",
                "PEN",
                true
        );

        CuentaBancariaAbs cuentaCorrientesAbs1 = new CuentaCorrienteAbs(
                "Juan",
                1000,
                "12345677",
                "PEN",
                true
        );

        cuentaAhorrosAbs1.retirar(2000);
        cuentaCorrientesAbs1.retirar(5000);
        cuentaAhorrosAbs1.consultarSueldo();
        cuentaCorrientesAbs1.consultarSueldo();


    }

}
