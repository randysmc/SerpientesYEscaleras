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

    public Tablero(int cantX, int cantY) {
        this.casilla = CreadorCasilla.creadorTablero(cantX, cantY);
    }

    public Casilla[][] getCasilla() {
        return casilla;
    }

    public void setCasilla(Casilla[][] casilla) {
        this.casilla = casilla;
    }
    
    
    
    
    
    
}
