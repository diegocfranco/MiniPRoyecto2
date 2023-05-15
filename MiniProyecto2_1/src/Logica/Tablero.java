/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package Logica;

/**
 *
 * @author juandiego
 */
public class Tablero {
    
    private char [][] matrizTablero={ {' ',' ',' '},
                                      {' ',' ',' '},
                                      {' ',' ',' '}
                                    } ;
    
    
    public Tablero(){
       
    }
    
    public char ganador(){
        char ganador =' ';
        for(int i=0;i<3;i++){
            if(matrizTablero[i][0]==matrizTablero[i][1]&& matrizTablero[i][0]==matrizTablero[i][2]&&matrizTablero[i][2]!=' '){
                ganador=matrizTablero[i][0];
                break;
            }
            else if(matrizTablero[0][i]==matrizTablero[1][i]&& matrizTablero[0][i]==matrizTablero[2][i]&&matrizTablero[0][i]!=' '){
                ganador=matrizTablero[0][i];
                break;
            } 
            else if(matrizTablero[0][0]==matrizTablero[1][1]&& matrizTablero[0][0]==matrizTablero[2][2]&&matrizTablero[0][0]!=' '){
                ganador=matrizTablero[0][0];
                break;
            }
            else if(matrizTablero[0][2]==matrizTablero[1][1]&& matrizTablero[0][2]==matrizTablero[2][0]&&matrizTablero[0][2]!=' '){
                ganador=matrizTablero[0][2];
                break;
            } 
        }
        
        return ganador;
    }
    
    public void reiniciarTablero(){
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrizTablero[i][j]=' ';
        }   }  
    }
    

    
    public char getPosTablero(int posx,int posy){
        
        return matrizTablero[posx][posy];
    }
    
    private void setX(int posx,int posy){
        
        if(matrizTablero[posx][posy]!='o' &&matrizTablero[posx][posy]!='x' ){
            matrizTablero[posx][posy]='x';}
        
    }

    private void setO(int posx,int posy){
        
        if(matrizTablero[posx][posy]!='o' &&matrizTablero[posx][posy]!='x' ){
            matrizTablero[posx][posy]='o';}

    }
    
 
  public void fichaPorTurno(int turno,int posx,int posy){
  
      if(turno%2==0){
          setX(posx,posy);
      }
      if(turno%2==1){
          setO(posx,posy);
      }      
  }
    
    
}   
    
        
        
        

