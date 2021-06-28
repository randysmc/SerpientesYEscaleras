package tablero;

import enums.TipoCasilla;
import interfaz.ComportamientoCasilla;

public class Casilla implements ComportamientoCasilla {

    private TipoCasilla tipoCasilla;
    private BotonCasilla casilla;
    private Ficha ficha;

    public Casilla(TipoCasilla tipoCasilla, BotonCasilla casilla) {
        this.tipoCasilla = tipoCasilla;
        this.casilla = casilla;
    }

    @Override
    public String toString() {
        return ""+ tipoCasilla;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
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
