package Vista;


import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;





public final class PanelNombres extends JFrame {
    
    
    private PanelConImagen jpFondoInicio;
    private JButton btnUnJugador;
    private JButton btnDosJugadores;
    
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
        jpFondoInicio = new PanelConImagen("/inicioJuego.png"); 
        jpFondoInicio.setSize(800,600);     
        jpFondoInicio.setLayout(null);
        add(jpFondoInicio);

        
      
        ManejadorDeEventos manejadorEventos = new ManejadorDeEventos();
        
        btnUnJugador.addActionListener(manejadorEventos);
        btnDosJugadores.addActionListener(manejadorEventos);
        
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
           
       




    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
