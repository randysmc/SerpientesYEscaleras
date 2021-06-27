/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablero;

import enums.TipoCasilla;
import interfaz.ComportamientoCasilla;


public class Casillas implements ComportamientoCasilla{
    
    private TipoCasilla tipoCasilla;
    private BotonCasilla casilla;

    public Casillas(TipoCasilla tipoCasilla, BotonCasilla casilla) {
        this.tipoCasilla = tipoCasilla;
        this.casilla = casilla;
    }
    
    
    
    
    

    public TipoCasilla getTipoCasilla() {
        return tipoCasilla;
    }

    public void setTipoCasilla(TipoCasilla tipoCasilla) {
        this.tipoCasilla = tipoCasilla;
    }

    public BotonCasilla getCasilla() {
        return casilla;
    }

    public void setCasilla(BotonCasilla casilla) {
        this.casilla = casilla;
    }
    
    
    
    

    @Override
    public void adelantarCasilla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void retrocederCasilla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dobleTurno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pierdeTurno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
