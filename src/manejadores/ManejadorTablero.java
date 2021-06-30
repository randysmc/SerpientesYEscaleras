/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadores;

/**
 * se van a maneajr
 *
 * @author randysmc
 */
import enums.EstadoCasilla;
import enums.TipoFicha;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import persona.Persona;
import tablero.Cuadro;
import tablero.Ficha;
import ventanas.VentanaJuego;

public class ManejadorTablero {

    private VentanaJuego ventanaJuego;
    private Cuadro[][] tablero;
    private JPanel tableroPanel;
    ArrayList<Persona> listaJugadores;
    private Ficha ficha;

    public ManejadorTablero(VentanaJuego ventanaJuego, Cuadro[][] tablero, JPanel tableroPanel) {
        this.ventanaJuego = ventanaJuego;
        this.tablero = tablero;
        this.tableroPanel = tableroPanel;
    }

    public void Jugar(int x, int y) {
        iniciarTablero(x, y);
        inicioFinTablero(x, y);
        //iniciarFicha(tablero, 0, 0, 2);

        //String nombreC = nombreTableroCuadro(tablero, x, y);
        //String nombreF = nombreTableroFicha(tablero, x, y);
        pintarTablero(x, y);
        tableroPanel.repaint();

    }

    public void inicioFinTablero(int x, int y) {
        this.tablero[0][0].setEstadoCasilla(EstadoCasilla.INICIO);
        this.tablero[0][0].setBackground(Color.LIGHT_GRAY);
        this.tablero[x - 1][y - 1].setEstadoCasilla(EstadoCasilla.FIN);
        this.tablero[x - 1][y - 1].setBackground(Color.DARK_GRAY);
    }

    public void iniciarTablero(int x, int y) {
        this.tablero = new Cuadro[x][y];
        //Greed Layout para botones
        //ventanaJuego.getTableroPanel().setLayout(new GridLayout(x, y));
        //panelTablero.setLayout(new GridLayout(x, y));

        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {

                if (i == 0 && j == 0) {
                    //this.tablero[i][j].setFicha(new Ficha('X', TipoFicha.JUGADOR1));
                    this.tablero[i][j] = new Cuadro(i, j, ventanaJuego.getTableroPanel(), this.ventanaJuego, EstadoCasilla.INICIO, "");
                    //this.tablero[i][j].setBackground(Color.red);
                } else if (i == (x - 1) && j == (y - 1)) {
                    this.tablero[i][j] = new Cuadro(i, j, ventanaJuego.getTableroPanel(), this.ventanaJuego, EstadoCasilla.FIN, "");
                    //this.tablero[i][j].setBackground(Color.BLACK);
                } else {
                    this.tablero[i][j] = new Cuadro(i, j, ventanaJuego.getTableroPanel(), this.ventanaJuego, EstadoCasilla.NORMAL, "");

                }

            }

        }

        //this.ventanaJuego.setVisible(true);
    }

    /**
     * Este metodo me ayuda a pintar el tablero, luego de las modificaciones que
     * pueda tener
     */
    public void pintarTablero(int x, int y) {
        this.tablero = new Cuadro[x][y];
        //Greed Layout para botones
        ventanaJuego.getTableroPanel().setLayout(new GridLayout(x, y));
        //panelTablero.setLayout(new GridLayout(x, y));
        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {

            }
        }

        this.ventanaJuego.setVisible(true);
    }

    /**
     * Metodo para borrar y limpiar el tablero, hace todas las casillas null
     *
     */
    public void borrarTablero(int x, int y) {

        for (int i = 0; i < Integer.parseInt(ventanaJuego.getFilasTextF().getText()); i++) {
            for (int j = 0; j < Integer.parseInt(ventanaJuego.getColTextF().getText()); j++) {
                tablero[i][j] = null;
            }
            ventanaJuego.getTableroPanel().removeAll();
        }
        ventanaJuego.getTableroPanel().repaint();
    }

    /**
     * Metodo para iniciar una ficha en el tablero, depende de cuantos jugadores
     * existan es el numero de fichas que se crean
     */
    public void iniciarFicha(Cuadro[][] tablero, int x, int y, int cantJ) {
        switch (cantJ) {
            case 1:
                this.tablero[x][y].setFicha(new Ficha('X', TipoFicha.JUGADOR1));
                break;
            case 2:
                this.tablero[x][y].setFicha(new Ficha('X', TipoFicha.JUGADOR1));
                this.tablero[x][y].setFicha(new Ficha('Y', TipoFicha.JUGADOR2));
                break;
            case 3:
                this.tablero[x][y].setFicha(new Ficha('X', TipoFicha.JUGADOR1));
                this.tablero[x][y].setFicha(new Ficha('Y', TipoFicha.JUGADOR2));
                this.tablero[x][y].setFicha(new Ficha('Z', TipoFicha.JUGADOR3));
                break;
            case 4:
                this.tablero[x][y].setFicha(new Ficha('X', TipoFicha.JUGADOR1));
                this.tablero[x][y].setFicha(new Ficha('Y', TipoFicha.JUGADOR2));
                this.tablero[x][y].setFicha(new Ficha('Z', TipoFicha.JUGADOR3));
                this.tablero[x][y].setFicha(new Ficha('W', TipoFicha.JUGADOR4));
                break;
            default:

        }
    }

    /**
     * Metodo para pintar la casilla de retroceso, me ayuda a establecer la
     * casilla y a pintarla
     */

    public void casillaRetroceso(Cuadro[][] tablero, int x, int y, int cantidad) {
        this.tablero[x][y].setEstadoCasilla(EstadoCasilla.RETROCEDE);
        this.tablero[x][y].setBackground(Color.ORANGE);

    }

    public void casillaTirarDados(Cuadro[][] tablero, int x, int y) {
        this.tablero[x][y].setEstadoCasilla(EstadoCasilla.TIRAR_DADOS);
        this.tablero[x][y].setBackground(Color.RED);

    }

    public void casillaSubida(Cuadro[][] tablero, int xI, int yI, int xF, int yF) {
        this.tablero[xI][yI].setEstadoCasilla(EstadoCasilla.SUBIDA);
        this.tablero[xI][yI].setBackground(Color.YELLOW);
        this.tablero[xF][yF].setEstadoCasilla(EstadoCasilla.SUBIDA);
        this.tablero[xF][yF].setBackground(Color.YELLOW);

    }

    public void casillaAvanza(Cuadro[][] tablero, int x, int y, int cantidad) {
        this.tablero[x][y].setEstadoCasilla(EstadoCasilla.AVANZA);
        //this.tablero[x][y].setBackground(Color.ORANGE);

    }

    public void casillaPierdeTurno(Cuadro[][] tablero, int x, int y) {
        this.tablero[x][y].setEstadoCasilla(EstadoCasilla.PIERDE_TURNO);
        this.tablero[x][y].setBackground(Color.BLUE);

    }

    public void casillaBajada(Cuadro[][] tablero, int xI, int yI, int xF, int yF) {
        this.tablero[xI][yF].setEstadoCasilla(EstadoCasilla.BAJADA);
        this.tablero[xI][yF].setBackground(Color.GREEN);
        this.tablero[xF][yF].setEstadoCasilla(EstadoCasilla.BAJADA);
        this.tablero[xF][yF].setBackground(Color.GREEN);

    }

    public String nombreTableroCuadro(Cuadro[][] tablero, int x, int y) {
        String nombreC = "hola";
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (tablero[i][j].getEstadoCasilla() == EstadoCasilla.INICIO) {           
                    nombreC = "INICIO";
                }
                if (tablero[i][j].getEstadoCasilla() == EstadoCasilla.AVANZA) {
                    this.tablero[i][j].setText("Av");
                    nombreC = "Av";
                }
                if (tablero[i][j].getEstadoCasilla() == EstadoCasilla.FIN) {
                    nombreC = "Fin";
                }
                if (tablero[i][j].getEstadoCasilla() == EstadoCasilla.PIERDE_TURNO) {
                    nombreC = "Pierde Turno";
                }
                if (tablero[i][j].getEstadoCasilla() == EstadoCasilla.SUBIDA) {
                    nombreC = "Subida";
                }
                if (tablero[i][j].getEstadoCasilla() == EstadoCasilla.BAJADA) {
                    nombreC = "Bajada";
                }

            }
        }
        return nombreC;

    }

    public String nombreTableroFicha(Cuadro[][] tablero, int x, int y) {
        String nombreF = "";
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (tablero[i][j].getFicha().getTipoFicha() == TipoFicha.JUGADOR1) {
                    nombreF = "J1";
                }
                if (tablero[i][j].getFicha().getTipoFicha() == TipoFicha.JUGADOR2) {
                    nombreF = "J2";
                }
                if (tablero[i][j].getFicha().getTipoFicha() == TipoFicha.JUGADOR3) {
                    nombreF = "J3";
                }
                if (tablero[i][j].getFicha().getTipoFicha() == TipoFicha.JUGADOR4) {
                    nombreF = "J4";
                }
            }
        }
        return nombreF;

    }

    public VentanaJuego getVentanaJuego() {
        return ventanaJuego;
    }

    public void setVentanaJuego(VentanaJuego ventanaJuego) {
        this.ventanaJuego = ventanaJuego;
    }

    public Cuadro[][] getTablero() {
        return tablero;
    }

    public void setTablero(Cuadro[][] tablero) {
        this.tablero = tablero;
    }

    public JPanel getTableroPanel() {
        return tableroPanel;
    }

    public void setTableroPanel(JPanel tableroPanel) {
        this.tableroPanel = tableroPanel;
    }

    public ArrayList<Persona> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Persona> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

}
