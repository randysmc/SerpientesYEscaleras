package persona;

import java.util.Scanner;

public class VectorPersonas {
    
    Persona[] listaPersonas;
    private int contador;
    Scanner teclado = new Scanner(System.in);
    int x=5,y=5;
    private int[][]arreglo;
    
    public VectorPersonas(){
        //listaPersonas = new Persona[6];
        arreglo = new int[x][y];
        //contador =1;
        iniciarArreglo();
        mostrarArreglo();

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
    
    public void iniciarArreglo(){
        for (int i = 0; i <x; i++) {
            if(i%2 !=0){
                for (int j =(y-1); j >=0; j--) {
                    System.out.println("Ingresa el numero");
                    arreglo[i][j]= Integer.parseInt(teclado.nextLine());
                }
            }
            if(i%2 ==0){
                for(int j=0; j<y;j++){
                    System.out.println("Ingresa el numero");
                    arreglo[i][j]= Integer.parseInt(teclado.nextLine());
                }
            }
            
        }
    }
    
    public void mostrarArreglo(){
        for (int i = 0; i <x; i++) {
            for (int j = 0; j <y; j++) {
                System.out.print(arreglo[i][j]+"\t");
                
                
            }
            System.out.println("");
            
        }

    }
    
        
    
}
