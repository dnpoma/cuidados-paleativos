package espe.edu.ec.view;

import espe.edu.ec.controller.PacienteController;
import espe.edu.ec.controller.Utils;
import espe.edu.ec.model.InformacionGeneral;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class JFDiagnostico extends javax.swing.JFrame {
    Utils util;
    PacienteController controller;
    public JFDiagnostico() {
        initComponents();
        util.listDescripcionCIE10(cbCIEDiagnostico);
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
            lblNombrePaciente.setText("....");
            lblEdadPaciente.setText("....");
        }

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPDatosPaciente1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblNombrePaciente = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblEdadPaciente = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblSexoPaciente = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cbCIEDiagnostico = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lblTipoDiagnostico = new javax.swing.JLabel();
        lblTipoAtencion = new javax.swing.JLabel();
        lblCondicionDiagnostico = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        cbTipoAtencion = new javax.swing.JComboBox<>();
        cbCondicionDiagnostico = new javax.swing.JComboBox<>();
        cbTipoDiagnostico = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtListaDiagnostico = new javax.swing.JTable();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Cuidado Paleativos");
        setResizable(false);

        jPDatosPaciente1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Paciente"));

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel8.setText("Paciente:");

        lblNombrePaciente.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lblNombrePaciente.setText(".............");

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel9.setText("Edad:");

        lblEdadPaciente.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lblEdadPaciente.setText(".............");

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel10.setText("Sexo:");

        lblSexoPaciente.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lblSexoPaciente.setText(".............");

        javax.swing.GroupLayout jPDatosPaciente1Layout = new javax.swing.GroupLayout(jPDatosPaciente1);
        jPDatosPaciente1.setLayout(jPDatosPaciente1Layout);
        jPDatosPaciente1Layout.setHorizontalGroup(
            jPDatosPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosPaciente1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPDatosPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPDatosPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblEdadPaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(lblNombrePaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(115, 115, 115)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(lblSexoPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );
        jPDatosPaciente1Layout.setVerticalGroup(
            jPDatosPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosPaciente1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(lblSexoPaciente))
                    .addGroup(jPDatosPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(lblNombrePaciente)))
                .addGap(12, 12, 12)
                .addGroup(jPDatosPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblEdadPaciente))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de Dianósticos"));

        cbCIEDiagnostico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cbCIEDiagnostico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCIEDiagnosticoItemStateChanged(evt);
            }
        });
        cbCIEDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCIEDiagnosticoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel1.setText("C.I.E. Diagnósticos");

        lblTipoDiagnostico.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lblTipoDiagnostico.setText("Tipo Diagnóstico");

        lblTipoAtencion.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lblTipoAtencion.setText("Tipo Atención");

        lblCondicionDiagnostico.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lblCondicionDiagnostico.setText("Condición de Diagnóstico");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        cbTipoAtencion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Atención Ambulatoria", "Atención de Emergencia", "Atención Especializada", "Atención de Enfermedades Crónicas" }));

        cbCondicionDiagnostico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Enfermedades Graves o Terminales", "Dolor no Controlado", "Pronostico Limitado de vida", "Necesidades de Atención Integral", "Otro" }));

        cbTipoDiagnostico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        JtListaDiagnostico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "C.I.E", "Descripción", "Tipo Diagnostico", "Tipo Atención", "Condición Diagnóstico"
            }
        ));
        jScrollPane1.setViewportView(JtListaDiagnostico);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(cbCIEDiagnostico, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTipoDiagnostico)
                            .addComponent(cbTipoDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbTipoAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipoAtencion))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCondicionDiagnostico)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbCondicionDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(btnAgregar)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cbCIEDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoDiagnostico)
                    .addComponent(lblTipoAtencion)
                    .addComponent(lblCondicionDiagnostico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipoAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipoDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCondicionDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAnterior.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnAnterior.setText("< Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSiguiente.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnSiguiente.setText("Siguiente >");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel12.setText("Diagnóstico Paciente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPDatosPaciente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAnterior)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnSiguiente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnCancelar))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPDatosPaciente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnterior)
                    .addComponent(btnSiguiente)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        controller = PacienteController.getInstance();
        dispose(); 
        controller.abrirVentanaAntropometricos();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        controller = PacienteController.getInstance();
        
        if(controller.validarCamposLlenosDiagnostico()){

            controller.abrirVentanaPerscripcion();
            dispose();
        }else{

            JOptionPane.showMessageDialog(
                null,
                "Por favor, llene todos los campos antes de continuar.",
                "Campos Incompletos",
                JOptionPane.ERROR_MESSAGE
            );

        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

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

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        controller = PacienteController.getInstance();

        if(controller.validarCamposLlenosDiagnostico()){
            // Llama al método insertDatosPaciente() del controlador
            controller.insertarDiagnosticoPaciente();
            
            cbCIEDiagnostico.removeAll();
            cbTipoDiagnostico.removeAll();
            cbTipoAtencion.removeAll();
            cbCondicionDiagnostico.removeAll();
            
            controller.listarDatosDiagnostico();
        }else{

            JOptionPane.showMessageDialog(
                null,
                "Por favor, llene todos los campos antes de continuar.",
                "Campos Incompletos",
                JOptionPane.ERROR_MESSAGE
            );

        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cbCIEDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCIEDiagnosticoActionPerformed
        String selectedValue = (String) cbCIEDiagnostico.getSelectedItem();
        if(!"Seleccione".equals(selectedValue)){
            util.listTraerDiagnosticoPorDescripcion(cbTipoDiagnostico, selectedValue);
        }else{
            cbTipoDiagnostico.removeAllItems();
        }
    }//GEN-LAST:event_cbCIEDiagnosticoActionPerformed

    private void cbCIEDiagnosticoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCIEDiagnosticoItemStateChanged
        cbTipoDiagnostico.removeAll();
        cbTipoAtencion.removeAll();
        cbCondicionDiagnostico.removeAll();
        
    }//GEN-LAST:event_cbCIEDiagnosticoItemStateChanged

    public JComboBox<String> getCbCIEDiagnostico() {
        return cbCIEDiagnostico;
    }

    public void setCbCIEDiagnostico(JComboBox<String> cbCIEDiagnostico) {
        this.cbCIEDiagnostico = cbCIEDiagnostico;
    }

    public JComboBox<String> getCbCondicionDiagnostico() {
        return cbCondicionDiagnostico;
    }

    public void setCbCondicionDiagnostico(JComboBox<String> cbCondicionDiagnostico) {
        this.cbCondicionDiagnostico = cbCondicionDiagnostico;
    }

    public JComboBox<String> getCbTipoAtencion() {
        return cbTipoAtencion;
    }

    public void setCbTipoAtencion(JComboBox<String> cbTipoAtencion) {
        this.cbTipoAtencion = cbTipoAtencion;
    }

    public JComboBox<String> getCbTipoDiagnostico() {
        return cbTipoDiagnostico;
    }

    public void setCbTipoDiagnostico(JComboBox<String> cbTipoDiagnostico) {
        this.cbTipoDiagnostico = cbTipoDiagnostico;
    }

    public JTable getJtListaDiagnostico() {
        return JtListaDiagnostico;
    }

    public void setJtListaDiagnostico(JTable JtListaDiagnostico) {
        this.JtListaDiagnostico = JtListaDiagnostico;
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
            java.util.logging.Logger.getLogger(JFDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFDiagnostico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtListaDiagnostico;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> cbCIEDiagnostico;
    private javax.swing.JComboBox<String> cbCondicionDiagnostico;
    private javax.swing.JComboBox<String> cbTipoAtencion;
    private javax.swing.JComboBox<String> cbTipoDiagnostico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPDatosPaciente1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCondicionDiagnostico;
    private javax.swing.JLabel lblEdadPaciente;
    private javax.swing.JLabel lblNombrePaciente;
    private javax.swing.JLabel lblSexoPaciente;
    private javax.swing.JLabel lblTipoAtencion;
    private javax.swing.JLabel lblTipoDiagnostico;
    // End of variables declaration//GEN-END:variables
}
