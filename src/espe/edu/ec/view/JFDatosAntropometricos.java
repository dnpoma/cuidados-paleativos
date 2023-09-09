package espe.edu.ec.view;

import espe.edu.ec.controller.PacienteController;
import espe.edu.ec.controller.Utils;
import espe.edu.ec.model.InformacionGeneral;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class JFDatosAntropometricos extends javax.swing.JFrame {
    Utils util;
    PacienteController controller;
   
    public JFDatosAntropometricos() {
        initComponents();
        tfIMC.setEditable(false);
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

        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbPesoPaciente = new javax.swing.JLabel();
        lbTallaPaciente = new javax.swing.JLabel();
        tfPesoPaciente = new javax.swing.JTextField();
        tfTallaPaciente = new javax.swing.JTextField();
        lbIMC = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbMensaje = new javax.swing.JLabel();
        tfIMC = new javax.swing.JTextField();
        lbAlertas = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        jPDatosPaciente1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblNombrePaciente = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblEdadPaciente = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblSexoPaciente = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel11.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel11.setText("Antecedentes Paciente");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Cuidado Paleativos");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Atropométricos"));

        lbPesoPaciente.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lbPesoPaciente.setText("Peso (Kg)");

        lbTallaPaciente.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lbTallaPaciente.setText("Talla(cm)");

        tfPesoPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPesoPacienteKeyTyped(evt);
            }
        });

        tfTallaPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTallaPacienteKeyTyped(evt);
            }
        });

        lbIMC.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lbIMC.setText("I.M.C");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(0, 0, 255));

        lbMensaje.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lbMensaje.setText("......");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(lbMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbMensaje)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        lbAlertas.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        lbAlertas.setForeground(new java.awt.Color(51, 0, 204));
        lbAlertas.setText("Alertas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIMC)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfIMC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(lbPesoPaciente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPesoPaciente, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTallaPaciente)
                            .addComponent(tfTallaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbAlertas)
                .addGap(204, 204, 204))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbAlertas)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPesoPaciente)
                            .addComponent(lbTallaPaciente))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTallaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPesoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lbIMC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfIMC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelar.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSiguiente.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnSiguiente.setText("Siguiente >");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnAnterior.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnAnterior.setText("< Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

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
                .addComponent(lblSexoPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jLabel12.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel12.setText("Datos Antropométricos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSiguiente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelar))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPDatosPaciente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPDatosPaciente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnterior)
                    .addComponent(btnSiguiente)
                    .addComponent(btnCancelar))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
       controller = PacienteController.getInstance();
        
        if(controller.validarCamposLLenosAntropometricos()){
            // Llama al método insertDatosPaciente() del controlador
            controller.insertarDatosAntropometricos();

            controller.abrirVentanaDiagnostico();
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

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        controller = PacienteController.getInstance();
        dispose(); 
        controller.abrirVentanaAntecedentes();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void tfPesoPacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesoPacienteKeyTyped
        util.acceptOnlyDecimalNumbersWithMaxLength(evt, 6);
    }//GEN-LAST:event_tfPesoPacienteKeyTyped

    private void tfTallaPacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTallaPacienteKeyTyped
        util.acceptOnlyDecimalNumbersWithMaxLength(evt, 6);

        String tallaStr = tfTallaPaciente.getText();
        String pesoStr = tfPesoPaciente.getText();

        if (!pesoStr.isEmpty() && !tallaStr.isEmpty()) {
            double talla = Double.parseDouble(tallaStr);
            double peso = Double.parseDouble(pesoStr);

            double imc = util.calcularIMC(peso, talla);
            String formattedImc = String.format("%.3f", imc);
            tfIMC.setText(formattedImc); // Convertir el valor numérico a String
            lbMensaje.setText(util.clasificarIMC(imc));
        }
    }//GEN-LAST:event_tfTallaPacienteKeyTyped

    public JLabel getLbAlertas() {
        return lbAlertas;
    }

    public void setLbAlertas(JLabel lbAlertas) {
        this.lbAlertas = lbAlertas;
    }

    public JTextField getTfIMC() {
        return tfIMC;
    }

    public void setTfIMC(JTextField tfIMC) {
        this.tfIMC = tfIMC;
    }

    public JTextField getTfPesoPaciente() {
        return tfPesoPaciente;
    }

    public void setTfPesoPaciente(JTextField tfPesoPaciente) {
        this.tfPesoPaciente = tfPesoPaciente;
    }

    public JTextField getTfTallaPaciente() {
        return tfTallaPaciente;
    }

    public void setTfTallaPaciente(JTextField tfTallaPaciente) {
        this.tfTallaPaciente = tfTallaPaciente;
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
            java.util.logging.Logger.getLogger(JFDatosAntropometricos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFDatosAntropometricos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFDatosAntropometricos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFDatosAntropometricos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFDatosAntropometricos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPDatosPaciente1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbAlertas;
    private javax.swing.JLabel lbIMC;
    private javax.swing.JLabel lbMensaje;
    private javax.swing.JLabel lbPesoPaciente;
    private javax.swing.JLabel lbTallaPaciente;
    private javax.swing.JLabel lblEdadPaciente;
    private javax.swing.JLabel lblNombrePaciente;
    private javax.swing.JLabel lblSexoPaciente;
    private javax.swing.JTextField tfIMC;
    private javax.swing.JTextField tfPesoPaciente;
    private javax.swing.JTextField tfTallaPaciente;
    // End of variables declaration//GEN-END:variables
}
