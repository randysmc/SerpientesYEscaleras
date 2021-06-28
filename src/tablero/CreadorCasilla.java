package tablero;

import enums.TipoCasilla;
import javax.swing.*;

public class CreadorCasilla {

    public static Casilla[][] creadorTablero(int casillasX, int casillasY) {
        Casilla tablero;
        String nombre = "";
        Ficha ficha;

        Casilla[][] casilla = new Casilla[casillasX][casillasY];
        for (int i = 0; i < casillasX; i++) {
            for (int j = 0; j < casillasY; j++) {
                BotonCasilla boton = new BotonCasilla(i, j, nombre);

                
                boton.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        BotonCasilla boton = (BotonCasilla) evt.getComponent(); //casteamos el evento para que sea de tipo JBoton
                        JOptionPane.showMessageDialog(null, boton.getTipoCasilla());

                    }

                });
                tablero = new Casilla(TipoCasilla.NORMAL, boton);

                casilla[i][j] = tablero;
                casilla[0][0].setFicha(new Ficha('a', i));
                casilla[0][0].setTipoCasilla(TipoCasilla.ESCALERA);
                //casilla[0][1].setTipoCasilla(TipoCasilla.SERPIENTE);
                if (casilla[i][j].getFicha() != null) {
                    nombre = (casilla[i][j].getFicha().getCaracter() + " " + casilla[i][j].toString());
                } else {
                    nombre = " " + casilla[i][j].toString();
                }

            }

        }
        return casilla;

    }

    public void modificarCasilla(Casilla casilla, int x, int y) {

    }

}
