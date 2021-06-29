/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablero;

import enums.TipoFicha;


public class Ficha {
    private char caracter;
    private TipoFicha tipoFicha;

    public Ficha(char caracter, TipoFicha tipoFicha) {
        this.caracter = caracter;
        this.tipoFicha = tipoFicha;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public TipoFicha getTipoFicha() {
        return tipoFicha;
    }

    public void setTipoFicha(TipoFicha tipoFicha) {
        this.tipoFicha = tipoFicha;
    }
    
    
    
    
}
