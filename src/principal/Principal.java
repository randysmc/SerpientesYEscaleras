
package principal;
import controladorArchivos.CargarDatosDesdeArchivo;
import static controladorArchivos.ManejarArchivo.borrarDirectorio;
import java.io.File;
import javax.swing.JFrame;
import persona.*;
import ventanas.*;


public class Principal {
    
    public static void main(String[] args) {
        
        
        
        //borrarDirectorio(new File("/home/abnerhl/datos"));
        /*String path = "src/sinErrores.txt";
        CargarDatosDesdeArchivo cargarDatosDesdeArchivo = new CargarDatosDesdeArchivo();
        cargarDatosDesdeArchivo.cargarDatos(path);
        */
        
        
        
        VentanaInicio ventanaInit =new VentanaInicio();
        
        
    }
    
}
