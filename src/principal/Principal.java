
package principal;
import persona.*;
import ventanas.VentanaBienvenida;


public class Principal {
    
    public static void main(String[] args) {
       VentanaBienvenida ventana = new VentanaBienvenida();
       ventana.setTitle("Serpientes & Escaleras");
       ventana.setDefaultCloseOperation(1);
       ventana.setVisible(true);
       
    }
    
}
