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
import Logica.Tablero;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author juandiego
 */
public class VentanaJuego extends JFrame{
    private PanelConImagen jpFondoJuego;
    private JLabel lblJugador1;
    private JLabel lblJugador2;
    private JLabel lblNomJugador1;
    private JLabel lblNomJugador2;    
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
    private Jugador jugadorT;
    private Tablero tablero;
    private int turno; 
    private int ronda;
    
    
    
     public VentanaJuego(Jugador jugador){
        jugadorT = jugador;
        tablero = new Tablero();
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
        ronda =1;
        turno=0;
 
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        
        
        //Configuración del Encabezado
        jpFondoJuego = new PanelConImagen("/juego.png"); 
        jpFondoJuego.setSize(800,600);     
        jpFondoJuego.setLayout(null);
        add(jpFondoJuego);
        lblRonda = new JLabel();
        lblJugador1 = new JLabel();
        lblJugador2 = new JLabel();
        lblNomJugador1 = new JLabel(jugadorT.getNombre1());
        lblNomJugador2 = new JLabel(jugadorT.getNombre2());        
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
        
        
        lblNomJugador1.setFont(new Font("arial", 1, 50)); 
        lblNomJugador1.setForeground(new Color(250,250,250));
        lblNomJugador1.setBounds(530,250, 291,94);
            
        lblNomJugador2.setBounds(530,350, 291,94);
        lblNomJugador2.setFont(new Font("arial", 1, 50)); 
        lblNomJugador2.setForeground(new Color(250,250,250));

        
        lblNumRonda.setBounds(620,130, 41,41);
        icono = new ImageIcon("src/"+ronda+".png");
        lblNumRonda.setIcon(icono);
        
        label1.setBounds(30,55, 145,145);
        label2.setBounds(191,55, 145,145);
        label3.setBounds(350,55, 145,145);
        label4.setBounds(30,213, 145,145);
        label5.setBounds(191,213, 145,145);
        label6.setBounds(350,213, 145,145);
        label7.setBounds(30,371, 145,145);
        label8.setBounds(191,371, 145,145);
        label9.setBounds(350,371, 145,145);

        icono = new ImageIcon("src/finalizar.png");
        btnFinalizar.setIcon(icono);
        btnFinalizar.setContentAreaFilled(false);
        btnFinalizar.setBounds(520,450, 250,75);
        
        
        jpFondoJuego.add( lblJugador1);        
        jpFondoJuego.add( lblJugador2);        
        jpFondoJuego.add( lblNomJugador1);        
        jpFondoJuego.add( lblNomJugador2); 
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
    public void alguienGano(){
        
        if(tablero.ganador()){
            JOptionPane.showMessageDialog(null,"alguien gano¡");
            turno=0;
            tablero.reiniciarTablero();
            ronda++;
            ImageIcon icono  = new ImageIcon("src/"+ronda+".png");
            lblNumRonda.setIcon(icono);
            ImprimeTablero();
            
        }
    }
    
    
    public void ImprimeTablero(){
       
        ImageIcon icono = new ImageIcon("src/"+ tablero.getPosTablero(0,0)+".png");
        label1.setIcon(icono);
        icono = new ImageIcon("src/"+ tablero.getPosTablero(0,1)+".png");
        label2.setIcon(icono);
        icono = new ImageIcon("src/"+ tablero.getPosTablero(0,2)+".png");
        label3.setIcon(icono);
        icono = new ImageIcon("src/"+ tablero.getPosTablero(1,0)+".png");        
        label4.setIcon(icono);
        icono = new ImageIcon("src/"+ tablero.getPosTablero(1,1)+".png");        
        label5.setIcon(icono);
        icono = new ImageIcon("src/"+ tablero.getPosTablero(1,2)+".png");        
        label6.setIcon(icono);
        icono = new ImageIcon("src/"+ tablero.getPosTablero(2,0)+".png");        
        label7.setIcon(icono);
        icono = new ImageIcon("src/"+ tablero.getPosTablero(2,1)+".png");        
        label8.setIcon(icono);
        icono = new ImageIcon("src/"+ tablero.getPosTablero(2,2)+".png");        
        label9.setIcon(icono);
               
    
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
                tablero.fichaPorTurno(turno,0,0);
                ImprimeTablero();
                turno++;
                alguienGano();
            }
            if(e.getSource() == label2){
                tablero.fichaPorTurno(turno,0,1);
                ImprimeTablero();
                turno++;
                alguienGano();
            }
            if(e.getSource() == label3){
                tablero.fichaPorTurno(turno,0,2);
                ImprimeTablero();
                turno++;
                alguienGano();
            }
            if(e.getSource() == label4){
                tablero.fichaPorTurno(turno,1,0);
                ImprimeTablero();
                turno++;
                alguienGano();
            }
            if(e.getSource() == label5){
                tablero.fichaPorTurno(turno,1,1);
                ImprimeTablero();
                turno++;
                alguienGano();
            }
            if(e.getSource() == label6){
                tablero.fichaPorTurno(turno,1,2);
                ImprimeTablero();
                turno++;
                alguienGano();
            }
            if(e.getSource() == label7){
                tablero.fichaPorTurno(turno,2,0);
                ImprimeTablero();
                turno++;
                alguienGano();
            }
            if(e.getSource() == label8){
                tablero.fichaPorTurno(turno,2,1);
                ImprimeTablero();
                turno++;
                alguienGano();
            }
            if(e.getSource() == label9){
                tablero.fichaPorTurno(turno,2,2);
                ImprimeTablero();
                turno++;
                alguienGano();
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
