/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJE4;

import java.util.Scanner;

/**
 *
 * @author Mi Pc
 */
public class TestEstadistica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.print("Ingrese 10 números: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = entrada.nextDouble();
        }

        Estadistica estadistica = new Estadistica(numeros);

        System.out.printf("El promedio es %.2f%n", estadistica.promedio());
        System.out.printf("La desviacion estandar es %.5f%n", estadistica.desviacion());

        entrada.close();
    }
}

