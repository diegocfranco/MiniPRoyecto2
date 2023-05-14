/*
 * MINIPROYECTO #2
 *
 * INTEGRANTES: 
 * Juan Camilo Capera
 * Juan Diego Castaño
 *
 * Grupo 01 FPOE 
 *
 * PROFESOR: Luis Yohany Romo Portilla 
 */
package Modelo;

/**
 *
 * @author juan-
 */
public class Jugador {
    private String nombre;
    private String nombre1;
    private String nombre2;
    
    public Jugador(){
        nombre = "Jugador: ";
        nombre1 = "Jugador: ";
    }
    
    public Jugador(String nombre){
        this.nombre = nombre;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
    }

    public String getNombre() {
        return nombre;
        return nombre1;
        return nombre2;
    }

    public void setNombre(String nombre, String nombre1, String nombre2 ) {
        this.nombre = nombre;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
    }
}
