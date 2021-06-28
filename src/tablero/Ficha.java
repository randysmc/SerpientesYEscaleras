package tablero;

public class Ficha {
    private char caracter;
    private int id;
    
    
    public Ficha(char caracter, int id){
        this.caracter = caracter;
        this.id = id;
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
    
    
    
    
}
