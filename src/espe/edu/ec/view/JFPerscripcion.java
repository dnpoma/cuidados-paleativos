package espe.edu.ec.view;

import espe.edu.ec.controller.PacienteController;
import espe.edu.ec.controller.Utils;
import espe.edu.ec.model.InformacionGeneral;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class JFPerscripcion extends javax.swing.JFrame {
    Utils util;
    PacienteController controller;
    /**
     * Creates new form JFPerscripcion
     */
    public JFPerscripcion() {
        initComponents();
        getContentPane().setBackground(new Color(194, 227, 242));
        
        controller = PacienteController.getInstance();
        InformacionGeneral informacion = controller.getInformacion();

        if (informacion != null && informacion.getNewDatosPaciente() != null) {
            lblNombrePaciente.setText(informacion.getNewDatosPaciente().getPrimerNombre() +"  "+ 
            informacion.getNewDatosPaciente().getSegundoNombre()+ " "+ informacion.getNewDatosPaciente().getPrimerApellido() +" "+ 
            informacion.getNewDatosPaciente().getSegundoApellido() );
            lblEdadPaciente.setText(String.valueOf(informacion.getNewDatosPaciente().getEdad()));
            lblSexoPaciente.setText(informacion.getNewDatosPaciente().getSexo());
        } else {
            lblNombrePaciente.setText("No disponible");
            lblEdadPaciente.setText("No disponible");
        }

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPDatosPaciente = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblNombrePaciente = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblEdadPaciente = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblSexoPaciente = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnAnterior = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbPrevencion = new javax.swing.JLabel();
        lbTratamiento = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taIndicaciones = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        taTratamiento = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPDatosPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Paciente"));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel3.setText("Paciente:");

        lblNombrePaciente.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lblNombrePaciente.setText(".............");

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel6.setText("Edad:");

        lblEdadPaciente.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lblEdadPaciente.setText(".............");

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel7.setText("Sexo:");

        lblSexoPaciente.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lblSexoPaciente.setText(".............");

        javax.swing.GroupLayout jPDatosPacienteLayout = new javax.swing.GroupLayout(jPDatosPaciente);
        jPDatosPaciente.setLayout(jPDatosPacienteLayout);
        jPDatosPacienteLayout.setHorizontalGroup(
            jPDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosPacienteLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblEdadPaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(lblNombrePaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(115, 115, 115)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(lblSexoPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );
        jPDatosPacienteLayout.setVerticalGroup(
            jPDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosPacienteLayout.createSequentialGroup()
                        .addGroup(jPDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblSexoPaciente))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6))
                    .addGroup(jPDatosPacienteLayout.createSequentialGroup()
                        .addGroup(jPDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblNombrePaciente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEdadPaciente)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel12.setText("Perscripción");

        btnAnterior.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnAnterior.setText("< Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnEnviar.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Perscripción"));

        lbPrevencion.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lbPrevencion.setText("Indicaciones:");

        lbTratamiento.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lbTratamiento.setText("Tratamiento:");

        taIndicaciones.setColumns(20);
        taIndicaciones.setRows(5);
        taIndicaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                taIndicacionesKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(taIndicaciones);

        taTratamiento.setColumns(20);
        taTratamiento.setRows(5);
        taTratamiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                taTratamientoKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(taTratamiento);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPrevencion)
                    .addComponent(lbTratamiento))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addGap(11, 11, 11))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPrevencion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTratamiento)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPDatosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEnviar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelar)
                                .addGap(14, 14, 14))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPDatosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnterior)
                    .addComponent(btnEnviar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        controller = PacienteController.getInstance();
        dispose(); 
        controller.abrirVentanaDiagnostico();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        controller = PacienteController.getInstance();
        
            // Llama al método insertDatosPaciente() del controlador
        controller.insertarPerscripcionPaciente();
        if(controller.guardarInformacionGeneral()){
            JOptionPane.showMessageDialog( this,"Se Guardo Correctamente el Paciente💋!.");
        }else{
            JOptionPane.showMessageDialog( this,"Error, intenta de nuevo 😭😢.");
        }
        dispose();
        controller.abrirVentanaInicio();
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(
            null,
            "¿Estás seguro de que quieres cerrar la ventana?",
            "Confirmar Cierre",
            JOptionPane.YES_NO_OPTION
        );

        if (opcion == JOptionPane.YES_OPTION) {
            controller = PacienteController.getInstance();
            dispose(); 
            controller.abrirVentanaInicio();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void taIndicacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taIndicacionesKeyTyped
        util.acceptOnlyCharsInTextArea(evt);
    }//GEN-LAST:event_taIndicacionesKeyTyped

    private void taTratamientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taTratamientoKeyTyped
        util.acceptOnlyCharsInTextArea(evt);
    }//GEN-LAST:event_taTratamientoKeyTyped

    public JTextArea getTaIndicaciones() {
        return taIndicaciones;
    }

    public void setTaIndicaciones(JTextArea taPrevencion) {
        this.taIndicaciones = taPrevencion;
    }

    public JTextArea getTaTratamiento() {
        return taTratamiento;
    }

    public void setTaTratamiento(JTextArea taTratamiento) {
        this.taTratamiento = taTratamiento;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFPerscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPerscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPerscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPerscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPerscripcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPDatosPaciente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbPrevencion;
    private javax.swing.JLabel lbTratamiento;
    private javax.swing.JLabel lblEdadPaciente;
    private javax.swing.JLabel lblNombrePaciente;
    private javax.swing.JLabel lblSexoPaciente;
    private javax.swing.JTextArea taIndicaciones;
    private javax.swing.JTextArea taTratamiento;
    // End of variables declaration//GEN-END:variables
}
