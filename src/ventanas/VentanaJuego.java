package ventanas;

import dado.Dado;
import enums.EstadoCasilla;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.util.Vector;
import javax.swing.JButton;
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

    /*public void iniciarTablero(int cantX, int cantY, int cantJugadores){
        this.tableroPanel.setLayout(new GridLayout(cantX, cantY));
        asignarDatos(cantX, cantY, cantJugadores);
        
    }
    
    public void asignarDatos(int cantX, int cantY, int cantJugadores){
        this.tablero = new Tablero(cantX, cantY, cantJugadores);
        manejadorTablero = new ManejadorTablero(tableroPanel, tablero.getCasilla(), cantX, cantY);

    }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesPanel = new javax.swing.JPanel();
        JugarBoton = new javax.swing.JButton();
        filasTextF = new javax.swing.JTextField();
        colTextF = new javax.swing.JTextField();
        borrarBoton = new javax.swing.JButton();
        tableroPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        botonDado = new javax.swing.JButton();

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
        tableroPanel.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout tableroPanelLayout = new javax.swing.GroupLayout(tableroPanel);
        tableroPanel.setLayout(tableroPanelLayout);
        tableroPanelLayout.setHorizontalGroup(
            tableroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tableroPanelLayout.setVerticalGroup(
            tableroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(botonDado, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(tableroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(opcionesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tableroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel opcionesPanel;
    private javax.swing.JPanel tableroPanel;
    // End of variables declaration//GEN-END:variables
}
