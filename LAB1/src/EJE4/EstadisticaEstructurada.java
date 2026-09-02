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
public class EstadisticaEstructurada {
    public static double promedio(double[] datos) {
        double suma = 0;
        for (double val : datos) {
            suma += val;
        }
        return suma / datos.length;
    }

    public static double desviacion(double[] datos) {
        double prom = promedio(datos);
        double sumaDiferencias = 0;
        for (double val : datos) {
            sumaDiferencias += Math.pow(val - prom, 2);
        }
        return Math.sqrt(sumaDiferencias / (datos.length - 1));
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = entrada.nextDouble();
        }

        System.out.printf("El promedio es %.2f%n", promedio(numeros));
        System.out.printf("La desviacion estandar es %.5f%n", desviacion(numeros));

        entrada.close();
    }
}

