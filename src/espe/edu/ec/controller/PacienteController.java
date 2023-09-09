package espe.edu.ec.controller;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import espe.edu.ec.model.AntecedentesPaciente;
import espe.edu.ec.model.DatosAntropometricos;
import espe.edu.ec.model.DatosPaciente;
import espe.edu.ec.model.DatosRepresentante;
import espe.edu.ec.model.DiagnosticoPaciente;
import espe.edu.ec.model.InformacionGeneral;
import espe.edu.ec.model.LugarResidencia;
import espe.edu.ec.model.PerscripcionPaciente;
import espe.edu.ec.view.JFAntecedentes;
import espe.edu.ec.view.JFDatosAntropometricos;
import espe.edu.ec.view.JFDiagnostico;
import espe.edu.ec.view.JFInicio;
import espe.edu.ec.view.JFPerscripcion;
import espe.edu.ec.view.JFRegistro;
import espe.edu.ec.view.JFReporte;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;


public class PacienteController {
    
    Utils util;
    MongoClient  mongoClient;
    InformacionGeneral informacion; // Singleton instance
    // Pantallas
    JFInicio jfInicio;
    JFRegistro jfRegistro;
    JFAntecedentes jfAntecentes;
    JFDatosAntropometricos jfAntropometricos;
    JFDiagnostico jfDiagnostico;
    JFPerscripcion jfPerscripcion;
    JFReporte jFReporte;
    
    private static PacienteController instance; // Singleton instance


    public static PacienteController getInstance() {
        if (instance == null) {
            instance = new PacienteController();
        }
        return instance;
    }
    
    public PacienteController() {
        this.mongoClient =  MongoDBConnection.getMongoClient();
        this.informacion =  InformacionGeneral.getInstancia();
        this.util = new Utils();
    }

    public InformacionGeneral getInformacion() {
        return informacion;
    }

    public void setInformacion(InformacionGeneral informacion) {
        this.informacion = informacion;
    }
    
    public void logicaPaciente(){
        

    }
    
    public void abrirVentanaInicio(){
        jfInicio = new JFInicio();
        jfInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfInicio.pack();

        jfInicio.setVisible(true);
    }
    
    
    //  Metodos Registro
    public void abrirVentanaRegistro() {
        jfRegistro = new JFRegistro(); // Establece la referencia a la nueva instancia
        jfRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jfRegistro.pack();
        jfRegistro.setVisible(true);
    }
      
    
    public boolean validarCamposLlenosPaciente() {
        // Verificar si todos los campos están llenos
        if (jfRegistro.getCbTipoIdentificacion().getSelectedItem() == "Seleccione" ||
            jfRegistro.getTfIdentificacion().getText().equals("")||
            jfRegistro.getDcFechaAtencion().getDate() == null ||
            jfRegistro.getTfPrimerNombre().getText().equals("")||
            jfRegistro.getTfSegundoApellido().getText().equals("")||
            jfRegistro.getTfPimerApellido().getText().equals("")||
            jfRegistro.getTfSegundoApellido().getText().equals("")||
            jfRegistro.getCbSexo().getSelectedItem() == "Seleccione" ||
            jfRegistro.getCbOrientacionSexual().getSelectedItem() == "Seleccione" ||
            jfRegistro.getCbGenero().getSelectedItem() == "Seleccione" ||
            jfRegistro.getCbNacionalidad().getSelectedItem() == "Seleccione" ||
            jfRegistro.getCbAutoIdentificacionEtnica().getSelectedItem() == "Seleccione" ||
            jfRegistro.getCbProvincia().getSelectedItem() == "Seleccione" ||
            jfRegistro.getCbCanton().getSelectedItem() == "Seleccione"  ||
            jfRegistro.getCbParroquia().getSelectedItem() == "Seleccione" ||
            jfRegistro.getTfTelefonoPaciente().getText() == "" ||
            jfRegistro.getTfTelefonoFamiliar().getText() == "" ||
            jfRegistro.getTfDireccionDomicilio().getText() =="") {
            return false; // Al menos un campo está vacío
        }
        return true; // Todos los campos están llenos
    }

    public void insertDatosPaciente(){
        DatosPaciente newDatosPaciente = new DatosPaciente();
        DatosRepresentante newDatosRepresentante;
        LugarResidencia newResidencia = new LugarResidencia();
        
        informacion = InformacionGeneral.getInstancia();
        informacion.setFechaAtencion(util.formatoFecha(jfRegistro.getDcFechaAtencion().getDate()));
        
        int edad = util.calculoEdad(jfRegistro.getDcFechaNacimiento().getDate());
        
        newDatosPaciente.setTipoIdentificacion((String)jfRegistro.getCbTipoIdentificacion().getSelectedItem());
        newDatosPaciente.setIdentificacion(jfRegistro.getTfIdentificacion().getText());
        newDatosPaciente.setFechaNacimiento(util.formatoFecha(jfRegistro.getDcFechaNacimiento().getDate()));
        newDatosPaciente.setEdad(edad);
        newDatosPaciente.setPrimerNombre(jfRegistro.getTfPrimerNombre().getText());
        newDatosPaciente.setSegundoNombre(jfRegistro.getTfSegundoApellido().getText());
        newDatosPaciente.setPrimerApellido(jfRegistro.getTfPimerApellido().getText());
        newDatosPaciente.setSegundoApellido(jfRegistro.getTfSegundoApellido().getText());
        newDatosPaciente.setSexo((String)jfRegistro.getCbSexo().getSelectedItem());
        newDatosPaciente.setOrientacionSexual((String)jfRegistro.getCbOrientacionSexual().getSelectedItem());
        newDatosPaciente.setIdentidadGenero((String)jfRegistro.getCbGenero().getSelectedItem());
        newDatosPaciente.setNacionalidad((String)jfRegistro.getCbNacionalidad().getSelectedItem());
        newDatosPaciente.setAutoIdentificacionEtnica((String)jfRegistro.getCbAutoIdentificacionEtnica().getSelectedItem());
  
        newResidencia.setProvincia((String)jfRegistro.getCbProvincia().getSelectedItem());
        newResidencia.setCanton((String)jfRegistro.getCbCanton().getSelectedItem());
        newResidencia.setParroquia((String)jfRegistro.getCbParroquia().getSelectedItem());
        newResidencia.setTelefonoPaciente(jfRegistro.getTfTelefonoPaciente().getText());
        newResidencia.setTelefonoFamiliar(jfRegistro.getTfTelefonoFamiliar().getText());
        newResidencia.setDireccionDomicilio(jfRegistro.getTfDireccionDomicilio().getText());
        
        
        if(edad < 5){
            newDatosRepresentante = new DatosRepresentante();
            newDatosRepresentante.setTipoIdentificacion((String)jfRegistro.getCbTipoIdentificacionRepresentante().getSelectedItem());
            newDatosRepresentante.setIdentificacionRepresentante(jfRegistro.getTFIdentificacionRepresentante().getText());
            informacion.setNewDatosRepresentante(newDatosRepresentante);
        }
        
        informacion.setNewDatosPaciente(newDatosPaciente);
        informacion.setNewLugarResidencia(newResidencia);
        
    }
    
    public void mostrarDatosEnInterfaz() {
        DatosPaciente datosPaciente = informacion.getNewDatosPaciente();
        LugarResidencia lugarResidencia = informacion.getNewLugarResidencia();

//        jfRegistro.getDcFechaAtencion().setDate(util.parseFecha(informacion.getFechaAtencion()));
        jfRegistro.getCbTipoIdentificacion().setSelectedItem(datosPaciente.getTipoIdentificacion());
        jfRegistro.getTfIdentificacion().setText(datosPaciente.getIdentificacion());
//        jfRegistro.getDcFechaNacimiento().setDate(util.parseFecha(datosPaciente.getFechaNacimiento()));
        jfRegistro.getLblEdadPaciente().setText(String.valueOf(datosPaciente.getEdad()));
        jfRegistro.getTfPrimerNombre().setText(datosPaciente.getPrimerNombre());
        jfRegistro.getTfSegundoNombre().setText(datosPaciente.getSegundoNombre());
        jfRegistro.getTfPimerApellido().setText(datosPaciente.getPrimerApellido());
        jfRegistro.getTfSegundoApellido().setText(datosPaciente.getSegundoApellido());
        jfRegistro.getCbSexo().setSelectedItem(datosPaciente.getSexo());
        jfRegistro.getCbOrientacionSexual().setSelectedItem(datosPaciente.getOrientacionSexual());
        jfRegistro.getCbGenero().setSelectedItem(datosPaciente.getIdentidadGenero());
        jfRegistro.getCbNacionalidad().setSelectedItem(datosPaciente.getNacionalidad());
        jfRegistro.getCbAutoIdentificacionEtnica().setSelectedItem(datosPaciente.getAutoIdentificacionEtnica());
       
        jfRegistro.getCbProvincia().setSelectedItem(lugarResidencia.getProvincia());
        jfRegistro.getCbCanton().setSelectedItem(lugarResidencia.getCanton());
        jfRegistro.getCbParroquia().setSelectedItem(lugarResidencia.getParroquia());
        jfRegistro.getTfTelefonoPaciente().setText(lugarResidencia.getTelefonoPaciente());
        jfRegistro.getTfTelefonoFamiliar().setText(lugarResidencia.getTelefonoFamiliar());
        jfRegistro.getTfDireccionDomicilio().setText(lugarResidencia.getDireccionDomicilio());

        // Si la edad es menor a 5, también podrías mostrar los datos del representante
        if (datosPaciente.getEdad() < 5) {
            DatosRepresentante datosRepresentante = informacion.getNewDatosRepresentante();
            jfRegistro.getCbTipoIdentificacionRepresentante().setSelectedItem(datosRepresentante.getTipoIdentificacion());
            jfRegistro.getTFIdentificacionRepresentante().setText(datosRepresentante.getIdentificacionRepresentante());
        }
    }

    

    //  Metodos Antecedentes
    
    public void abrirVentanaAntecedentes() {
        jfAntecentes = new JFAntecedentes();
        jfAntecentes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfAntecentes.pack();
        jfAntecentes.setVisible(true);
    }
      
    public boolean validarCamposLlenosAntecedentes(){
        if (((String)jfAntecentes.getCbParentesco().getSelectedItem()).equals("Seleccione") ||
//                jfAntecentes.getTfApellido().getText().isEmpty() ||
//                jfAntecentes.getTfNombre().getText().isEmpty() ||
                jfAntecentes.getTaDescripcion().getText().isEmpty()) {
            return false; 
        }
        return true; 
    }
    
    
    public void insertarAntecedentesPaciente(){
        AntecedentesPaciente antecedentes = new AntecedentesPaciente();
        
        antecedentes.setParentesco((String)jfAntecentes.getCbParentesco().getSelectedItem());
        antecedentes.setApellido(jfAntecentes.getTfApellido().getText());
        antecedentes.setNombre(jfAntecentes.getTfNombre().getText());
        antecedentes.setDescripcion(jfAntecentes.getTaDescripcion().getText());
        
       List<AntecedentesPaciente> antecedentesList = informacion.getListaAntecedentes();
        if (antecedentesList == null) {
            antecedentesList = new ArrayList<>(); // Inicializar la lista si es null
        }

        antecedentesList.add(antecedentes);
        informacion.setListaAntecedentes(antecedentesList);
    }
    
    public void listarDatosAntecedentes() {
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Parentesco");
        tableModel.addColumn("Apellido");
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Descripción");

        for (AntecedentesPaciente antecedentes : informacion.getListaAntecedentes()) {
            Object[] rowData = {
                antecedentes.getParentesco(),
                antecedentes.getApellido(),
                antecedentes.getNombre(),
                antecedentes.getDescripcion()
            };
            tableModel.addRow(rowData);
        }

        jfAntecentes.getJtListaAntecedentes().setModel(tableModel);
    }
    
       public void listarDatosDiagnostico() {
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("C.I.E.");
        tableModel.addColumn("Descripción");
        tableModel.addColumn("Tipo Diagnostico");
        tableModel.addColumn("Tipo Atención");
        tableModel.addColumn("Condición Diagnóstico");

        for (DiagnosticoPaciente diagnostico : informacion.getListaDiagnostico()) {
            Object[] rowData = {
                diagnostico.getCieDiagnostico(),
                diagnostico.getCieDescripcion(),
                diagnostico.getTipoDiagnostico(),
                diagnostico.getTipoAtencion(),
                diagnostico.getCondicionDiagnostico()
            };
            tableModel.addRow(rowData);
        }

        jfDiagnostico.getJtListaDiagnostico().setModel(tableModel);
    }

    
    // Métodos Antropometricos
    
    public void abrirVentanaAntropometricos() {
        jfAntropometricos = new JFDatosAntropometricos();
        jfAntropometricos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfAntropometricos.pack();
        jfAntropometricos.setVisible(true);
    }
    
    public boolean validarCamposLLenosAntropometricos() {
        String pesoStr = jfAntropometricos.getTfPesoPaciente().getText();
        String tallaStr = jfAntropometricos.getTfTallaPaciente().getText();

        return !pesoStr.isEmpty() && !tallaStr.isEmpty();
    }
    
    public void insertarDatosAntropometricos() {
        DatosAntropometricos antropometricos = new DatosAntropometricos();

//        esta rojito porque toca enviar los datos el IMC
        String pesoStr = jfAntropometricos.getTfPesoPaciente().getText();
        String tallaStr = jfAntropometricos.getTfTallaPaciente().getText();
        
        // Convertir las cadenas de texto a valores numéricos double
        double peso = Double.parseDouble(pesoStr);
        double talla = Double.parseDouble(tallaStr);
        double imc = util.calcularIMC(peso, talla);


        antropometricos.setPeso(peso); 
        antropometricos.setTalla(talla);
        antropometricos.setImc(imc);

        informacion.setNewAntropometricos(antropometricos);
    }
    
    // Métodos Diagnostico
    public void abrirVentanaDiagnostico() {
        jfDiagnostico = new JFDiagnostico();
        jfDiagnostico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfDiagnostico.pack();
        jfDiagnostico.setVisible(true);
    }
    
    public void insertarDiagnosticoPaciente(){
        DiagnosticoPaciente diagnostico = new DiagnosticoPaciente();
        String cie =(String)jfDiagnostico.getCbCIEDiagnostico().getSelectedItem();
        
        
        diagnostico.setCieDiagnostico(traerCodigoCIE10PorDescripcion(cie));
        diagnostico.setCieDescripcion(cie);
        diagnostico.setTipoDiagnostico((String)jfDiagnostico.getCbTipoDiagnostico().getSelectedItem());
        diagnostico.setTipoAtencion((String)jfDiagnostico.getCbTipoAtencion().getSelectedItem());
        diagnostico.setCondicionDiagnostico((String)jfDiagnostico.getCbCondicionDiagnostico().getSelectedItem());
        
        
        List<DiagnosticoPaciente> diagnosticoList = informacion.getListaDiagnostico();
        if (diagnosticoList == null) {
            diagnosticoList = new ArrayList<>(); // Inicializar la lista si es null
        }
        
        diagnosticoList.add(diagnostico);
        informacion.setListaDiagnostico(diagnosticoList);
    }
    
    public boolean validarCamposLlenosDiagnostico() {
        String cieDiagnostico = (String) jfDiagnostico.getCbCIEDiagnostico().getSelectedItem();
        String tipoDiagnostico = (String) jfDiagnostico.getCbTipoDiagnostico().getSelectedItem();
        String tipoAtencion = (String) jfDiagnostico.getCbTipoAtencion().getSelectedItem();
        String condicionDiagnostico = (String) jfDiagnostico.getCbCondicionDiagnostico().getSelectedItem();

        return !cieDiagnostico.equals("Seleccione") ||
               !tipoDiagnostico.equals("Seleccione") ||
               !tipoAtencion.equals("Seleccione") ||
               !condicionDiagnostico.equals("Seleccione");
    }

    
    
    // Métodos PerscripcionPacient
    public void abrirVentanaPerscripcion() {
        jfPerscripcion = new JFPerscripcion();
        jfPerscripcion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfPerscripcion.pack();
        jfPerscripcion.setVisible(true);
    }
    
    public boolean validarCamposLlenosPerscripcion() {
        String indicaciones = jfPerscripcion.getTaIndicaciones().getText();
        String tratamiento = jfPerscripcion.getTaTratamiento().getText();

        return !indicaciones.isEmpty() && !tratamiento.isEmpty();
    }

    
    public void insertarPerscripcionPaciente(){
        PerscripcionPaciente perscripcion = new PerscripcionPaciente();
        
        perscripcion.setIndicaciones(jfPerscripcion.getTaIndicaciones().getText());
        perscripcion.setTratamiento(jfPerscripcion.getTaTratamiento().getText());
        
        informacion.setNewPerscripcion(perscripcion);
    }
    
    //Métodos Reporte
    public void abrirVentanaReporte() {
        jFReporte = new JFReporte();
        jFReporte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFReporte.pack();
        jFReporte.setVisible(true);
    }
    

    
    public static List<Document> traerPaises() {
        List<Document> documentosPaises = new ArrayList<>();

        MongoClient mongoClient = MongoDBConnection.getMongoClient();
        MongoDatabase database = mongoClient.getDatabase("cuidadosPaleativos");
        MongoCollection<Document> cuidadosPaleativosCollection = database.getCollection("pais_id");
        FindIterable<Document> documentos = cuidadosPaleativosCollection.find();

        for (Document documento : documentos) {
            documentosPaises.add(documento);
        }

        return documentosPaises;
    }
    
    public static List<Document> traerDatosGeograficosProvincias(){
       List<Document> documentosProvincias = new ArrayList<>();

        MongoClient mongoClient = MongoDBConnection.getMongoClient();
        MongoDatabase database = mongoClient.getDatabase("cuidadosPaleativos");
        MongoCollection<Document> cuidadosPaleativosCollection = database.getCollection("datos_geograficos");
        FindIterable<Document> documentos = cuidadosPaleativosCollection.find();

        for (Document documento : documentos) {
            documentosProvincias.add(documento);
        }

        return documentosProvincias;
    }
    
    public static List<String> traerNombresCantones(Document provincia) {
        List<String> nombresCantones = new ArrayList<>();
        List<Document> cantones = (List<Document>) provincia.get("cantones");

        for (Document canton : cantones) {
            nombresCantones.add(canton.getString("nombre"));
        }

        return nombresCantones;
    }

    public static List<String> traerNombresParroquias(Document canton) {
        List<String> nombresParroquias = new ArrayList<>();
        List<String> parroquias = (List<String>) canton.get("parroquias");

        for (String parroquia : parroquias) {
            nombresParroquias.add(parroquia);
        }

        return nombresParroquias;
    }
    
    public static List<String> traerCantonesPorProvincia(String nombreProvincia) {
        List<String> nombresCantones = new ArrayList<>();

        MongoClient mongoClient = MongoDBConnection.getMongoClient();
        MongoDatabase database = mongoClient.getDatabase("cuidadosPaleativos");
        MongoCollection<Document> cuidadosPaleativosCollection = database.getCollection("datos_geograficos");

        Document provinciaDocumento = cuidadosPaleativosCollection.find(Filters.eq("nombre", nombreProvincia)).first();

        if (provinciaDocumento != null) {
            List<Document> cantones = provinciaDocumento.getList("cantones", Document.class);
            for (Document canton : cantones) {
                nombresCantones.add(canton.getString("nombre"));
            }
        }

        return nombresCantones;
    }

    public static List<String> traerParroquiasPorCanton(String nombreCanton) {
        List<String> nombresParroquias = new ArrayList<>();

        MongoClient mongoClient = MongoDBConnection.getMongoClient();
        MongoDatabase database = mongoClient.getDatabase("cuidadosPaleativos");
        MongoCollection<Document> cuidadosPaleativosCollection = database.getCollection("datos_geograficos");

        Document provinciaDocumento = cuidadosPaleativosCollection.find(Filters.elemMatch("cantones", Filters.eq("nombre", nombreCanton))).first();

        if (provinciaDocumento != null) {
            List<Document> cantones = provinciaDocumento.getList("cantones", Document.class);
            for (Document canton : cantones) {
                if (canton.getString("nombre").equals(nombreCanton)) {
                    List<String> parroquias = canton.getList("parroquias", String.class);
                    nombresParroquias.addAll(parroquias);
                    break;
                }
            }
        }

        return nombresParroquias;
    }

     public static List<String> traerDescripcionCIE10() {
        List<String> descripciones = new ArrayList<>();

        MongoClient mongoClient = MongoDBConnection.getMongoClient();
        MongoDatabase database = mongoClient.getDatabase("cuidadosPaleativos");
        MongoCollection<Document> cie10Collection = database.getCollection("cie_10");

        FindIterable<Document> documentos = cie10Collection.find();

        for (Document documento : documentos) {
            descripciones.add(documento.getString("description"));
        }

        return descripciones;
    }
     
    public static List<String> traerDiagnosticoPorDescripcion(String descripcion) {
        List<String> diagnosticos = new ArrayList<>();

        MongoClient mongoClient = MongoDBConnection.getMongoClient();
        MongoDatabase database = mongoClient.getDatabase("cuidadosPaleativos");
        MongoCollection<Document> cie10Collection = database.getCollection("cie_10");

        Document query = new Document("description", descripcion);
        FindIterable<Document> documentos = cie10Collection.find(query);

        for (Document documento : documentos) {
            diagnosticos.add(documento.getString("diagnostico"));
        }

        return diagnosticos;
    }
     
    public static String traerCodigoCIE10PorDescripcion(String descripcion) {
        MongoClient mongoClient = MongoDBConnection.getMongoClient();
        MongoDatabase database = mongoClient.getDatabase("cuidadosPaleativos");
        MongoCollection<Document> cie10Collection = database.getCollection("cie_10");

        Document cieDocumento = cie10Collection.find(Filters.eq("description", descripcion)).first();

        if (cieDocumento != null) {
            return cieDocumento.getString("code");
        }

        return null;
    }
    
    public boolean guardarInformacionGeneral() {
        MongoClient mongoClient = MongoDBConnection.getMongoClient();
        MongoDatabase database = mongoClient.getDatabase("cuidadosPaleativos");
        MongoCollection<Document> collection = database.getCollection("informacion_paciente");

        if (informacion != null && informacion.getNewDatosPaciente() != null) {
            Document informacionDoc = new Document("fecha_atencion", informacion.getFechaAtencion())
                    .append("datos_paciente", informacion.getNewDatosPaciente().toDocument())
                    .append("lugar_residencia", informacion.getNewLugarResidencia().toDocument())
                    .append("antropometicos", informacion.getNewAntropometricos().toDocument())
                    .append("diagnostico", DiagnosticoPaciente.toDocumentList(informacion.getListaDiagnostico()));

            if(informacion.getNewPerscripcion() != null){
                informacionDoc .append("perscripcion", informacion.getNewPerscripcion().toDocument());
            }
                        
            if (informacion.getNewDatosPaciente().getEdad() < 5) {
                informacionDoc.append("datos_representante", informacion.getNewDatosRepresentante().toDocument());
            }
            
            if (informacion.getListaAntecedentes() != null) {
                informacionDoc.append("antecedentes", AntecedentesPaciente.toDocumentList(informacion.getListaAntecedentes()));
            }

            collection.insertOne(informacionDoc);     
            return true;
        }
        return false;
    }

    // método de reportes
    
    public static Document obtenerPacientePorIdentificacion(String identificacion) {
        MongoClient mongoClient = MongoDBConnection.getMongoClient();
        MongoDatabase database = mongoClient.getDatabase("cuidadosPaleativos");
        MongoCollection<Document> pacientesCollection = database.getCollection("informacion_paciente");

        Document pacienteDocumento = pacientesCollection.find(Filters.eq("datos_paciente.identificacion", identificacion)).first();

        return pacienteDocumento;
    }
    
    public void listarDiagnosticos(Document pacienteDocumento) {
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("C.I.E.");
        tableModel.addColumn("Descripción");
        tableModel.addColumn("Tipo Diagnóstico");
        tableModel.addColumn("Tipo Atención");
        tableModel.addColumn("Condición Diagnóstico");

        List<Document> diagnosticos = pacienteDocumento.getList("diagnostico", Document.class);
        for (Document diagnostico : diagnosticos) {
            Object[] rowData = {
                diagnostico.getString("codigo_cie"),
                diagnostico.getString("descripcion_cie"),
                diagnostico.getString("tipo_diagnostico"),
                diagnostico.getString("tipo_atencion"),
                diagnostico.getString("condicion_diagnostico")
            };
            tableModel.addRow(rowData);
        }
        
        jFReporte.getJtListaDiagnostico().setModel(tableModel);
    }
    
    public void listarAntecedentes(Document pacienteDocumento) {
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Parentesco");
        tableModel.addColumn("Apellido");
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Descripción");

        List<Document> antecedentes = pacienteDocumento.getList("antecedentes", Document.class);
        if (antecedentes != null) {
            for (Document antecedente : antecedentes) {
                Object[] rowData = {
                    antecedente.getString("parentesco"),
                    antecedente.getString("apellido"),
                    antecedente.getString("nombre"),
                    antecedente.getString("descripcion")
                };
                tableModel.addRow(rowData);
            }
        }

        jFReporte.getJtListaAntecedentes().setModel(tableModel);
    }
    
    public void mostrarDatosPaciente(Document datosPaciente) {
        if (datosPaciente != null) {
            jFReporte.getLblNombre().setText(datosPaciente.getString("primer_nombre")
                + " " + datosPaciente.getString("segundo_nombre")
                + " " + datosPaciente.getString("primer_apellido")
                + " " + datosPaciente.getString("segundo_apellido"));

            jFReporte.getLblIdentificacion().setText(datosPaciente.getString("identificacion"));
            jFReporte.getLblSexo().setText(datosPaciente.getString("sexo"));

            ImageIcon icono = null;
            String rutaIcono = "";

            String sexo = datosPaciente.getString("sexo");
            if ("Hombre".equals(sexo)) {
                rutaIcono = "/assets/man.png";
            } else if ("Mujer".equals(sexo)) {
                rutaIcono = "/assets/woman.png";
            } else if ("Intersexual".equals(sexo)) {
                rutaIcono = "/assets/interSexual.png";
            }

            if (!rutaIcono.isEmpty()) {
                icono = new ImageIcon(getClass().getResource(rutaIcono));
                jFReporte.getLblImagen().setIcon(icono);
            }

            jFReporte.getLblFechaNacimiento().setText(datosPaciente.getString("fecha_nacimiento"));
            Integer edad = datosPaciente.getInteger("edad");
            jFReporte.getLblEdad().setText(edad != null ? String.valueOf(edad) : "");
        }
    }

    public void mostrarDatosResidencia(Document lugarResidencia) {
        if (lugarResidencia != null) {
            jFReporte.getLblProvinica().setText(lugarResidencia.getString("provincia"));
            jFReporte.getLblCanton().setText(lugarResidencia.getString("canton"));
            jFReporte.getLblParroquia().setText(lugarResidencia.getString("parroquia"));
            jFReporte.getLblDescripcion().setText(lugarResidencia.getString("direccion_domicilio"));

            jFReporte.getLblTelefonoPaciente().setText(lugarResidencia.getString("telefono_paciente"));
            jFReporte.getLblTelefonoFamiliar().setText(lugarResidencia.getString("telefono_familiar"));
        }
    }

    public void mostrarDatosAntropometicos(Document antropometicos) {
        if (antropometicos != null) {
            Double imc = antropometicos.getDouble("imc");
            Double peso = antropometicos.getDouble("peso");
            Double talla = antropometicos.getDouble("talla");

            jFReporte.getLblIMC().setText(imc != null ? String.valueOf(imc) : "");
            jFReporte.getLblPeso().setText(peso != null ? String.valueOf(peso) : "");
            jFReporte.getLblTalla().setText(talla != null ? String.valueOf(talla) : "");
        }
    }

    public void listarDatosReporte(Document pacienteDocumento) {
        Document datosPaciente = pacienteDocumento.get("datos_paciente", Document.class);
        Document lugarResidencia = pacienteDocumento.get("lugar_residencia", Document.class);
        Document antropometicos = pacienteDocumento.get("antropometicos", Document.class);

        mostrarDatosPaciente(datosPaciente);
        mostrarDatosResidencia(lugarResidencia);
        mostrarDatosAntropometicos(antropometicos);
    }

    
}
