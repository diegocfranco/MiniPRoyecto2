package Vista;


import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;





public final class PanelNombres extends JFrame {
    
    
    private PanelConImagen jpFondoNombres;
    private JButton btnIniciar;
    private JLabel lblNumeroRondas;
    private JButton btnRonda1;
    private JButton btnRonda2;
    private JButton btnRonda3;
    private JButton btnRonda4;
    private JLabel lblJugador1;
    private JLabel lblJugador2;
    private JTextField jTextJugador1;
    private JTextField jTextJugador2 ;
    

    
    public PanelNombres(){
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
        
        jpFondoNombres = new PanelConImagen("/inicioJuego.png"); 
        jpFondoNombres.setSize(800,600);     
        jpFondoNombres.setLayout(null);
        add(jpFondoNombres);

        
      
        ManejadorDeEventos manejadorEventos = new ManejadorDeEventos();
        
}
    public void unJugador(){

        lblJugador1 = new JLabel();
        jTextJugador1 = new JTextField();
        btnIniciar = new JButton();
        lblNumeroRondas = new JLabel();
        btnRonda1 = new JButton();
        btnRonda2 = new JButton();
        btnRonda3 = new JButton();
        btnRonda4 = new JButton();    
        
        
        
        ImageIcon icono = new ImageIcon("src/Jugador1.png");
        lblJugador1.setIcon(icono);
        
        icono = new ImageIcon("src/iniciar.png");
        btnIniciar.setIcon(icono);
        btnIniciar.setContentAreaFilled(false);        
            
        icono = new ImageIcon("src/rondas.png");
        lblNumeroRondas.setIcon(icono);
        
        icono = new ImageIcon("src/1.png");
        btnRonda1.setIcon(icono);
        btnRonda1.setContentAreaFilled(false);


        icono = new ImageIcon("src/2.png");
        btnRonda2.setIcon(icono);
        btnRonda2.setContentAreaFilled(false);
            
            
        icono = new ImageIcon("src/3.png");
        btnRonda3.setIcon(icono);
        btnRonda3.setContentAreaFilled(false);
            
        icono = new ImageIcon("src/4.png");
        btnRonda4.setIcon(icono);
        btnRonda4.setContentAreaFilled(false);
        
        lblJugador1.setBounds(520,145, 259,83);    
        jTextJugador1.setBounds(520,245, 250,44);
        btnIniciar.setBounds(545,450, 193,75);
        lblNumeroRondas.setBounds(540,300, 259,83);
        btnRonda1.setBounds(540,380, 41,41);
        btnRonda2.setBounds(595,380, 41,41);
        btnRonda3.setBounds(650,380, 41,41);
        btnRonda4.setBounds(705,380, 41,41);
        
        
        jpFondoNombres.add(btnIniciar);
        jpFondoNombres.add(lblJugador1);
        jpFondoNombres.add(jTextJugador1);
        jpFondoNombres.add(lblNumeroRondas);
        jpFondoNombres.add(btnRonda1);
        jpFondoNombres.add(btnRonda2);
        jpFondoNombres.add(btnRonda3);
        jpFondoNombres.add(btnRonda4);        
        
        
        
        
        
    }
    public void dosJugadores(){
        
            btnRonda1 = new JButton();
            btnRonda2 = new JButton();
            btnRonda3 = new JButton();
            btnRonda4 = new JButton();  
            btnIniciar = new JButton();
            lblNumeroRondas = new JLabel();
            lblJugador1 = new JLabel();
            lblJugador2 = new JLabel();
            jTextJugador1 = new JTextField();
            jTextJugador2 = new JTextField();            
            
            
            ImageIcon icono = new ImageIcon("src/Jugador1.png");
            lblJugador1.setIcon(icono);
            
            icono = new ImageIcon("src/iniciar.png");
            btnIniciar.setIcon(icono);
            btnIniciar.setContentAreaFilled(false);        
            
                  
            icono = new ImageIcon("src/Jugador2.png");
            lblJugador2.setIcon(icono);
            
            icono = new ImageIcon("src/rondas.png");
            lblNumeroRondas.setIcon(icono);
            
            icono = new ImageIcon("src/1.png");
            btnRonda1.setIcon(icono);
            btnRonda1.setContentAreaFilled(false);

            
            
            icono = new ImageIcon("src/2.png");
            btnRonda2.setIcon(icono);
            btnRonda2.setContentAreaFilled(false);
            
            
            icono = new ImageIcon("src/3.png");
            btnRonda3.setIcon(icono);
            btnRonda3.setContentAreaFilled(false);
            
            icono = new ImageIcon("src/4.png");
            btnRonda4.setIcon(icono);
            btnRonda4.setContentAreaFilled(false);

            
            lblJugador1.setBounds(520,45, 259,83);
            lblJugador2.setBounds(520,195, 259,83);
            
            jTextJugador1.setBounds(520,125, 250,44);
            jTextJugador2.setBounds(520,270, 250,44);
            
            lblNumeroRondas.setBounds(540,320, 259,83);
            btnRonda1.setBounds(540,390, 41,41);
            btnRonda2.setBounds(595,390, 41,41);
            btnRonda3.setBounds(650,390, 41,41);
            btnRonda4.setBounds(705,390, 41,41);
            
             btnIniciar.setBounds(545,450, 193,75);

            
            jpFondoNombres.add(btnIniciar);
            jpFondoNombres.add(lblJugador1);
            jpFondoNombres.add(lblJugador2);
            jpFondoNombres.add(jTextJugador2);
            jpFondoNombres.add(jTextJugador1);
            jpFondoNombres.add(lblNumeroRondas);
            jpFondoNombres.add(btnRonda1);
            jpFondoNombres.add(btnRonda2);
            jpFondoNombres.add(btnRonda3);
            jpFondoNombres.add(btnRonda4);
    }
      
    
            class ManejadorDeEventos implements ActionListener, KeyListener{
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
               
    }
           
    
}
