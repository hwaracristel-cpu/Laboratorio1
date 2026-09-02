/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author Cristal Pinaya
 */
public class cronometro {
    private long inicia;
    private long finaliza;

    public cronometro() {
        inicia = System.currentTimeMillis();
    }

    public void iniciar() {
        inicia = System.currentTimeMillis();
    }

    public void detener() {
        finaliza = System.currentTimeMillis();
    }

    public long lapsoDeTiempo() {
        return finaliza - inicia;
    }

    public long getInicia() {
        return inicia;
    }
    public long getFinaliza() {
        return finaliza;
     }
   }
