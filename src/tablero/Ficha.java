package tablero;

import enums.TipoFicha;

public class Ficha {
    private char caracter;
    private int id;
    private TipoFicha tipoFicha;
    
    
    public Ficha(char caracter, int id, TipoFicha tipoFicha){
        this.caracter = caracter;
        this.id = id;
        this.tipoFicha = tipoFicha;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoFicha getTipoFicha() {
        return tipoFicha;
    }

    public void setTipoFicha(TipoFicha tipoFicha) {
        this.tipoFicha = tipoFicha;
    }
    
    
    
    
    
    
}
