package tablero;

import enums.TipoCasilla;
import javax.swing.*;


public class CreadorCasilla {
    
    
    public static Casilla[][] creadorTablero(int casillasX, int casillasY){
        Casilla tablero;
        
        Casilla[][] casilla = new Casilla[casillasX][casillasY];
        for (int i = 0; i < casillasX; i++) {
            for(int j=0; j<casillasY; j++){
                BotonCasilla jboton = new BotonCasilla((i+1), (j+1), "fil" +(i+1)+" C" +(j+1));
                jboton.addMouseListener(new java .awt.event.MouseAdapter(){
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt){
                        BotonCasilla boton = (BotonCasilla)evt.getComponent(); //casteamos el evento para que sea de tipo JBoton
                        JOptionPane.showMessageDialog(null, boton.getNumFilas() +" " + boton.getNumColumnas());

                    }
                    
                });
                        tablero = new Casilla(TipoCasilla.NORMAL, jboton);
                        casilla[i][j]  = tablero;
            }

        }
        return casilla;
        
    }
    
    
    
    
}
