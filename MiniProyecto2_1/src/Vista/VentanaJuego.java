package Vista;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Modelo.Jugador;

/**
 *
 * @author juandiego
 */
public class VentanaJuego extends JFrame{
    private PanelConImagen jpFondoJuego;
    private JLabel lblJugador1;
    private JLabel lblJugador2;
    private JLabel label1 ;
    private JLabel label2 ;
    private JLabel label3 ;
    private JLabel label4 ;
    private JLabel label5 ;
    private JLabel label6 ;
    private JLabel label7 ;
    private JLabel label8 ;
    private JLabel label9 ;
    private JLabel lblRonda;
    private JLabel lblNumRonda;
    private JButton btnFinalizar;
    
    
    
     public VentanaJuego(){
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
        jpFondoJuego = new PanelConImagen("/juego.png"); 
        jpFondoJuego.setSize(800,600);     
        jpFondoJuego.setLayout(null);
        add(jpFondoJuego);
        lblRonda = new JLabel();
        lblJugador1 = new JLabel();
        lblJugador2 = new JLabel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        lblNumRonda = new JLabel();
        btnFinalizar = new JButton();
        
        lblRonda.setBounds(500,30, 291,94);
        ImageIcon icono = new ImageIcon("src/ronda.png");
        lblRonda.setIcon(icono);
        
        icono = new ImageIcon("src/Jugador1.png");
        lblJugador1.setIcon(icono);
        lblJugador1.setBounds(500,200, 291,94);
            
        icono = new ImageIcon("src/Jugador2.png");
        lblJugador2.setIcon(icono);
        lblJugador2.setBounds(500,300, 291,94);

        
        lblNumRonda.setBounds(620,130, 41,41);
        icono = new ImageIcon("src/1.png");
        lblNumRonda.setIcon(icono);
        
        label1.setBounds(30,55, 145,145);
        icono = new ImageIcon("src/cuadro.png");
        label1.setIcon(icono);        
        
        label2.setBounds(191,55, 145,145);
        label2.setIcon(icono);
        
        label3.setBounds(350,55, 145,145);
        label3.setIcon(icono);
        
        label4.setBounds(30,213, 145,145);
        label4.setIcon(icono);
        
        label5.setBounds(191,213, 145,145);
        label5.setIcon(icono);
        
        label6.setBounds(350,213, 145,145);
        label6.setIcon(icono);    

        label7.setBounds(30,371, 145,145);
        label7.setIcon(icono);
        
        label8.setBounds(191,371, 145,145);
        label8.setIcon(icono);
        
        label9.setBounds(350,371, 145,145);
        label9.setIcon(icono);
        
        icono = new ImageIcon("src/finalizar.png");
        btnFinalizar.setIcon(icono);
        btnFinalizar.setContentAreaFilled(false);
        btnFinalizar.setBounds(520,450, 250,75);
        
        
        jpFondoJuego.add( lblJugador1);        
        jpFondoJuego.add( lblJugador2);        
        jpFondoJuego.add( label1);
        jpFondoJuego.add( label2);
        jpFondoJuego.add( label3);
        jpFondoJuego.add( label4);
        jpFondoJuego.add( label5);
        jpFondoJuego.add( label6);
        jpFondoJuego.add( label7);
        jpFondoJuego.add( label8);
        jpFondoJuego.add( label9);
        jpFondoJuego.add( lblRonda);
        jpFondoJuego.add( lblNumRonda);
        jpFondoJuego.add( btnFinalizar);
        
        VentanaJuego.ManejadorDeEventos manejadorEventos = new VentanaJuego.ManejadorDeEventos();
        
        label1.addMouseListener(manejadorEventos);
        label2.addMouseListener(manejadorEventos);
        label3.addMouseListener(manejadorEventos);
        label4.addMouseListener(manejadorEventos);
        label5.addMouseListener(manejadorEventos);
        label6.addMouseListener(manejadorEventos);
        label7.addMouseListener(manejadorEventos);
        label8.addMouseListener(manejadorEventos);
        label9.addMouseListener(manejadorEventos);        
        
        
 
        
}
        class ManejadorDeEventos implements ActionListener, KeyListener,MouseListener{
        @Override
        public void actionPerformed(ActionEvent evento){           

        }
        
        @Override
        public void keyReleased(KeyEvent e) {
           /* System.out.println("Se liberó la tecla " + e.getKeyChar() +
                    " Con codigo " + e.getKeyCode());*/

        }
        
        @Override
        public void keyPressed(KeyEvent e) {
            /*System.out.println("Se presionó la tecla " + e.getKeyChar()+
                    " Con codigo " + e.getKeyCode());*/
            
        }
        
        @Override
        public void keyTyped(KeyEvent e) {
            /*System.out.println("Se digitó la tecla " + e.getKeyChar()+
                    " Con codigo " + e.getKeyCode());*/
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            
            if(e.getSource() == label1){
                label1.setIcon(new ImageIcon("src/x.png"));
            }
            if(e.getSource() == label2){
                label2.setIcon(new ImageIcon("src/o.png"));
            }
            if(e.getSource() == label3){
                label3.setIcon(new ImageIcon("src/x.png"));
            }
            if(e.getSource() == label4){
                label4.setIcon(new ImageIcon("src/o.png"));
            }
            if(e.getSource() == label5){
                label5.setIcon(new ImageIcon("src/x.png"));
            }
            if(e.getSource() == label6){
                label6.setIcon(new ImageIcon("src/o.png"));
            }
            if(e.getSource() == label7){
                label7.setIcon(new ImageIcon("src/x.png"));
            }
            if(e.getSource() == label8){
                label8.setIcon(new ImageIcon("src/o.png"));
            }
            if(e.getSource() == label9){
                label9.setIcon(new ImageIcon("src/x.png"));
            }            
                
          
        }

        @Override
        public void mousePressed(MouseEvent e) {
           
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {         
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            
           
        }
               
    } 
}
