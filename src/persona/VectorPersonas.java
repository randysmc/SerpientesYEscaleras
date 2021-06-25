package persona;

import java.util.Scanner;

public class VectorPersonas {
    
    Persona[] listaPersonas;
    private int contador;
    Scanner teclado = new Scanner(System.in);
    
    public VectorPersonas(){
        listaPersonas = new Persona[6];
        contador =1;
        agregarJugador();
        agregarJugador();
        agregarJugador();
        mostrarJugadores();
        agregarJugador();
        mostrarJugadores();
    }
    
    public void agregarJugador(){
        System.out.println("Ingrese su nombre");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = teclado.nextLine();
        System.out.println("Ingrese su edad");
        int edad = Integer.parseInt(teclado.nextLine());
        listaPersonas[contador-1] = new Persona(contador,nombre,apellido,edad);
        contador++;
        
    }
    
    public void mostrarJugadores(){
        for(int i=0; i<(contador-1);i++){
            System.out.println(listaPersonas[i].toString());
        }
    }
        
    
}
