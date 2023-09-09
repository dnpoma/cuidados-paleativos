package espe.edu.ec.model;

import java.util.List;
import java.util.stream.Collectors;
import org.bson.Document;

public class DiagnosticoPaciente {
    private String cieDiagnostico;
    private String cieDescripcion;
    private String tipoDiagnostico;
    private String tipoAtencion;
    private String condicionDiagnostico;

    public DiagnosticoPaciente() {
    }

    public DiagnosticoPaciente(String cieDiagnostico, String cieDescripcion, String tipoDiagnostico, String tipoAtencion, String condicionDiagnostico) {
        this.cieDiagnostico = cieDiagnostico;
        this.cieDescripcion = cieDescripcion;
        this.tipoDiagnostico = tipoDiagnostico;
        this.tipoAtencion = tipoAtencion;
        this.condicionDiagnostico = condicionDiagnostico;
    }

    public String getCieDiagnostico() {
        return cieDiagnostico;
    }

    public void setCieDiagnostico(String cieDiagnostico) {
        this.cieDiagnostico = cieDiagnostico;
    }

    public String getCieDescripcion() {
        return cieDescripcion;
    }

    public void setCieDescripcion(String cieDescripcion) {
        this.cieDescripcion = cieDescripcion;
    }

    public String getTipoDiagnostico() {
        return tipoDiagnostico;
    }

    public void setTipoDiagnostico(String tipoDiagnostico) {
        this.tipoDiagnostico = tipoDiagnostico;
    }

    public String getTipoAtencion() {
        return tipoAtencion;
    }

    public void setTipoAtencion(String tipoAtencion) {
        this.tipoAtencion = tipoAtencion;
    }

    public String getCondicionDiagnostico() {
        return condicionDiagnostico;
    }

    public void setCondicionDiagnostico(String condicionDiagnostico) {
        this.condicionDiagnostico = condicionDiagnostico;
    }

    
    public Document toDocument() {
        Document doc = new Document("codigo_cie", cieDiagnostico)
                .append("descripcion_cie", cieDescripcion)
                .append("tipo_diagnostico", tipoDiagnostico)
                .append("tipo_atencion", tipoAtencion)
                .append("condicion_diagnostico", condicionDiagnostico);
        return doc;
    }
    
    public static List<Document> toDocumentList(List<DiagnosticoPaciente> diagnosticoList) {
        return diagnosticoList.stream()
                .map(DiagnosticoPaciente::toDocument)
                .collect(Collectors.toList());
    }
}
