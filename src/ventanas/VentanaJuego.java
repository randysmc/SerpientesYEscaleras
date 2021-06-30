package ventanas;

import controladorArchivos.GenerarObjetos;
import dado.Dado;
import enums.EstadoCasilla;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import manejadores.ManejadorTablero;
import tablero.Cuadro;

;

public class VentanaJuego extends javax.swing.JFrame {

    private Vector listaJugadores = new Vector();
    Cuadro[][] tablero;
    ManejadorTablero manejadorTablero;

    public VentanaJuego() {
        initComponents();
        manejadorTablero = new ManejadorTablero(this, tablero, tableroPanel);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //iniciarTablero(10,4);

    }

    public JButton getJugarBoton() {
        return JugarBoton;
    }

    public void setJugarBoton(JButton JugarBoton) {
        this.JugarBoton = JugarBoton;
    }

    public JButton getBorrarBoton() {
        return borrarBoton;
    }

    public void setBorrarBoton(JButton borrarBoton) {
        this.borrarBoton = borrarBoton;
    }

    public JTextField getColTextF() {
        return colTextF;
    }

    public void setColTextF(JTextField colTextF) {
        this.colTextF = colTextF;
    }

    public JTextField getFilasTextF() {
        return filasTextF;
    }

    public void setFilasTextF(JTextField filasTextF) {
        this.filasTextF = filasTextF;
    }

    public JPanel getOpcionesPanel() {
        return opcionesPanel;
    }

    public void setOpcionesPanel(JPanel opcionesPanel) {
        this.opcionesPanel = opcionesPanel;
    }
    
    

    public JPanel getTableroPanel() {
        return tableroPanel;
    }

    public void setTableroPanel(JPanel tableroPanel) {
        this.tableroPanel = tableroPanel;
    }

    public JButton getBotonDado() {
        return botonDado;
    }

    public void setBotonDado(JButton botonDado) {
        this.botonDado = botonDado;
    }

    public JPanel getJugador1Label() {
        return jugador1Label;
    }

    public void setJugador1Label(JPanel jugador1Label) {
        this.jugador1Label = jugador1Label;
    }

    public JLabel getJugador2Label1() {
        return jugador2Label1;
    }

    public void setJugador2Label1(JLabel jugador2Label1) {
        this.jugador2Label1 = jugador2Label1;
    }

    public JLabel getJugador3Label() {
        return jugador3Label;
    }

    public void setJugador3Label(JLabel jugador3Label) {
        this.jugador3Label = jugador3Label;
    }

    public JLabel getJugador4Label() {
        return jugador4Label;
    }

    public void setJugador4Label(JLabel jugador4Label) {
        this.jugador4Label = jugador4Label;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesPanel = new javax.swing.JPanel();
        JugarBoton = new javax.swing.JButton();
        filasTextF = new javax.swing.JTextField();
        colTextF = new javax.swing.JTextField();
        borrarBoton = new javax.swing.JButton();
        tableroPanel = new javax.swing.JPanel();
        panelJugadores = new javax.swing.JPanel();
        botonDado = new javax.swing.JButton();
        jugador1Label = new javax.swing.JPanel();
        jugador4Label = new javax.swing.JLabel();
        jugador2Label1 = new javax.swing.JLabel();
        jugador3Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        opcionesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Seleccione la opcion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(0, 51, 51))); // NOI18N

        JugarBoton.setBackground(new java.awt.Color(204, 204, 204));
        JugarBoton.setForeground(new java.awt.Color(0, 51, 51));
        JugarBoton.setText("Dibujar Tablero");
        JugarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JugarBotonMouseClicked(evt);
            }
        });
        JugarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarBotonActionPerformed(evt);
            }
        });

        borrarBoton.setText("BorrarTab");
        borrarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrarBotonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout opcionesPanelLayout = new javax.swing.GroupLayout(opcionesPanel);
        opcionesPanel.setLayout(opcionesPanelLayout);
        opcionesPanelLayout.setHorizontalGroup(
            opcionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesPanelLayout.createSequentialGroup()
                .addComponent(filasTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JugarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(borrarBoton)
                .addContainerGap(342, Short.MAX_VALUE))
        );
        opcionesPanelLayout.setVerticalGroup(
            opcionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(opcionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JugarBoton)
                    .addComponent(filasTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrarBoton))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        tableroPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51)), "Tablero", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        tableroPanel.setMaximumSize(new java.awt.Dimension(3276, 2762));
        tableroPanel.setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout tableroPanelLayout = new javax.swing.GroupLayout(tableroPanel);
        tableroPanel.setLayout(tableroPanelLayout);
        tableroPanelLayout.setHorizontalGroup(
            tableroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );
        tableroPanelLayout.setVerticalGroup(
            tableroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        botonDado.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        botonDado.setForeground(new java.awt.Color(255, 51, 51));
        botonDado.setText("0");
        botonDado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "TirarDado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(102, 0, 0))); // NOI18N
        botonDado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonDadoMouseClicked(evt);
            }
        });
        botonDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDadoActionPerformed(evt);
            }
        });

        jugador1Label.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jugador1Label.setForeground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jugador1LabelLayout = new javax.swing.GroupLayout(jugador1Label);
        jugador1Label.setLayout(jugador1LabelLayout);
        jugador1LabelLayout.setHorizontalGroup(
            jugador1LabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jugador1LabelLayout.setVerticalGroup(
            jugador1LabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jugador4Label.setForeground(new java.awt.Color(0, 51, 51));
        jugador4Label.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jugador2Label1.setForeground(new java.awt.Color(0, 51, 51));
        jugador2Label1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jugador3Label.setForeground(new java.awt.Color(0, 51, 51));
        jugador3Label.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panelJugadoresLayout = new javax.swing.GroupLayout(panelJugadores);
        panelJugadores.setLayout(panelJugadoresLayout);
        panelJugadoresLayout.setHorizontalGroup(
            panelJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJugadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jugador3Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jugador4Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jugador1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonDado, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jugador2Label1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        panelJugadoresLayout.setVerticalGroup(
            panelJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJugadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jugador1Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jugador2Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jugador3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jugador4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonDado, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opcionesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tableroPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelJugadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(opcionesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tableroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelJugadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JugarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarBotonActionPerformed

    }//GEN-LAST:event_JugarBotonActionPerformed

    private void JugarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JugarBotonMouseClicked

        int x = Integer.parseInt(filasTextF.getText());
        int y = Integer.parseInt(colTextF.getText());
        manejadorTablero.Jugar(x, y);

    }//GEN-LAST:event_JugarBotonMouseClicked

    private void borrarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarBotonMouseClicked
        tableroPanel.removeAll();
        tableroPanel.repaint();
//manejador.borrarTablero();
        JugarBoton.setEnabled(true);
        colTextF.setEnabled(true);
        filasTextF.setEnabled(true);
        colTextF.setText("");
        filasTextF.setText("");

        colTextF.requestFocus();
        filasTextF.requestFocus();
    }//GEN-LAST:event_borrarBotonMouseClicked

    private void botonDadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDadoMouseClicked
        int random = Dado.tirarDado(1);
        botonDado.setText(String.valueOf(random));
    }//GEN-LAST:event_botonDadoMouseClicked

    private void botonDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonDadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JugarBoton;
    private javax.swing.JButton borrarBoton;
    private javax.swing.JButton botonDado;
    private javax.swing.JTextField colTextF;
    private javax.swing.JTextField filasTextF;
    private javax.swing.JPanel jugador1Label;
    private javax.swing.JLabel jugador2Label1;
    private javax.swing.JLabel jugador3Label;
    private javax.swing.JLabel jugador4Label;
    private javax.swing.JPanel opcionesPanel;
    private javax.swing.JPanel panelJugadores;
    private javax.swing.JPanel tableroPanel;
    // End of variables declaration//GEN-END:variables
}
