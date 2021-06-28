
package ventanas;

import java.util.ArrayList;
import javax.swing.WindowConstants;
import persona.Persona;

public class IngresarJugador extends javax.swing.JFrame {
    Persona persona;
    ArrayList<Persona> listaPersonas =new ArrayList<Persona>();
    
    

    
    public IngresarJugador() {
        initComponents();
        this.setTitle("Ingreso Jugador");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreLabel = new javax.swing.JLabel();
        apellidoLabel = new javax.swing.JLabel();
        nombreTextF = new javax.swing.JTextField();
        apellidoTextF = new javax.swing.JTextField();
        agregarDatosBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombreLabel.setBackground(new java.awt.Color(0, 51, 51));
        nombreLabel.setText("Nombre");

        apellidoLabel.setText("Apellido");

        agregarDatosBoton.setText("Agregar");
        agregarDatosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarDatosBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(apellidoLabel)
                    .addComponent(nombreLabel))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(agregarDatosBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nombreTextF, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                        .addComponent(apellidoTextF)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoLabel)
                    .addComponent(apellidoTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(agregarDatosBoton)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarDatosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarDatosBotonActionPerformed

        Persona persona = new Persona( nombreTextF.getText(), apellidoTextF.getText());
        listaPersonas.add(persona);
        System.out.println(listaPersonas + "\n");
        
    }//GEN-LAST:event_agregarDatosBotonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarDatosBoton;
    private javax.swing.JLabel apellidoLabel;
    private javax.swing.JTextField apellidoTextF;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextF;
    // End of variables declaration//GEN-END:variables
}
