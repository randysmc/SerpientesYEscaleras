
package tablero;

import enums.TipoCasilla;
import javax.swing.JButton;



public class BotonCasilla extends JButton{
    private int numFilas;
    private int numColumnas;
    private TipoCasilla tipoCasilla;
    

    public BotonCasilla(int numFilas, int numColumnas) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
    }

    public BotonCasilla(int numFilas, int numColumnas, String text) {
        super(text);
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
    }

    public TipoCasilla getTipoCasilla() {
        return tipoCasilla;
    }

    public void setTipoCasilla(TipoCasilla tipoCasilla) {
        this.tipoCasilla = tipoCasilla;
    }
    
    



    public int getNumFilas() {
        return numFilas;
    }

    public void setNumFilas(int numFilas) {
        this.numFilas = numFilas;
    }

    public int getNumColumnas() {
        return numColumnas;
    }

    public void setNumColumnas(int numColumnas) {
        this.numColumnas = numColumnas;
    }
    
}
