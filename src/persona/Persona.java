
package persona;




public class Persona {
    
    private int id=1;
    private String nombre;
    private String apellido;
    private int partidasJugadas=0;
    private int partidasGanadas=0;
    private int partidasPerdidas=0;
    private static int aumentarId;


    public Persona(String nombre, String apellido) {
        this.id =Persona.aumentarId();
        this.nombre = nombre;
        this.apellido = apellido;
        

    }
    
    static {
        aumentarId=0;
    
}
    
    private static int aumentarId(){
        return ++aumentarId;
    }

    @Override
    public String toString() {
        return "Jugador: " + "id: " + id + " Nombre: " + nombre + "\tApellido:"  + apellido + "\tPartidas Jugadas: "
                + partidasJugadas + "  Partidas Ganadas: " + partidasGanadas + " PartidasPerdidas: " + partidasPerdidas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }
    
    
    
    
    
}
