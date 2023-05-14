/*
 * MINIPROYECTO #2
 *
 * INTEGRANTES: 
 * Juan Camilo Capera Barrera
 * Juan Diego Castaño
 * Grupo 01 FPOE 
 *
 * PROFESOR: Luis Yohany Romo Portilla 
 */
package Logica;

import java.util.Calendar;

/**
 *
 * @author juan-
 */
public class Juego {
    private int cantAciertos;
    private int cantFallos;
    private int numeroPartida;
    private long tiempoJuego;
    private int puntajeTotal;
    
    public Juego(){
        tiempoJuego = Calendar.getInstance().getTimeInMillis();
    }
    
    public void actualizarDatos(boolean acerto) {
        if (acerto) {
            cantAciertos += 1;
            puntajeTotal += 100;
            numeroPartida += 1;
        } else {
            cantFallos += 1;
            numeroPartida +=1;
        }
    }

    public long getTiempoJuego() {
        long tiempoActual = Calendar.getInstance().getTimeInMillis();
        long tiempo = tiempoActual - tiempoJuego;
        return tiempo;
    }
    public int getNumeroPartida(){
        return numeroPartida;
    }

    public int getCantAciertos() {
        return cantAciertos;
    }

    public int getCantFallos() {
        return cantFallos;
    }
    
    public int getPuntajeTotal() {
        return puntajeTotal;
    }
}
