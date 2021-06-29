/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablero;


/**
 *
 * @author randysmc
 */
import enums.EstadoCasilla;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import ventanas.VentanaJuego;



public class Cuadro extends JButton {

    int posX, posY;
    
    private EstadoCasilla estadoCasilla;
    private Ficha ficha;


    VentanaJuego ventanaJuego;

    public Cuadro(int posX, int posY,JPanel panel, VentanaJuego ventanaJuego ,EstadoCasilla estadoCasilla ,String text) {
        super(text);
        panel.add(this);
        this.estadoCasilla = estadoCasilla;
        this.posX = posX;
        this.posY = posY;
        this.ventanaJuego = ventanaJuego;
    }

    @Override
    public String toString() {
        return "" + estadoCasilla ;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }
    
    
    

    public EstadoCasilla getEstadoCasilla() {
        return estadoCasilla;
    }

    public void setEstadoCasilla(EstadoCasilla estadoCasilla) {
        this.estadoCasilla = estadoCasilla;
    }

    public VentanaJuego getVentanaJuego() {
        return ventanaJuego;
    }

    public void setVentana(VentanaJuego ventanaJuego) {
        this.ventanaJuego = ventanaJuego;
    }
    
    
    
    
    
    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

}
