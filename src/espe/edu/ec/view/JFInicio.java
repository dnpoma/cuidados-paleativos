package espe.edu.ec.view;

import espe.edu.ec.controller.PacienteController;
import java.awt.Color;
import javax.swing.JOptionPane;


/**
 *
 * @author Fernando
 */
public class JFInicio extends javax.swing.JFrame {

    PacienteController pacienteController;
    /**
     * Creates new form JFInicio
     */
    public JFInicio() {
        initComponents();
        getContentPane().setBackground(new Color(194, 227, 242));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLImagenFondo = new javax.swing.JLabel();
        JLTitulo = new javax.swing.JLabel();
        jPMenu = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        btnAntecedentes = new javax.swing.JButton();
        btnPerscripcion = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        btnDiagnostico = new javax.swing.JButton();
        btnDatosAntropometricos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Cuidado Paleativos");
        setBackground(new java.awt.Color(205, 233, 255));
        setResizable(false);

        jLImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/background.jpeg"))); // NOI18N

        JLTitulo.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        JLTitulo.setLabelFor(jLImagenFondo);
        JLTitulo.setText("Bienvenido Al Sitema de  Cuidado Paleativos");
        JLTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JLTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPMenu.setBackground(new java.awt.Color(205, 233, 255));

        btnInicio.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/iconos/pagina-de-inicio.png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnRegistro.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/iconos/agregar-usuario.png"))); // NOI18N
        btnRegistro.setText("Registro Paciente");
        btnRegistro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        btnAntecedentes.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnAntecedentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/iconos/latido-del-corazon.png"))); // NOI18N
        btnAntecedentes.setText("Antecedentes Paciente");
        btnAntecedentes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAntecedentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAntecedentesActionPerformed(evt);
            }
        });

        btnPerscripcion.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnPerscripcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/iconos/medicamento.png"))); // NOI18N
        btnPerscripcion.setText("Prescripción");
        btnPerscripcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPerscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerscripcionActionPerformed(evt);
            }
        });

        btnReporte.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/iconos/libro.png"))); // NOI18N
        btnReporte.setText("Reportes");
        btnReporte.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        btnDiagnostico.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnDiagnostico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/iconos/estetoscopio.png"))); // NOI18N
        btnDiagnostico.setText("Diagnósticos");
        btnDiagnostico.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagnosticoActionPerformed(evt);
            }
        });

        btnDatosAntropometricos.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnDatosAntropometricos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/iconos/informe-medico.png"))); // NOI18N
        btnDatosAntropometricos.setText("Datos Antropométricos");
        btnDatosAntropometricos.setHideActionText(true);
        btnDatosAntropometricos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDatosAntropometricos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosAntropometricosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPMenuLayout = new javax.swing.GroupLayout(jPMenu);
        jPMenu.setLayout(jPMenuLayout);
        jPMenuLayout.setHorizontalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAntecedentes, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
            .addComponent(btnPerscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDiagnostico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDatosAntropometricos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPMenuLayout.setVerticalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLayout.createSequentialGroup()
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAntecedentes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDatosAntropometricos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPerscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLImagenFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(JLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(JLTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLImagenFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        JOptionPane.showMessageDialog(
            null,
            "Te encuentras en el sistema de cuidado paliativos",
            "Bienvenido",
            JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        pacienteController = PacienteController.getInstance();
        pacienteController.abrirVentanaRegistro();

        dispose(); 
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnAntecedentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntecedentesActionPerformed
        pacienteController = PacienteController.getInstance();
        pacienteController.abrirVentanaAntecedentes();
        
        dispose(); 
    }//GEN-LAST:event_btnAntecedentesActionPerformed

    private void btnDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagnosticoActionPerformed
        pacienteController = PacienteController.getInstance();
        pacienteController.abrirVentanaDiagnostico();
        
        dispose(); 
    }//GEN-LAST:event_btnDiagnosticoActionPerformed

    private void btnDatosAntropometricosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosAntropometricosActionPerformed
        pacienteController = PacienteController.getInstance();
        pacienteController.abrirVentanaAntropometricos();
        
        dispose();
    }//GEN-LAST:event_btnDatosAntropometricosActionPerformed

    private void btnPerscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerscripcionActionPerformed
        pacienteController = PacienteController.getInstance();
        pacienteController.abrirVentanaPerscripcion();
        
        dispose();
    }//GEN-LAST:event_btnPerscripcionActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        pacienteController = PacienteController.getInstance();
        pacienteController.abrirVentanaReporte();
        
        dispose();
    }//GEN-LAST:event_btnReporteActionPerformed

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
            java.util.logging.Logger.getLogger(JFInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLTitulo;
    private javax.swing.JButton btnAntecedentes;
    private javax.swing.JButton btnDatosAntropometricos;
    private javax.swing.JButton btnDiagnostico;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnPerscripcion;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnReporte;
    private javax.swing.JLabel jLImagenFondo;
    private javax.swing.JPanel jPMenu;
    // End of variables declaration//GEN-END:variables
}
