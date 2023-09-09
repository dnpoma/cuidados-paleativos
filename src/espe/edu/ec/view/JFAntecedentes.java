 package espe.edu.ec.view;

import espe.edu.ec.controller.PacienteController;
import espe.edu.ec.controller.Utils;
import espe.edu.ec.model.InformacionGeneral;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class JFAntecedentes extends javax.swing.JFrame {
    Utils util;
    PacienteController controller;
    /**
     * Creates new form JFAntecedentes
     */
    public JFAntecedentes() {
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
            lblNombrePaciente.setText("....");
            lblEdadPaciente.setText("....");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPDatosPaciente = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblNombrePaciente = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblEdadPaciente = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblSexoPaciente = new javax.swing.JLabel();
        jPAntecedentesFamiliares = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfApellido = new javax.swing.JTextField();
        cbParentesco = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescripcion = new javax.swing.JTextArea();
        btnAgregarAntecedente = new javax.swing.JButton();
        jPOtrosAntecedentes = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtListaAntecedentes = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Cuidado Paleativos");
        setResizable(false);

        jLabel8.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel8.setText("Antecedentes Paciente");

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
                .addGroup(jPDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEdadPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(lblSexoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPDatosPacienteLayout.setVerticalGroup(
            jPDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblNombrePaciente)
                    .addGroup(jPDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(lblSexoPaciente)))
                .addGap(12, 12, 12)
                .addGroup(jPDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblEdadPaciente))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPAntecedentesFamiliares.setBorder(javax.swing.BorderFactory.createTitledBorder("Antecedentes Familiares"));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel1.setText("Parentesco:");

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel2.setText("Apellido:");

        tfApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfApellidoKeyTyped(evt);
            }
        });

        cbParentesco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Materna", "Paterna", "Otro" }));
        cbParentesco.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbParentescoItemStateChanged(evt);
            }
        });
        cbParentesco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbParentescoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel4.setText("Nombre:");

        tfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNombreKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel5.setText("Descripción:");

        taDescripcion.setColumns(20);
        taDescripcion.setRows(5);
        taDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                taDescripcionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(taDescripcion);

        btnAgregarAntecedente.setText("Agregar");
        btnAgregarAntecedente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAntecedenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPAntecedentesFamiliaresLayout = new javax.swing.GroupLayout(jPAntecedentesFamiliares);
        jPAntecedentesFamiliares.setLayout(jPAntecedentesFamiliaresLayout);
        jPAntecedentesFamiliaresLayout.setHorizontalGroup(
            jPAntecedentesFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAntecedentesFamiliaresLayout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(btnAgregarAntecedente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPAntecedentesFamiliaresLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPAntecedentesFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPAntecedentesFamiliaresLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(jPAntecedentesFamiliaresLayout.createSequentialGroup()
                        .addGroup(jPAntecedentesFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPAntecedentesFamiliaresLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPAntecedentesFamiliaresLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPAntecedentesFamiliaresLayout.setVerticalGroup(
            jPAntecedentesFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAntecedentesFamiliaresLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPAntecedentesFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPAntecedentesFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPAntecedentesFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAntecedentesFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPAntecedentesFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPAntecedentesFamiliaresLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarAntecedente)
                .addGap(12, 12, 12))
        );

        jPOtrosAntecedentes.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Antecedentes"));

        jtListaAntecedentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Parentesco", "Apellido", "Nombre", "Descripción"
            }
        ));
        jScrollPane3.setViewportView(jtListaAntecedentes);

        javax.swing.GroupLayout jPOtrosAntecedentesLayout = new javax.swing.GroupLayout(jPOtrosAntecedentes);
        jPOtrosAntecedentes.setLayout(jPOtrosAntecedentesLayout);
        jPOtrosAntecedentesLayout.setHorizontalGroup(
            jPOtrosAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPOtrosAntecedentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPOtrosAntecedentesLayout.setVerticalGroup(
            jPOtrosAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPOtrosAntecedentesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(324, 324, 324))
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPDatosPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPAntecedentesFamiliares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPOtrosAntecedentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSiguiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPDatosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPAntecedentesFamiliares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPOtrosAntecedentes, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnterior)
                    .addComponent(btnSiguiente)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        controller = PacienteController.getInstance();
        controller.abrirVentanaAntropometricos();
        dispose();
    //        No es necesario que se llene el formulario,
    //        debido a que no todas las personas tienen antecedentes
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

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        controller = PacienteController.getInstance();
        dispose(); 
        controller.abrirVentanaRegistro();
        controller.mostrarDatosEnInterfaz();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void cbParentescoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbParentescoActionPerformed
        String selectedValue = (String) cbParentesco.getSelectedItem();
        if("Otro".equals(selectedValue) || "Seleccione".equals(selectedValue)){
            tfApellido.setEnabled(false);
            tfNombre.setEnabled(false);
        }else{
            tfApellido.setEnabled(true);
            tfNombre.setEnabled(true);
        }
    }//GEN-LAST:event_cbParentescoActionPerformed

    private void cbParentescoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbParentescoItemStateChanged
         tfApellido.setText("");
         tfNombre.setText("");
         taDescripcion.setText("");
    }//GEN-LAST:event_cbParentescoItemStateChanged

    private void tfApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfApellidoKeyTyped
        util.acceptOnlyChars(evt);
    }//GEN-LAST:event_tfApellidoKeyTyped

    private void tfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyTyped
        util.acceptOnlyChars(evt);
    }//GEN-LAST:event_tfNombreKeyTyped

    private void taDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taDescripcionKeyTyped
        util.acceptOnlyCharsInTextArea(evt);
    }//GEN-LAST:event_taDescripcionKeyTyped

    private void btnAgregarAntecedenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAntecedenteActionPerformed
        controller = PacienteController.getInstance();
        
        if(controller.validarCamposLlenosAntecedentes()){
            controller.insertarAntecedentesPaciente();
            tfApellido.setText("");
            tfNombre.setText("");
            taDescripcion.setText("");
            controller.listarDatosAntecedentes();
        }else{

            JOptionPane.showMessageDialog(
                null,
                "Por favor, llene todos los campos antes de continuar.",
                "Campos Incompletos",
                JOptionPane.ERROR_MESSAGE
            );

        }
        
    }//GEN-LAST:event_btnAgregarAntecedenteActionPerformed

    public JComboBox<String> getCbParentesco() {
        return cbParentesco;
    }

    public void setCbParentesco(JComboBox<String> cbParentesco) {
        this.cbParentesco = cbParentesco;
    }

    public JTable getJtListaAntecedentes() {
        return jtListaAntecedentes;
    }

    public void setJtListaAntecedentes(JTable jtListaAntecedentes) {
        this.jtListaAntecedentes = jtListaAntecedentes;
    }

    public JTextArea getTaDescripcion() {
        return taDescripcion;
    }

    public void setTaDescripcion(JTextArea taDescripcion) {
        this.taDescripcion = taDescripcion;
    }

    public JTextField getTfApellido() {
        return tfApellido;
    }

    public void setTfApellido(JTextField tfApellido) {
        this.tfApellido = tfApellido;
    }

    public JTextField getTfNombre() {
        return tfNombre;
    }

    public void setTfNombre(JTextField tfNombre) {
        this.tfNombre = tfNombre;
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
            java.util.logging.Logger.getLogger(JFAntecedentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAntecedentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAntecedentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAntecedentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFAntecedentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAntecedente;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> cbParentesco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPAntecedentesFamiliares;
    private javax.swing.JPanel jPDatosPaciente;
    private javax.swing.JPanel jPOtrosAntecedentes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jtListaAntecedentes;
    private javax.swing.JLabel lblEdadPaciente;
    private javax.swing.JLabel lblNombrePaciente;
    private javax.swing.JLabel lblSexoPaciente;
    private javax.swing.JTextArea taDescripcion;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
