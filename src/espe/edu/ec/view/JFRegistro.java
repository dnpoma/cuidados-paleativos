package espe.edu.ec.view;

import com.toedter.calendar.JDateChooser;
import espe.edu.ec.controller.PacienteController;
import espe.edu.ec.controller.Utils;
import java.awt.Color;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JFRegistro extends javax.swing.JFrame {

    Utils util;
   PacienteController controller;
    public JFRegistro() {
        initComponents(); 
        util.listPaisesInComboBox(cbNacionalidad);
        util.listProvinciasInComboBox(cbProvincia);
        getContentPane().setBackground(new Color(194, 227, 242));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        dcFechaAtencion = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cbTipoIdentificacion = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfIdentificacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfPrimerNombre = new javax.swing.JTextField();
        tfSegundoNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfPimerApellido = new javax.swing.JTextField();
        tfSegundoApellido = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        cbOrientacionSexual = new javax.swing.JComboBox<>();
        cbGenero = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        cbNacionalidad = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        cbAutoIdentificacionEtnica = new javax.swing.JComboBox<>();
        dcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        lblEdadPaciente = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        cbProvincia = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        cbCanton = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        cbParroquia = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        tfDireccionDomicilio = new javax.swing.JTextField();
        tfTelefonoFamiliar = new javax.swing.JTextField();
        tfTelefonoPaciente = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cbTipoIdentificacionRepresentante = new javax.swing.JComboBox<>();
        tfIdentificacionRepresentante = new javax.swing.JTextField();

        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Cuidado Paleativos");
        setResizable(false);

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

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha de Atención(YYYY-MM-DD)"));
        jPanel1.setToolTipText("");
        jPanel1.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N

        dcFechaAtencion.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dcFechaAtencionPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(dcFechaAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(dcFechaAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel1.setText("Registro Paciente");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Paciente"));
        jPanel2.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N

        cbTipoIdentificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Cédula de Identidad", "Pasaporte", "Visa", "Carnet de Refugiado" }));
        cbTipoIdentificacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTipoIdentificacionItemStateChanged(evt);
            }
        });
        cbTipoIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoIdentificacionActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo Identificación:");

        jLabel3.setText("Identificación:");

        tfIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdentificacionActionPerformed(evt);
            }
        });
        tfIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfIdentificacionKeyTyped(evt);
            }
        });

        jLabel4.setText("Fecha de Nacimiento:");

        jLabel5.setText("Edad del Paciente:");

        jLabel6.setText("Primer Nombre:");

        jLabel7.setText("Segundo Nombre:");

        tfPrimerNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPrimerNombreKeyTyped(evt);
            }
        });

        tfSegundoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfSegundoNombreKeyTyped(evt);
            }
        });

        jLabel8.setText("Primer Apellido:");

        jLabel9.setText("Segundo Apellido:");

        tfPimerApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPimerApellidoKeyTyped(evt);
            }
        });

        tfSegundoApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfSegundoApellidoKeyTyped(evt);
            }
        });

        jLabel10.setText("Sexo:");

        jLabel11.setText("Orientación Sexual:");

        jLabel13.setText("Identidad de género:");

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Hombre", "Mujer", "Intersexual" }));
        cbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexoActionPerformed(evt);
            }
        });

        cbOrientacionSexual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Lesbiana", "Gay", "Bisexual", "Heterosexual", "No sabe/No responde" }));

        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Trans Masculino", "Trans Femenino", "Masculino", "Femenino", "No sabe/No responde" }));

        jLabel14.setText("Nacionalidad:");

        cbNacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        jLabel15.setText("Auto Identificación Etnica:");

        cbAutoIdentificacionEtnica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Indigena", "Afroecutariano/Afrodescendiente", "Negro/a", "Mulato", "Montubio/a", "Mestizo/a", "Blanco/a", "Otro/a", "No sabe/No responde" }));

        dcFechaNacimiento.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dcFechaNacimientoPropertyChange(evt);
            }
        });

        lblEdadPaciente.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cbSexo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfPimerApellido, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfPrimerNombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbTipoIdentificacion, javax.swing.GroupLayout.Alignment.LEADING, 0, 259, Short.MAX_VALUE)
                    .addComponent(cbNacionalidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15)
                                .addComponent(jLabel3)
                                .addComponent(jLabel7)
                                .addComponent(jLabel11)
                                .addComponent(jLabel9))
                            .addGap(70, 70, 70))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbOrientacionSexual, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbAutoIdentificacionEtnica, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(28, 28, 28)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfSegundoApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(tfSegundoNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfIdentificacion, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(jLabel13)
                        .addComponent(jLabel4)
                        .addComponent(cbGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dcFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                    .addComponent(lblEdadPaciente))
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEdadPaciente))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbOrientacionSexual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbAutoIdentificacionEtnica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbTipoIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(168, 168, 168)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Lugar de Residencia Habitual"));

        jLabel21.setText("Provincia:");

        cbProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cbProvincia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbProvinciaItemStateChanged(evt);
            }
        });
        cbProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProvinciaActionPerformed(evt);
            }
        });

        jLabel22.setText("Cantón:");

        cbCanton.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cbCanton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCantonItemStateChanged(evt);
            }
        });
        cbCanton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCantonActionPerformed(evt);
            }
        });

        jLabel23.setText("Parroquia:");

        cbParroquia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cbParroquia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbParroquiaActionPerformed(evt);
            }
        });

        jLabel24.setText("Télefono Paciente:");

        jLabel25.setText("Télefono Familiar:");

        jLabel26.setText("Dirección Domicilio:");

        tfTelefonoFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefonoFamiliarActionPerformed(evt);
            }
        });
        tfTelefonoFamiliar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTelefonoFamiliarKeyTyped(evt);
            }
        });

        tfTelefonoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefonoPacienteActionPerformed(evt);
            }
        });
        tfTelefonoPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTelefonoPacienteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21)
                    .addComponent(cbProvincia, 0, 193, Short.MAX_VALUE)
                    .addComponent(jLabel24)
                    .addComponent(tfTelefonoPaciente))
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22)
                    .addComponent(cbCanton, 0, 194, Short.MAX_VALUE)
                    .addComponent(jLabel25)
                    .addComponent(tfTelefonoFamiliar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23)
                    .addComponent(cbParroquia, 0, 198, Short.MAX_VALUE)
                    .addComponent(jLabel26)
                    .addComponent(tfDireccionDomicilio))
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbCanton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbParroquia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTelefonoFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDireccionDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTelefonoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Representante"));
        jPanel3.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N

        jLabel18.setText("Tipo de Identificación Representante:");

        jLabel19.setText("Identificación Representante:");

        cbTipoIdentificacionRepresentante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Cédula de Identidad", "Pasaporte", "Visa", "Carnet de Refugiado" }));
        cbTipoIdentificacionRepresentante.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTipoIdentificacionRepresentanteItemStateChanged(evt);
            }
        });
        cbTipoIdentificacionRepresentante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoIdentificacionRepresentanteActionPerformed(evt);
            }
        });

        tfIdentificacionRepresentante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdentificacionRepresentanteActionPerformed(evt);
            }
        });
        tfIdentificacionRepresentante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfIdentificacionRepresentanteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(cbTipoIdentificacionRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(tfIdentificacionRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipoIdentificacionRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIdentificacionRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSiguiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnterior)
                    .addComponent(btnSiguiente)
                    .addComponent(btnCancelar))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfTelefonoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefonoPacienteActionPerformed
        
    }//GEN-LAST:event_tfTelefonoPacienteActionPerformed

    private void tfTelefonoPacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTelefonoPacienteKeyTyped
        util.acceptOnlyNumbersWithMaxLength(evt, 10);
    }//GEN-LAST:event_tfTelefonoPacienteKeyTyped

    private void tfTelefonoFamiliarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTelefonoFamiliarKeyTyped
        util.acceptOnlyNumbersWithMaxLength(evt, 10);
    }//GEN-LAST:event_tfTelefonoFamiliarKeyTyped

    private void tfIdentificacionRepresentanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfIdentificacionRepresentanteKeyTyped
        util.handleTipoIdentificacionChange((String)cbTipoIdentificacionRepresentante.getSelectedItem(), evt);
    }//GEN-LAST:event_tfIdentificacionRepresentanteKeyTyped

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        controller = PacienteController.getInstance();
        dispose(); 
        controller.abrirVentanaInicio();
    }//GEN-LAST:event_btnAnteriorActionPerformed

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

    private void cbTipoIdentificacionRepresentanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoIdentificacionRepresentanteActionPerformed
        util.handleComboBoxSelection(cbTipoIdentificacionRepresentante,tfIdentificacionRepresentante);

    }//GEN-LAST:event_cbTipoIdentificacionRepresentanteActionPerformed

    private void tfIdentificacionRepresentanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdentificacionRepresentanteActionPerformed
        util.bloquearElementoActionPerformed(evt, tfIdentificacionRepresentante);

    }//GEN-LAST:event_tfIdentificacionRepresentanteActionPerformed

    private void tfTelefonoFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefonoFamiliarActionPerformed
        
    }//GEN-LAST:event_tfTelefonoFamiliarActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // Crea una instancia del controlador PacienteController si no existe
        controller = PacienteController.getInstance();
        
        if(controller.validarCamposLlenosPaciente()){
            // Llama al método insertDatosPaciente() del controlador
            controller.insertDatosPaciente();

            controller.abrirVentanaAntecedentes();
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

    private void dcFechaAtencionPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dcFechaAtencionPropertyChange
        if ("date".equals(evt.getPropertyName())) {
            Date selectedDate = (Date) evt.getNewValue();
            Date currentDate = new Date(); // Fecha actual de la computadora

            if (selectedDate.after(currentDate)) {
                dcFechaAtencion.setDate(currentDate); // Establece la fecha actual
            }
        }
    }//GEN-LAST:event_dcFechaAtencionPropertyChange

    private void cbTipoIdentificacionRepresentanteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTipoIdentificacionRepresentanteItemStateChanged
        tfIdentificacionRepresentante.setText("");
    }//GEN-LAST:event_cbTipoIdentificacionRepresentanteItemStateChanged

    private void dcFechaNacimientoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dcFechaNacimientoPropertyChange
        if ("date".equals(evt.getPropertyName())) {
            Date selectedDate = (Date) evt.getNewValue();
            Date currentDate = new Date(); // Fecha actual de la computadora

            if (selectedDate.after(currentDate)) {
                dcFechaNacimiento.setDate(currentDate); // Establece la fecha actual
            }
            lblEdadPaciente.setText(util.calcularEdad(dcFechaNacimiento.getDate()));
            int edad = util.calculoEdad(dcFechaNacimiento.getDate());
            if (edad < 5) {
                util.habilitarComponentesPanel(jPanel3);
            }else{
                util.deshabilitarComponentesPanel(jPanel3);
            }
        }
    }//GEN-LAST:event_dcFechaNacimientoPropertyChange

    private void tfSegundoApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSegundoApellidoKeyTyped
        util.acceptOnlyChars(evt);
    }//GEN-LAST:event_tfSegundoApellidoKeyTyped

    private void tfPimerApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPimerApellidoKeyTyped
        util.acceptOnlyChars(evt);
    }//GEN-LAST:event_tfPimerApellidoKeyTyped

    private void tfSegundoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSegundoNombreKeyTyped
        util.acceptOnlyChars(evt);
    }//GEN-LAST:event_tfSegundoNombreKeyTyped

    private void tfPrimerNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPrimerNombreKeyTyped
        util.acceptOnlyChars(evt);
    }//GEN-LAST:event_tfPrimerNombreKeyTyped

    private void tfIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfIdentificacionKeyTyped
        util.handleTipoIdentificacionChange((String)cbTipoIdentificacion.getSelectedItem(), evt);
    }//GEN-LAST:event_tfIdentificacionKeyTyped

    private void tfIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdentificacionActionPerformed

    }//GEN-LAST:event_tfIdentificacionActionPerformed

    private void cbTipoIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoIdentificacionActionPerformed
       util.handleComboBoxSelection(cbTipoIdentificacion,tfIdentificacion);
    }//GEN-LAST:event_cbTipoIdentificacionActionPerformed

    private void cbTipoIdentificacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTipoIdentificacionItemStateChanged
        tfIdentificacion.setText("");
    }//GEN-LAST:event_cbTipoIdentificacionItemStateChanged

    private void cbProvinciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbProvinciaItemStateChanged
        cbParroquia.removeAllItems();
        cbCanton.removeAllItems();
    }//GEN-LAST:event_cbProvinciaItemStateChanged

    private void cbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSexoActionPerformed

    private void cbProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProvinciaActionPerformed
       String selectedValue = (String) cbProvincia.getSelectedItem();
        if(!"Seleccione".equals(selectedValue)){
            util.listCantonesPorProvincia(cbCanton, selectedValue);
        }else{
            cbCanton.removeAllItems();
        }
    }//GEN-LAST:event_cbProvinciaActionPerformed

    private void cbParroquiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbParroquiaActionPerformed

    }//GEN-LAST:event_cbParroquiaActionPerformed

    private void cbCantonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCantonActionPerformed
        String selectedValue = (String) cbCanton.getSelectedItem();
        if(!"Seleccione".equals(selectedValue)){
            util.listParroquiasPorCanton(cbParroquia, selectedValue);
        }else{
            cbParroquia.removeAllItems();
        }
    }//GEN-LAST:event_cbCantonActionPerformed

    private void cbCantonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCantonItemStateChanged
        cbParroquia.removeAllItems();
    }//GEN-LAST:event_cbCantonItemStateChanged

    public Utils getUtil() {
        return util;
    }

    public void setUtil(Utils util) {
        this.util = util;
    }

    public JTextField getTFIdentificacionRepresentante() {
        return tfIdentificacionRepresentante;
    }

    public void setTFIdentificacionRepresentante(JTextField TFIdentificacionRepresentante) {
        this.tfIdentificacionRepresentante = TFIdentificacionRepresentante;
    }

    public JComboBox<String> getCbAutoIdentificacionEtnica() {
        return cbAutoIdentificacionEtnica;
    }

    public void setCbAutoIdentificacionEtnica(JComboBox<String> cbAutoIdentificacionEtnica) {
        this.cbAutoIdentificacionEtnica = cbAutoIdentificacionEtnica;
    }

    public JComboBox<String> getCbCanton() {
        return cbCanton;
    }

    public void setCbCanton(JComboBox<String> cbCanton) {
        this.cbCanton = cbCanton;
    }

    public JComboBox<String> getCbGenero() {
        return cbGenero;
    }

    public void setCbGenero(JComboBox<String> cbGenero) {
        this.cbGenero = cbGenero;
    }

    public JComboBox<String> getCbNacionalidad() {
        return cbNacionalidad;
    }

    public void setCbNacionalidad(JComboBox<String> cbNacionalidad) {
        this.cbNacionalidad = cbNacionalidad;
    }

    public JComboBox<String> getCbOrientacionSexual() {
        return cbOrientacionSexual;
    }

    public void setCbOrientacionSexual(JComboBox<String> cbOrientacionSexual) {
        this.cbOrientacionSexual = cbOrientacionSexual;
    }

    public JComboBox<String> getCbParroquia() {
        return cbParroquia;
    }

    public void setCbParroquia(JComboBox<String> cbParroquia) {
        this.cbParroquia = cbParroquia;
    }

    public JComboBox<String> getCbProvincia() {
        return cbProvincia;
    }

    public void setCbProvincia(JComboBox<String> cbProvincia) {
        this.cbProvincia = cbProvincia;
    }

    public JComboBox<String> getCbSexo() {
        return cbSexo;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public void setCbSexo(JComboBox<String> cbSexo) {
        this.cbSexo = cbSexo;
    }

    public JComboBox<String> getCbTipoIdentificacion() {
        return cbTipoIdentificacion;
    }

    public void setCbTipoIdentificacion(JComboBox<String> cbTipoIdentificacion) {
        this.cbTipoIdentificacion = cbTipoIdentificacion;
    }

    public JComboBox<String> getCbTipoIdentificacionRepresentante() {
        return cbTipoIdentificacionRepresentante;
    }

    public void setCbTipoIdentificacionRepresentante(JComboBox<String> cbTipoIdentificacionRepresentante) {
        this.cbTipoIdentificacionRepresentante = cbTipoIdentificacionRepresentante;
    }

    public JDateChooser getDcFechaAtencion() {
        return dcFechaAtencion;
    }

    public void setDcFechaAtencion(JDateChooser dcFechaAtencion) {
        this.dcFechaAtencion = dcFechaAtencion;
    }

    public JButton getjButton1() {
        return btnAnterior;
    }

    public void setjButton1(JButton jButton1) {
        this.btnAnterior = jButton1;
    }

    public JButton getjButton2() {
        return btnSiguiente;
    }

    public void setjButton2(JButton jButton2) {
        this.btnSiguiente = jButton2;
    }

    public JButton getjButton3() {
        return btnCancelar;
    }

    public void setjButton3(JButton jButton3) {
        this.btnCancelar = jButton3;
    }

    public JDateChooser getjDateChooser2() {
        return dcFechaNacimiento;
    }

    public void setjDateChooser2(JDateChooser jDateChooser2) {
        this.dcFechaNacimiento = jDateChooser2;
    }

    public JLabel getLblEdadPaciente() {
        return lblEdadPaciente;
    }

    public void setLblEdadPaciente(JLabel lblEdadPaciente) {
        this.lblEdadPaciente = lblEdadPaciente;
    }

    public JTextField getTfDireccionDomicilio() {
        return tfDireccionDomicilio;
    }

    public void setTfDireccionDomicilio(JTextField tfDireccionDomicilio) {
        this.tfDireccionDomicilio = tfDireccionDomicilio;
    }

    public JTextField getTfIdentificacion() {
        return tfIdentificacion;
    }

    public void setTfIdentificacion(JTextField tfIdentificacion) {
        this.tfIdentificacion = tfIdentificacion;
    }

    public JTextField getTfPimerApellido() {
        return tfPimerApellido;
    }

    public void setTfPimerApellido(JTextField tfPimerApellido) {
        this.tfPimerApellido = tfPimerApellido;
    }

    public JTextField getTfPrimerNombre() {
        return tfPrimerNombre;
    }

    public void setTfPrimerNombre(JTextField tfPrimerNombre) {
        this.tfPrimerNombre = tfPrimerNombre;
    }

    public JTextField getTfSegundoApellido() {
        return tfSegundoApellido;
    }

    public void setTfSegundoApellido(JTextField tfSegundoApellido) {
        this.tfSegundoApellido = tfSegundoApellido;
    }

    public JTextField getTfSegundoNombre() {
        return tfSegundoNombre;
    }

    public void setTfSegundoNombre(JTextField tfSegundoNombre) {
        this.tfSegundoNombre = tfSegundoNombre;
    }

    public JTextField getTfTelefonoFamiliar() {
        return tfTelefonoFamiliar;
    }

    public void setTfTelefonoFamiliar(JTextField tfTelefonoFamiliar) {
        this.tfTelefonoFamiliar = tfTelefonoFamiliar;
    }

    public JTextField getTfTelefonoPaciente() {
        return tfTelefonoPaciente;
    }

    public void setTfTelefonoPaciente(JTextField tfTelefonoPaciente) {
        this.tfTelefonoPaciente = tfTelefonoPaciente;
    }

    public JDateChooser getDcFechaNacimiento() {
        return dcFechaNacimiento;
    }

    public void setDcFechaNacimiento(JDateChooser dcFechaNacimiento) {
        this.dcFechaNacimiento = dcFechaNacimiento;
    }

    public JPanel getjPanel5() {
        return jPanel5;
    }

    public void setjPanel5(JPanel jPanel5) {
        this.jPanel5 = jPanel5;
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
            java.util.logging.Logger.getLogger(JFRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> cbAutoIdentificacionEtnica;
    private javax.swing.JComboBox<String> cbCanton;
    private javax.swing.JComboBox<String> cbGenero;
    private javax.swing.JComboBox<String> cbNacionalidad;
    private javax.swing.JComboBox<String> cbOrientacionSexual;
    private javax.swing.JComboBox<String> cbParroquia;
    private javax.swing.JComboBox<String> cbProvincia;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JComboBox<String> cbTipoIdentificacion;
    private javax.swing.JComboBox<String> cbTipoIdentificacionRepresentante;
    private com.toedter.calendar.JDateChooser dcFechaAtencion;
    private com.toedter.calendar.JDateChooser dcFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEdadPaciente;
    private javax.swing.JTextField tfDireccionDomicilio;
    private javax.swing.JTextField tfIdentificacion;
    private javax.swing.JTextField tfIdentificacionRepresentante;
    private javax.swing.JTextField tfPimerApellido;
    private javax.swing.JTextField tfPrimerNombre;
    private javax.swing.JTextField tfSegundoApellido;
    private javax.swing.JTextField tfSegundoNombre;
    private javax.swing.JTextField tfTelefonoFamiliar;
    private javax.swing.JTextField tfTelefonoPaciente;
    // End of variables declaration//GEN-END:variables
}
