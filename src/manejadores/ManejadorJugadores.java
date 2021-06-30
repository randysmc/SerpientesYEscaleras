/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadores;

import java.util.ArrayList;
import javax.swing.JTable;
import persona.Persona;
import ventanas.VentanaJuego;
import ventanas.VentanaPrincipal;

/**
 *
 * @author randysmc
 */
public class ManejadorJugadores {

    VentanaPrincipal ventanaPrincipal;
    JTable jugadoresTabla;
    Persona persona;
    ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
    VentanaJuego ventanaJuego;

    public ManejadorJugadores(VentanaPrincipal ventanaPrincipal, JTable jugadoresTabla, Persona persona) {
        this.ventanaPrincipal = ventanaPrincipal;
        this.jugadoresTabla = jugadoresTabla;
        this.persona = persona;
        //int x = Integer.parseInt(ventanaJuego.getFilasTextF().getText());
    }

    public void agregarJugador(String nombre, String apellido) {
        //String nombre = String.valueOf(ventanaPrincipal.getIngNomTextF().getText());
        //String apellido = String.valueOf(ventanaPrincipal.getIngApeTexF().getText());
        Persona persona = new Persona(nombre, apellido);
        listaPersonas.add(persona);
        mostrar(nombre, apellido);
    }

    public void mostrar(String nombre, String apellido) {
        String matriz[][] = new String[listaPersonas.size()][3];

        for (int i = 0; i < listaPersonas.size(); i++) {

            matriz[i][0] = String.valueOf(listaPersonas.get(i).getId());
            matriz[i][1] = listaPersonas.get(i).getNombre();
            matriz[i][2] = listaPersonas.get(i).getApellido();
        }

        jugadoresTabla.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Id", "Nombre", "Apellido"
                }
        ));
    }
    
    public void mostrarVentanaJuego(){
        /*
        ventanaJuego.setJugador1Label(""+listaPersonas.get(0).toString());
        ventanaJuego.setJugador1Label(listaPersonas.get(0));*/
        System.out.println(listaPersonas.get(0));
        //ventanaJuego.setJugador2Label1("hola");
        
        
        
    }   

}
