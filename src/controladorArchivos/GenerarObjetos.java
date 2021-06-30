/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorArchivos;

import java.util.ArrayList;
import javax.swing.JPanel;
import manejadores.*;
import tablero.Cuadro;
import ventanas.VentanaJuego;

/**
 *
 * @author randysmc
 */
public class GenerarObjetos {

    final String LINEA = "Linea ";
    final String ERROR_DE_CANTIDAD_DE_PARAMETROS = "Cantidad de parametros erronea.";
    final String ERROR_COINCIDENCIA_NULA = "Tipo de dato invalido";
    ArrayList<String> resutadosDeCargaDeDatos = new ArrayList<>();
    VentanaJuego ventanaJuego;
    Cuadro[][] tablero;
    JPanel tableroPanel;
    
    ManejadorTablero manejadorTablero = new ManejadorTablero(ventanaJuego, tablero, tableroPanel);
    

    //manejadorTablero.casillaRetroceso(manejadorTablero.getTablero(), indice, indice);

    public GenerarObjetos() {
    }


    
    
    
    
    
    public void generarTablero(String[] parametros, int indice) {
        if (parametros.length == 2) {
            manejadorTablero.iniciarTablero(Integer.parseInt(parametros[0]), Integer.parseInt(parametros[1]));
        }
    }

    public void generarCasillaRetroceso(String[] parametros, int indice) {
        if (parametros.length == 3) {
            manejadorTablero.casillaRetroceso(manejadorTablero.getTablero(), Integer.parseInt(parametros[0]), Integer.parseInt(parametros[1]), Integer.parseInt(parametros[2]));
        }
    }

    public void generarCasillaTirarDado(String[] parametros, int indice) {
        if(parametros.length ==2){
            manejadorTablero.casillaTirarDados(manejadorTablero.getTablero(), Integer.parseInt(parametros[0]), Integer.parseInt(parametros[1]));
        }

    }

    public void generarCasillaSubida(String[] parametros, int indice) {
        if(parametros.length == 4){
            manejadorTablero.casillaSubida(manejadorTablero.getTablero(), Integer.parseInt(parametros[0]), Integer.parseInt(parametros[1]), Integer.parseInt(parametros[2]), Integer.parseInt(parametros[3]));
        }

    }

    public void generarCasillaAvanza(String[] parametros, int indice) {
        if(parametros.length == 3){
            manejadorTablero.casillaAvanza(manejadorTablero.getTablero(), Integer.parseInt(parametros[0]),
                    Integer.parseInt(parametros[1]), Integer.parseInt(parametros[2]));
        }

    }

    public void generarCasillaPierdeTurno(String[] parametros, int indice) {
        if(parametros.length == 2){
            manejadorTablero.casillaPierdeTurno(manejadorTablero.getTablero(), Integer.parseInt(parametros[0]), Integer.parseInt(parametros[1]));
        }

    }

    public void generarCasillaBajada(String[] parametros, int indice) {
        if(parametros.length ==4){
            manejadorTablero.casillaBajada(manejadorTablero.getTablero(), Integer.parseInt(parametros[0]), Integer.parseInt(parametros[1]), Integer.parseInt(parametros[2]), Integer.parseInt(parametros[3]));
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
