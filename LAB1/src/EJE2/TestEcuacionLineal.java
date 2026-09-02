/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJE2;

import java.util.Scanner;

/**
 *
 * @author Mi Pc
 */
public class TestEcuacionLineal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese a, b, c, d, e, f: ");

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        double d = entrada.nextDouble();
        double e = entrada.nextDouble();
        double f = entrada.nextDouble();

        
        EcuacionLineal ecuacion =
                new EcuacionLineal(a, b, c, d, e, f);

        if (ecuacion.tieneSolucion()) {

            System.out.println("x = " + ecuacion.getX());
            System.out.println("y = " + ecuacion.getY());

        } else {

            System.out.println("La ecuacion no tiene solucion");
        }

        entrada.close();
    }
}
