package controladorArchivos;



import java.io.Serializable;
import java.util.ArrayList;
import static controladorArchivos.GenerarObjetos.*;
import controladorArchivos.GenerarObjetos;
import controladorArchivos.ManejarArchivo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author randysmc
 */
public class CargarDatosDesdeArchivo {
    
    //static String path = "src/main/resources/conErrores.txt";
    GenerarObjetos generarObjetos = new GenerarObjetos();

    /**
     * Carga los datos de un archivo .txt
     * @param path ruta del archivo del cualse vana a cargar los datos.
     */
    public void cargarDatos(String path) {
        ArrayList<String> datos = ManejarArchivo.leerArchivo(path);

        for (int i = 0; i < datos.size(); i++) {
            int indice = i + 1;
            //Retorna un arreglo de argumentos
            String[] parametros = obtenerParametros(datos.get(i));

            if (datos.get(i).startsWith("tablero")) {
                generarObjetos.generarTablero(parametros, indice);
            } else if (datos.get(i).startsWith("retrocede")) {
                generarObjetos.generarCasillaRetroceso(parametros, indice);
            } else if (datos.get(i).startsWith("tiradados")) {
                generarObjetos.generarCasillaTirarDado(parametros, indice);
            } else if (datos.get(i).startsWith("subida")) {
                generarObjetos.generarCasillaSubida(parametros, indice);
            } else if (datos.get(i).startsWith("avanza")) {
                generarObjetos.generarCasillaAvanza(parametros, indice);
            } else if (datos.get(i).startsWith("pierdeturno")) {
                generarObjetos.generarCasillaPierdeTurno(parametros, indice);
            } else if (datos.get(i).startsWith("bajada")) {
                generarObjetos.generarCasillaBajada(parametros, indice);
            } else {
                generarObjetos.errorCoincidenciaNula(indice);
            }
        }
    }

    /**
     * Este metodo obtiene la cadena 'dato' para separarla en los parametros del objeto a crear.
     * La cadena 'dato' es obtenida de la lectura de archivos.
     * Rompe en un arreglo lo que esta dentro de parentesis y separado por comas.
     * Los parametros seran usados para crear el objeto en cuestion correspondiente.
     * @param dato Cadena que contiene los parametros en una sola linea de texto.
     * @return Retorna los parametros en forma de arreglo de tipo String, lista para usar en la creacion de un objeto.
     */
    private String[] obtenerParametros(String dato) {
        // A indiceAbrirParentesis le sumamos uno porque el metodo substring incluye al primer indice.
        int indiceAbrirParentesis = dato.indexOf("(") +1;
        // A indiceAbrirParentesis no le sumamos uno porque el metodo substring excluye al segundo indice.
        int indiceCerrarParentesis = dato.indexOf(")");
        String datos = dato.substring(indiceAbrirParentesis, indiceCerrarParentesis);
        String[] parametros = datos.split(",");
        return parametros;
    }

    public ArrayList<String> obtenerResultados() {
        return (ArrayList<String>) generarObjetos.getResutadosDeCargaDeDatos();
    }
    
}
