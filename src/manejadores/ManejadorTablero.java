/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadores;

/**
 *
 * @author randysmc
 */
import enums.EstadoCasilla;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import tablero.Cuadro;
import ventanas.VentanaJuego;


public class ManejadorTablero {
    
    private VentanaJuego ventanaJuego;
    private Cuadro[][] tablero;
    private JPanel tableroPanel;

    public ManejadorTablero(VentanaJuego ventanaJuego, Cuadro[][] tablero, JPanel tableroPanel) {
        this.ventanaJuego = ventanaJuego;
        this.tablero = tablero;
        this.tableroPanel = tableroPanel;
    }



    
    
        public void pintarTablero() {
        int x = Integer.parseInt(ventanaJuego.getFilasTextF().getText());
        int y = Integer.parseInt(ventanaJuego.getColTextF().getText());
        String nombre = "";
        this.tablero = new Cuadro[x][y];
        //Greed Layout para botones
        ventanaJuego.getTableroPanel().setLayout(new GridLayout(x,y));
        //panelTablero.setLayout(new GridLayout(x, y));
        for (int i = 0; i < x; i++) {
            
            for (int j = 0; j < y; j++) {
                
                
                if(i==0 && j==0){
                    this.tablero[i][j] = new Cuadro(i,j,ventanaJuego.getTableroPanel(),this.ventanaJuego,EstadoCasilla.INICIO ,nombre);
                    this.tablero[i][j].setBackground(Color.red);
                }else{
                    this.tablero[i][j] = new Cuadro(i,j,ventanaJuego.getTableroPanel(),this.ventanaJuego,EstadoCasilla.NORMAL,nombre);
                }/*if(i== (x-1) && j== (y-1)){
                    this.tablero[i][j] = new Cuadro(i,j,ventanaJuego.getTableroPanel(), this.ventanaJuego, EstadoCasilla.FIN, nombre);
                    this.tablero[i][j].setBackground(Color.BLACK);
                }*/

            }
            
        }

        this.ventanaJuego.setVisible(true);
    }

    public void borrarTablero() {
        for (int i = 0; i < Integer.parseInt(ventanaJuego.getFilasTextF().getText()); i++) {
            for (int j = 0; j < Integer.parseInt(ventanaJuego.getColTextF().getText()); j++) {
                tablero[i][j] = null;
            }
            ventanaJuego.getTableroPanel().removeAll();
        }
        ventanaJuego.getTableroPanel().repaint();
    }
    
    
    
    
    
}
