/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJE3;

import java.util.Scanner;

/**
 *
 * @author Mi Pc
 */
public class TestEcuacionCuadratica {
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese a, b, c: ");

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        EcuacionCuadratica ecuacion =  new EcuacionCuadratica(a, b, c);

        double discriminante = ecuacion.getDiscriminante();

        if (discriminante > 0) {

            System.out.printf(
                    "La ecuacion tiene dos raices %.5f y %.5f%n",
                    ecuacion.getRaiz1(),
                    ecuacion.getRaiz2()
            );

        } else if (discriminante == 0) {

            System.out.printf(
                    "La ecuacion tiene una raiz %.0f%n",
                    ecuacion.getRaiz1()
            );

        } else {

            System.out.println(
                    "La ecuacion no tiene raices reales"
            );
        }
        entrada.close();
    }
}

