package espe.edu.ec.controller;

import static espe.edu.ec.controller.PacienteController.traerCantonesPorProvincia;
import static espe.edu.ec.controller.PacienteController.traerDatosGeograficosProvincias;
import static espe.edu.ec.controller.PacienteController.traerDescripcionCIE10;
import static espe.edu.ec.controller.PacienteController.traerDiagnosticoPorDescripcion;
import static espe.edu.ec.controller.PacienteController.traerNombresCantones;
import static espe.edu.ec.controller.PacienteController.traerNombresParroquias;
import static espe.edu.ec.controller.PacienteController.traerPaises;
import static espe.edu.ec.controller.PacienteController.traerParroquiasPorCanton;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.bson.Document;


public class Utils {

    public Utils() {
    }
    
    public String formatoFecha(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // El formato que estás utilizando
        return sdf.format(date);
    }

    
    public static void acceptOnlyNumbers(KeyEvent evt) {
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume(); // Ignorar la tecla si no es un número
        }
    }

    public static void bloquearElementoActionPerformed(java.awt.event.ActionEvent evt, javax.swing.JComponent elemento) {
        elemento.setEnabled(false);
    }

    public static void deshabilitarComponentesPanel(javax.swing.JPanel panel) {
        Component[] components = panel.getComponents();

        for (Component component : components) {
            if (component instanceof javax.swing.JComponent) {
                ((javax.swing.JComponent) component).setEnabled(false);
            }
        }
    }
    
    public static void habilitarComponentesPanel(javax.swing.JPanel panel) {
        Component[] components = panel.getComponents();

        for (Component component : components) {
            if (component instanceof javax.swing.JComponent) {
                ((javax.swing.JComponent) component).setEnabled(true);
            }
        }
    }

    
    public static int calculoEdad(Date fechaNacimiento) {
        Calendar fechaNac = Calendar.getInstance();
        fechaNac.setTime(fechaNacimiento);

        Calendar fechaActual = Calendar.getInstance();

        int edad = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);

        if (fechaActual.get(Calendar.MONTH) < fechaNac.get(Calendar.MONTH) ||
            (fechaActual.get(Calendar.MONTH) == fechaNac.get(Calendar.MONTH) &&
             fechaActual.get(Calendar.DAY_OF_MONTH) < fechaNac.get(Calendar.DAY_OF_MONTH))) {
            edad--;
        }

        return edad;
    }
    
    public static String calcularEdad(Date fechaNacimiento) {
        Calendar fechaNac = Calendar.getInstance();
        fechaNac.setTime(fechaNacimiento);

        Calendar fechaActual = Calendar.getInstance();

        int years = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
        int months = fechaActual.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);
        int days = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNac.get(Calendar.DAY_OF_MONTH);

        // Ajustar valores negativos en meses y días
        if (days < 0) {
            months--;
            days += fechaNac.getActualMaximum(Calendar.DAY_OF_MONTH);
        }

        if (months < 0) {
            years--;
            months += 12;
        }

        // Construir una cadena con la edad en años, meses y días
        String edad = years + " años, " + months + " meses y " + days + " días";
        return edad;
    }

    
    public static void handleTipoIdentificacionChange(String selectedValue, KeyEvent evt) {
        if ("Cédula de Identidad".equals(selectedValue)) {
            acceptOnlyNumbersWithMaxLength(evt, 10);
        }else if ("Pasaporte".equals(selectedValue)){
            acceptOnlyCharsWithMaxLength(evt, 9);
        }else if ("Visa".equals(selectedValue)){
            acceptOnlyCharsWithMaxLength(evt, 12);
        }else if ("Carnet de Refugiado".equals(selectedValue)){
            acceptOnlyNumbersWithMaxLength(evt, 10);
        } 
    }
    
    public static void acceptOnlyNumbersWithMaxLength(KeyEvent evt, int maxLength) {
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume(); // Ignorar la tecla si no es un número
        } else {
            JTextField textField = (JTextField) evt.getSource();
            String currentText = textField.getText();
            int length = currentText.length();

            if (length >= maxLength) {
                evt.consume(); // Ignorar la tecla si se alcanza la longitud máxima
            }
        }
    }


    public static void acceptOnlyCharsWithMaxLength(KeyEvent evt, int maxLength) {
        char c = evt.getKeyChar();

        JTextField textField = (JTextField) evt.getSource();
        String currentText = textField.getText();
        int length = currentText.length();

        if (length >= maxLength || !Character.isLetterOrDigit(c)) {
            evt.consume(); // Ignorar la tecla si se alcanza la longitud máxima o no es una letra ni número
        }
    }
    
    public static void acceptOnlyChars(KeyEvent evt) {
        char c = evt.getKeyChar();

        JTextField textField = (JTextField) evt.getSource();
        String currentText = textField.getText();
        int length = currentText.length();

        if (!Character.isLetter(c) && c != ' ') {
            evt.consume(); // Ignorar la tecla si se alcanza la longitud máxima o no es una letra
        }
    }
    
    public static void acceptOnlyCharsInTextArea(KeyEvent evt) {
        char c = evt.getKeyChar();

        JTextArea textArea = (JTextArea) evt.getSource(); // Cambiar JTextField por JTextArea
        String currentText = textArea.getText();
        int length = currentText.length();

        if (!Character.isLetter(c) && c != ' ') {
            evt.consume(); // Ignorar la tecla si no es una letra
        }
    }
    
    public static void acceptOnlyDecimalNumbersWithMaxLength(KeyEvent evt, int maxLength) {
        char c = evt.getKeyChar();
        JTextField textField = (JTextField) evt.getSource();
        String currentText = textField.getText();

        if (!Character.isDigit(c) && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
            evt.consume(); // Ignorar la tecla si no es un número o el carácter decimal
        } else if (c == '.' && currentText.contains(".")) {
            evt.consume(); // Ignorar el carácter decimal si ya existe uno en el campo
        } else {
            if (c == KeyEvent.VK_BACK_SPACE && currentText.length() > 0) {
                // Permitir la eliminación de caracteres si hay algo que borrar
                currentText = currentText.substring(0, currentText.length() - 1);
            } else {
                currentText += c;
            }

            if (currentText.length() >= maxLength) {
                evt.consume(); // Ignorar la tecla si se alcanza la longitud máxima
            }
        }
    }

    
    public static void handleComboBoxSelection(JComboBox<String> comboBox, JTextField textField) {
        String selectedValue = (String) comboBox.getSelectedItem();

        if ("Seleccione".equals(selectedValue)) {
            textField.setEnabled(false); // Habilitar el JTextField
        } else {
            textField.setEnabled(true); // Deshabilitar el JTextField
        }
    }

    public static void listPaisesInComboBox(JComboBox comboBox){
        List<Document> documentosPaises = traerPaises();
        for (Document documento : documentosPaises) {
            comboBox.addItem(documento.getString("DESCRIPCION")); // Añadir nombre del país al ComboBox
        }
    }
    
    public static void listProvinciasInComboBox(JComboBox comboBox){
        List<Document> documentosPaises = traerDatosGeograficosProvincias();
        for (Document documento : documentosPaises) {
            comboBox.addItem(documento.getString("nombre")); // Añadir nombre del país al ComboBox
        }
    }
    
    public static void listCantonesInComboBox(JComboBox comboBox, Document provincia) {
        List<String> nombresCantones = traerNombresCantones(provincia);
        for (String nombreCanton : nombresCantones) {
            comboBox.addItem(nombreCanton); // Añadir nombre del cantón al ComboBox
        }
    }

    public static void listParroquiasInComboBox(JComboBox comboBox, Document canton) {
        List<String> nombresParroquias = traerNombresParroquias(canton);
        for (String nombreParroquia : nombresParroquias) {
            comboBox.addItem(nombreParroquia); // Añadir nombre de la parroquia al ComboBox
        }
    }
    
    public static void listCantonesPorProvincia(JComboBox comboBox, String provincia){
        List<String> nombresCantones = traerCantonesPorProvincia(provincia);
        for (String nombreCanton : nombresCantones) {
            comboBox.addItem(nombreCanton); 
        }
    }
    
    public static void listParroquiasPorCanton(JComboBox comboBox, String canton){
        List<String> nombresParroquias = traerParroquiasPorCanton(canton);
        for (String nombreParroquia : nombresParroquias) {
            comboBox.addItem(nombreParroquia); 
        }
    }
    
    public static void listDescripcionCIE10(JComboBox comboBox) {
        List<String> descripciones = traerDescripcionCIE10();
        for (String descripcion : descripciones) {
            comboBox.addItem(descripcion);
        }
    }
    
    public static void listTraerDiagnosticoPorDescripcion(JComboBox comboBox, String texto) {
        List<String> descripciones = traerDiagnosticoPorDescripcion(texto);
        Set<String> diagnosticosUnicos = new HashSet<>(descripciones);

        comboBox.removeAllItems();  // Limpiar el comboBox antes de añadir los diagnósticos únicos

        for (String diagnostico : diagnosticosUnicos) {
            comboBox.addItem(diagnostico);
        }
    }
    
    public static double calcularIMC(double pesoEnKilos, double alturaEnMetros) {
        if (alturaEnMetros <= 0) {
            throw new IllegalArgumentException("La altura debe ser mayor que cero.");
        }

        return pesoEnKilos / (alturaEnMetros * alturaEnMetros);
    }
    
    public static String clasificarIMC(double imc) {
        if (imc < 16) {
            return "Delgadez severa";
        } else if (imc < 17) {
            return "Delgadez moderada";
        } else if (imc < 18.5) {
            return "Delgadez aceptable";
        } else if (imc < 25) {
            return "Normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 35) {
            return "Obesidad I";
        } else if (imc < 40) {
            return "Obesidad II";
        } else if (imc < 50) {
            return "Obesidad III";
        } else {
            return "Obesidad IV";
        }
    }
}
