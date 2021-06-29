package tablero;

import enums.TipoCasilla;
import enums.TipoFicha;
import java.awt.Color;
import javax.swing.*;

public class CreadorCasilla {

    static String nombre = "";
    Ficha ficha;

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        CreadorCasilla.nombre = nombre;
    }

    public static Casilla[][] creadorTablero(int casillasX, int casillasY, int cantJugadores) {
        Casilla tablero;



        Casilla[][] casilla = new Casilla[casillasX][casillasY];
        for (int i = 0; i < casillasX; i++) {
            for (int j = 0; j < casillasY; j++) {
                BotonCasilla boton = new BotonCasilla(i, j, i + "" + j + "" );

                boton.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        BotonCasilla boton = (BotonCasilla) evt.getComponent(); //casteamos el evento para que sea de tipo JBoton
                        JOptionPane.showMessageDialog(null,""+boton.getTipoCasilla());

                    }

                });
                
                tablero = new Casilla(TipoCasilla.NORMAL, boton);

                casilla[i][j] = tablero;
               
            }
        }

       /* switch (cantJugadores) {
            case 1:
                casilla[0][0].setFicha(new Ficha('X', 1, TipoFicha.JUGADOR1));
                break;
            case 2:
                casilla[0][0].setFicha(new Ficha('X', 1, TipoFicha.JUGADOR1));
                casilla[0][0].setFicha(new Ficha('Y', 2, TipoFicha.JUGADOR2));
                break;
            case 3:
                casilla[0][0].setFicha(new Ficha('X', 1, TipoFicha.JUGADOR1));
                casilla[0][0].setFicha(new Ficha('Y', 2, TipoFicha.JUGADOR2));
                casilla[0][0].setFicha(new Ficha('z', 3, TipoFicha.JUGADOR3));
                break;
            case 4:
                casilla[0][0].setFicha(new Ficha('X', 1, TipoFicha.JUGADOR1));
                casilla[0][0].setFicha(new Ficha('Y', 2, TipoFicha.JUGADOR2));
                casilla[0][0].setFicha(new Ficha('Z', 3, TipoFicha.JUGADOR3));
                casilla[0][0].setFicha(new Ficha('W', 4, TipoFicha.JUGADOR4));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Solo se permiten de 1 a 4 Jugadores");
                break;
                
                
        }*/

        casilla[0][0].setTipoCasilla(TipoCasilla.INICIO);
        //casilla[casillasX - 2][casillasY - 2].setTipoCasilla(TipoCasilla.FIN);


        return casilla;

    }
    //public static void modificarCasilla(Casilla[][] casilla)

}
