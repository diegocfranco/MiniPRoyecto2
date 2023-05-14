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
package Vista;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author juan-
 */
public final class JuegoGUI extends JFrame {
    private PanelConImagen jpFondoInicio;
    private JButton btnUnJugador;
    private JButton btnDosJugadores;
    
    public JuegoGUI(){
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        //Configuración de la ventana
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,600);
        setLocationRelativeTo(null);
        setVisible(true); 
        setResizable(false);
 
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        
        
        //Configuración del Encabezado
        jpFondoInicio = new PanelConImagen("/Juego.png"); 
        jpFondoInicio.setSize(800,600);     
        jpFondoInicio.setLayout(null);
        add(jpFondoInicio);
    }
}
