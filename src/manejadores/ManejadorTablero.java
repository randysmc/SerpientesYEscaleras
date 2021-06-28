/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadores;

import enums.TipoCasilla;
import javax.swing.JButton;
import javax.swing.JPanel;
import tablero.BotonCasilla;
import tablero.*;

/**
 *
 * @author randysmc
 */
public class ManejadorTablero {
    
    private JPanel panelTablero;
    private JButton casillaBoton;
    private Casilla [][] distribucionCasillas;
    private int cantX, cantY;

    public ManejadorTablero(JPanel panelTablero, Casilla[][] distribucionCasillas, int cantX, int cantY) {
        this.panelTablero = panelTablero;
        this.distribucionCasillas = distribucionCasillas;
        this.cantX = cantX;
        this.cantY = cantY;
        dibujarTablero();
    }
    
    
    public void dibujarTablero(){
        for (int i = 0; i <cantX; i++) {
            for (int j = 0; j <cantY; j++) {
                Casilla casilla = this.distribucionCasillas[i][j];
                
                //this.distribucionCasillas[3][3].setTipoCasilla(TipoCasilla.ESCALERA);
                this.panelTablero.add(casilla.getCasilla());
                
            }
            
        }
    }

    
    
}
