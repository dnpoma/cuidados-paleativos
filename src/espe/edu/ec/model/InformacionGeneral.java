package espe.edu.ec.model;


import java.util.Date;
import java.util.List;
import org.bson.Document;

public class InformacionGeneral {
    private int idUsuario;
    private String fechaAtencion;
    DatosPaciente newDatosPaciente;
    LugarResidencia newLugarResidencia;
    DatosRepresentante newDatosRepresentante;
    List<AntecedentesPaciente> listaAntecedentes;
    DatosAntropometricos newAntropometricos;
    List<DiagnosticoPaciente> listaDiagnostico;
    PerscripcionPaciente newPerscripcion;
    
    private static InformacionGeneral instancia = null;

    
    public static synchronized InformacionGeneral getInstancia() {
        if (instancia == null) {
            instancia = new InformacionGeneral();
        }
        return instancia;
    }

    
    public InformacionGeneral() {
    }

    public InformacionGeneral(int idUsuario, String fechaAtencion) {
        this.idUsuario = idUsuario;
        this.fechaAtencion = fechaAtencion;
    }

    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(String fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public DatosPaciente getNewDatosPaciente() {
        return newDatosPaciente;
    }

    public void setNewDatosPaciente(DatosPaciente newDatosPaciente) {
        this.newDatosPaciente = newDatosPaciente;
    }

    public LugarResidencia getNewLugarResidencia() {
        return newLugarResidencia;
    }

    public void setNewLugarResidencia(LugarResidencia newLugarResidencia) {
        this.newLugarResidencia = newLugarResidencia;
    }

    public DatosRepresentante getNewDatosRepresentante() {
        return newDatosRepresentante;
    }

    public void setNewDatosRepresentante(DatosRepresentante newDatosRepresentante) {
        this.newDatosRepresentante = newDatosRepresentante;
    }

    public List<AntecedentesPaciente> getListaAntecedentes() {
        return listaAntecedentes;
    }

    public void setListaAntecedentes(List<AntecedentesPaciente> listaAntecedentes) {
        this.listaAntecedentes = listaAntecedentes;
    }

    public DatosAntropometricos getNewAntropometricos() {
        return newAntropometricos;
    }

    public void setNewAntropometricos(DatosAntropometricos newAntropometricos) {
        this.newAntropometricos = newAntropometricos;
    }

    public List<DiagnosticoPaciente> getListaDiagnostico() {
        return listaDiagnostico;
    }

    public void setListaDiagnostico(List<DiagnosticoPaciente> listaDiagnostico) {
        this.listaDiagnostico = listaDiagnostico;
    }

    public PerscripcionPaciente getNewPerscripcion() {
        return newPerscripcion;
    }

    public void setNewPerscripcion(PerscripcionPaciente newPerscripcion) {
        this.newPerscripcion = newPerscripcion;
    }

    public Document toDocument() {
        Document doc = new Document("idUsuario", idUsuario)
                .append("fecha_atencion", fechaAtencion)
                .append("datos_paciente", newDatosPaciente.toDocument())
                .append("lugar_residencia", newLugarResidencia.toDocument())
                .append("datos_representante", newDatosRepresentante.toDocument())
                .append("antecedentes", AntecedentesPaciente.toDocumentList(listaAntecedentes))
                .append("antropometicos", newAntropometricos.toDocument())
                .append("diagnostico", DiagnosticoPaciente.toDocumentList(listaDiagnostico))
                .append("perscripcion", newPerscripcion.toDocument());
        return doc;
    }

}
