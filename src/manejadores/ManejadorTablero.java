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
import enums.TipoFicha;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import persona.Persona;
import tablero.Cuadro;
import tablero.Ficha;
import ventanas.VentanaJuego;

public class ManejadorTablero {

    private VentanaJuego ventanaJuego;
    private Cuadro[][] tablero;
    private JPanel tableroPanel;
    ArrayList<Persona> listaJugadores;
    private Ficha ficha;

    public ManejadorTablero(VentanaJuego ventanaJuego, Cuadro[][] tablero, JPanel tableroPanel) {
        this.ventanaJuego = ventanaJuego;
        this.tablero = tablero;
        this.tableroPanel = tableroPanel;
    }

    public void Jugar(int x, int y) {
        pintarTablero(x,y);
        

        tablero[0][0].setFicha(new Ficha('X', TipoFicha.JUGADOR1));
        tableroPanel.repaint();

    }

    public void pintarTablero(int x, int y) {


        this.tablero = new Cuadro[x][y];
        //Greed Layout para botones
        ventanaJuego.getTableroPanel().setLayout(new GridLayout(x, y));
        //panelTablero.setLayout(new GridLayout(x, y));
        String nombreC="";
        String nombreF="";

        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {

                if (i == 0 && j == 0) {
                    //this.tablero[i][j].setFicha(new Ficha('X', TipoFicha.JUGADOR1));
                    this.tablero[i][j] = new Cuadro(i, j, ventanaJuego.getTableroPanel(), this.ventanaJuego, EstadoCasilla.INICIO, "");
                    this.tablero[i][j].setBackground(Color.red);
                } else if (i == (x - 1) && j == (y - 1)) {
                    this.tablero[i][j] = new Cuadro(i, j, ventanaJuego.getTableroPanel(), this.ventanaJuego, EstadoCasilla.FIN, "");
                    this.tablero[i][j].setBackground(Color.BLACK);
                } else {
                    this.tablero[i][j] = new Cuadro(i, j, ventanaJuego.getTableroPanel(), this.ventanaJuego, EstadoCasilla.NORMAL, "" );

                }

            }

        }


        this.ventanaJuego.setVisible(true);
    }

    public void borrarTablero(int x, int y) {

        for (int i = 0; i < Integer.parseInt(ventanaJuego.getFilasTextF().getText()); i++) {
            for (int j = 0; j < Integer.parseInt(ventanaJuego.getColTextF().getText()); j++) {
                tablero[i][j] = null;
            }
            ventanaJuego.getTableroPanel().removeAll();
        }
        ventanaJuego.getTableroPanel().repaint();
    }

    public void iniciarTablero(Cuadro[][] tablero, int x, int y){
        
    }
    
    public void iniciarFicha(Cuadro[][] tablero, int x, int y){
        
    }
    
    public void casillaRetroceso(Cuadro[][] tablero, int x, int y){
        
    }
    public void casillaDados(Cuadro[][] tablero, int x, int y){
        
    }
    
    public void casillaSubida(Cuadro[][] tablero, int x, int y){
        
    }
    
    public void casillaAvanza(Cuadro[][] tablero, int x, int y){
        
    }
    
    public void casillaPierdeTurno(Cuadro [][] tablero, int x, int y){
        
    }
    
    public void casillaBajada(Cuadro[][] tablero, int x, int y){
        
    }

    public String nombreTableroCuadro(Cuadro[][] tablero, int x, int y) {
        String nombreC = "hola";
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (tablero[i][j].getEstadoCasilla() == EstadoCasilla.INICIO) {
                    nombreC = "Inicio";
                }
                if (tablero[i][j].getFicha().getTipoFicha() == TipoFicha.JUGADOR2) {
                    nombreC = "J2";
                }
                if (tablero[i][j].getFicha().getTipoFicha() == TipoFicha.JUGADOR3) {
                    nombreC = "J3";
                }
                if (tablero[i][j].getFicha().getTipoFicha() == TipoFicha.JUGADOR4) {
                    nombreC = "J4";
                }
            }
        }
        return nombreC;

    }

    public String nombreTableroFicha(Cuadro[][] tablero, int x, int y) {
        String nombreF = "";
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (tablero[i][j].getFicha().getTipoFicha() == TipoFicha.JUGADOR1) {
                    nombreF = "J1";
                }
                if (tablero[i][j].getFicha().getTipoFicha() == TipoFicha.JUGADOR2) {
                    nombreF = "J2";
                }
                if (tablero[i][j].getFicha().getTipoFicha() == TipoFicha.JUGADOR3) {
                    nombreF = "J3";
                }
                if (tablero[i][j].getFicha().getTipoFicha() == TipoFicha.JUGADOR4) {
                    nombreF = "J4";
                }
            }
        }
        return nombreF;

    }

}
