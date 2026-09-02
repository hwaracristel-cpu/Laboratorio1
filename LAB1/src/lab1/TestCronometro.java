/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import java.util.Random;

/**
 *
 * @author Mi Pc
 */
public class TestCronometro {
    public static void main(String[] args) {

        int cantidad = 100000;
        int[] numeros = new int[cantidad];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(1000000);
        }

        cronometro cronometro = new cronometro();

        cronometro.iniciar();
        for (int i = 0; i < numeros.length - 1; i++) {

            int indiceMenor = i;

            for (int j = i + 1; j < numeros.length; j++) {

                if (numeros[j] < numeros[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            int temporal = numeros[i];
            numeros[i] = numeros[indiceMenor];
            numeros[indiceMenor] = temporal;
        }

        cronometro.detener();

        System.out.println("Tiempo de ordenacion:");
        System.out.println(cronometro.lapsoDeTiempo() + " milisegundos" );
    }
}
