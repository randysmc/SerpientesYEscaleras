
package ventanas;

import java.awt.GridLayout;
import java.awt.Window;
import java.util.Vector;
import javax.swing.WindowConstants;
import manejadores.ManejadorTablero;
import tablero.Tablero;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    private Vector listaJugadores = new Vector();
    ManejadorTablero manejadorTablero;
    private Tablero tablero;

  
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
    }
    
    public void asignarDatos(){
        this.tablero = new Tablero(5, 5);
        manejadorTablero = new ManejadorTablero(tableroPanel,tablero.getCasilla(), 5,5);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesPanel = new javax.swing.JPanel();
        agregarJugadorBoton = new javax.swing.JButton();
        mostrarJugadorBoton = new javax.swing.JButton();
        JugarBoton = new javax.swing.JButton();
        reportesBoton = new javax.swing.JButton();
        tableroPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        opcionesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Seleccione la opcion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(0, 51, 51))); // NOI18N

        agregarJugadorBoton.setBackground(new java.awt.Color(255, 255, 255));
        agregarJugadorBoton.setForeground(new java.awt.Color(0, 51, 51));
        agregarJugadorBoton.setText("Agregar Jugador");
        agregarJugadorBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarJugadorBotonMouseClicked(evt);
            }
        });
        agregarJugadorBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarJugadorBotonActionPerformed(evt);
            }
        });

        mostrarJugadorBoton.setBackground(new java.awt.Color(204, 204, 204));
        mostrarJugadorBoton.setForeground(new java.awt.Color(0, 51, 51));
        mostrarJugadorBoton.setText("Mostrar Jugadores");
        mostrarJugadorBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarJugadorBotonActionPerformed(evt);
            }
        });

        JugarBoton.setBackground(new java.awt.Color(204, 204, 204));
        JugarBoton.setForeground(new java.awt.Color(0, 51, 51));
        JugarBoton.setText("Jugar");
        JugarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarBotonActionPerformed(evt);
            }
        });

        reportesBoton.setBackground(new java.awt.Color(204, 204, 204));
        reportesBoton.setForeground(new java.awt.Color(0, 51, 51));
        reportesBoton.setText("Reportes");
        reportesBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportesBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout opcionesPanelLayout = new javax.swing.GroupLayout(opcionesPanel);
        opcionesPanel.setLayout(opcionesPanelLayout);
        opcionesPanelLayout.setHorizontalGroup(
            opcionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agregarJugadorBoton)
                .addGap(28, 28, 28)
                .addComponent(mostrarJugadorBoton)
                .addGap(18, 18, 18)
                .addComponent(JugarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reportesBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        opcionesPanelLayout.setVerticalGroup(
            opcionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(opcionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarJugadorBoton)
                    .addComponent(mostrarJugadorBoton)
                    .addComponent(JugarBoton)
                    .addComponent(reportesBoton))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        tableroPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51)), "Tablero", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        this.tableroPanel.setLayout(new GridLayout(5, 5));

        javax.swing.GroupLayout tableroPanelLayout = new javax.swing.GroupLayout(tableroPanel);
        tableroPanel.setLayout(tableroPanelLayout);
        tableroPanelLayout.setHorizontalGroup(
            tableroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tableroPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(opcionesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void agregarJugadorBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarJugadorBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarJugadorBotonActionPerformed

    private void mostrarJugadorBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarJugadorBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarJugadorBotonActionPerformed

    private void JugarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JugarBotonActionPerformed

    private void reportesBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportesBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reportesBotonActionPerformed

    private void agregarJugadorBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarJugadorBotonMouseClicked
        IngresarJugador ingresar = new IngresarJugador();
    }//GEN-LAST:event_agregarJugadorBotonMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JugarBoton;
    private javax.swing.JButton agregarJugadorBoton;
    private javax.swing.JButton mostrarJugadorBoton;
    private javax.swing.JPanel opcionesPanel;
    private javax.swing.JButton reportesBoton;
    private javax.swing.JPanel tableroPanel;
    // End of variables declaration//GEN-END:variables
}
