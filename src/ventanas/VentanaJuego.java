package ventanas;

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
import manejadores.Manejador;
import tablero.Cuadro;

;

public class VentanaJuego extends javax.swing.JFrame {

    private Vector listaJugadores = new Vector();
    Cuadro[][] tablero;
    Manejador manejador;

    public VentanaJuego() {
        initComponents();
        manejador = new Manejador(this, tablero, tableroPanel);
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
                .addContainerGap(259, Short.MAX_VALUE))
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

        javax.swing.GroupLayout tableroPanelLayout = new javax.swing.GroupLayout(tableroPanel);
        tableroPanel.setLayout(tableroPanelLayout);
        tableroPanelLayout.setHorizontalGroup(
            tableroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tableroPanelLayout.setVerticalGroup(
            tableroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opcionesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tableroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(opcionesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JugarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarBotonActionPerformed

    }//GEN-LAST:event_JugarBotonActionPerformed

    private void JugarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JugarBotonMouseClicked
        manejador.pintarTablero();

    }//GEN-LAST:event_JugarBotonMouseClicked

    private void borrarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarBotonMouseClicked
        manejador.borrarTablero();
        JugarBoton.setEnabled(true);
        colTextF.setEnabled(true);
        filasTextF.setEnabled(true);
        colTextF.setText("");
        filasTextF.setText("");

        colTextF.requestFocus();
        filasTextF.requestFocus();
    }//GEN-LAST:event_borrarBotonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JugarBoton;
    private javax.swing.JButton borrarBoton;
    private javax.swing.JTextField colTextF;
    private javax.swing.JTextField filasTextF;
    private javax.swing.JPanel opcionesPanel;
    private javax.swing.JPanel tableroPanel;
    // End of variables declaration//GEN-END:variables
}
