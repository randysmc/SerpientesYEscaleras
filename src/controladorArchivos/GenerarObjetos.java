/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorArchivos;

import java.util.ArrayList;
import manejadores.*;

/**
 *
 * @author randysmc
 */
public class GenerarObjetos {
    final String LINEA = "Linea ";
    final String ERROR_DE_CANTIDAD_DE_PARAMETROS = "Cantidad de parametros erronea.";
    final String ERROR_COINCIDENCIA_NULA = "Tipo de dato invalido";
    ArrayList<String> resutadosDeCargaDeDatos = new ArrayList<>();
    ManejadorTablero manejadorTablero;
    
    //manejadorTablero.casillaRetroceso(manejadorTablero.getTablero(), indice, indice);
    
    
    public void generarTablero(String[] parametros, int indice){
        if(parametros.length ==2){
            String erroresGenerarTablero = validarGenerarTablero(parametros);
            if("".equals(erroresGenerarTablero)){
                
                manejadorTablero.Jugar(indice, indice);
                    
                
            }
        }
    }


    

    public void errorCoincidenciaNula(int indice) {
        resutadosDeCargaDeDatos.add(lineaMasIndice(indice) + ERROR_COINCIDENCIA_NULA);
    }

    private String lineaMasIndice(int indice) {
        return LINEA + indice + ". ";
    }

    public ArrayList<String> getResutadosDeCargaDeDatos() {
        return resutadosDeCargaDeDatos;
    }
    
}
