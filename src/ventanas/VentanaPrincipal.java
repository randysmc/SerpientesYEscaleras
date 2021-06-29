/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import manejadores.ManejadorJugadores;
import persona.Persona;

/**
 *
 * @author randysmc
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    VentanaJuego ventanaJuego;
    Persona persona;
    ManejadorJugadores manejadorJugadores;

    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        manejadorJugadores = new ManejadorJugadores(this, jugadoresTabla, persona);
    }

    public VentanaJuego getVentanaJuego() {
        return ventanaJuego;
    }

    public void setVentanaJuego(VentanaJuego ventanaJuego) {
        this.ventanaJuego = ventanaJuego;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public JButton getAgregarJugadorBoton() {
        return agregarJugadorBoton;
    }

    public void setAgregarJugadorBoton(JButton agregarJugadorBoton) {
        this.agregarJugadorBoton = agregarJugadorBoton;
    }

    public JLabel getIngApeLabel() {
        return ingApeLabel;
    }

    public void setIngApeLabel(JLabel ingApeLabel) {
        this.ingApeLabel = ingApeLabel;
    }

    public JTextField getIngApeTexF() {
        return ingApeTexF;
    }

    public void setIngApeTexF(JTextField ingApeTexF) {
        this.ingApeTexF = ingApeTexF;
    }

    public JTextField getIngNomTextF() {
        return ingNomTextF;
    }

    public void setIngNomTextF(JTextField ingNomTextF) {
        this.ingNomTextF = ingNomTextF;
    }

    public JLabel getIngNombreLabel() {
        return ingNombreLabel;
    }

    public void setIngNombreLabel(JLabel ingNombreLabel) {
        this.ingNombreLabel = ingNombreLabel;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getJugadoresTabla() {
        return jugadoresTabla;
    }

    public void setJugadoresTabla(JTable jugadoresTabla) {
        this.jugadoresTabla = jugadoresTabla;
    }

    public JButton getJugarBoton() {
        return jugarBoton;
    }

    public void setJugarBoton(JButton jugarBoton) {
        this.jugarBoton = jugarBoton;
    }

    public JPanel getPanelOpciones() {
        return panelOpciones;
    }

    public void setPanelOpciones(JPanel panelOpciones) {
        this.panelOpciones = panelOpciones;
    }

    public JPanel getPanelTabla() {
        return panelTabla;
    }

    public void setPanelTabla(JPanel panelTabla) {
        this.panelTabla = panelTabla;
    }
    
    
        
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelOpciones = new javax.swing.JPanel();
        jugarBoton = new javax.swing.JButton();
        ingApeTexF = new javax.swing.JTextField();
        ingNomTextF = new javax.swing.JTextField();
        ingNombreLabel = new javax.swing.JLabel();
        ingApeLabel = new javax.swing.JLabel();
        panelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jugadoresTabla = new javax.swing.JTable();
        agregarJugadorBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jugarBoton.setText("Jugar");
        jugarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jugarBotonMouseClicked(evt);
            }
        });

        ingNombreLabel.setBackground(new java.awt.Color(0, 51, 51));
        ingNombreLabel.setText("Nombre");

        ingApeLabel.setBackground(new java.awt.Color(0, 51, 51));
        ingApeLabel.setText("Apellido");

        javax.swing.GroupLayout panelOpcionesLayout = new javax.swing.GroupLayout(panelOpciones);
        panelOpciones.setLayout(panelOpcionesLayout);
        panelOpcionesLayout.setHorizontalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ingNombreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(ingApeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ingApeTexF, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(ingNomTextF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jugarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionesLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionesLayout.createSequentialGroup()
                        .addComponent(jugarBoton)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionesLayout.createSequentialGroup()
                        .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ingNomTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ingNombreLabel))
                        .addGap(26, 26, 26)
                        .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ingApeTexF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ingApeLabel))
                        .addGap(7, 7, 7))))
        );

        jugadoresTabla.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jugadoresTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido"
            }
        ));
        jScrollPane1.setViewportView(jugadoresTabla);

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        agregarJugadorBoton.setText("Agregar Jugador");
        agregarJugadorBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarJugadorBotonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(agregarJugadorBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(agregarJugadorBoton)
                .addGap(30, 30, 30)
                .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jugarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jugarBotonMouseClicked
        ventanaJuego = new VentanaJuego();
        
    }//GEN-LAST:event_jugarBotonMouseClicked

    private void agregarJugadorBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarJugadorBotonMouseClicked
        String nombre = ingNomTextF.getText();
        String apellido = ingApeTexF.getText();
        manejadorJugadores.agregarJugador(nombre, apellido);
        ingNomTextF.setEnabled(true);
        ingNomTextF.setText("");
        ingNomTextF.requestFocus();
        ingApeTexF.setEnabled(true);
        ingApeTexF.setText("");

    }//GEN-LAST:event_agregarJugadorBotonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarJugadorBoton;
    private javax.swing.JLabel ingApeLabel;
    private javax.swing.JTextField ingApeTexF;
    private javax.swing.JTextField ingNomTextF;
    private javax.swing.JLabel ingNombreLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jugadoresTabla;
    private javax.swing.JButton jugarBoton;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JPanel panelTabla;
    // End of variables declaration//GEN-END:variables
}
