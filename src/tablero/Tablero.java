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
    public class Tablero {
    private Casilla [][] casilla;
    private Ficha ficha;
    

    public Tablero(int cantX, int cantY, int cantJugadores) {
        this.casilla = CreadorCasilla.creadorTablero(cantX, cantY, cantJugadores);
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }
    

    public Casilla[][] getCasilla() {
        return casilla;
    }

    public void setCasilla(Casilla[][] casilla) {
        this.casilla = casilla;
    }
    
    
    
    
    
    
}