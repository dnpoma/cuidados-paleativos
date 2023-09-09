package espe.edu.ec.model;

import org.bson.Document;


public class DatosRepresentante {
    private String tipoIdentificacion;
    private String identificacionRepresentante;


    public DatosRepresentante() {

    }

    
    public DatosRepresentante(String tipoIdentificacion, String identificacionRepresentante) {
        this.tipoIdentificacion = tipoIdentificacion;
        this.identificacionRepresentante = identificacionRepresentante;
    }



    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getIdentificacionRepresentante() {
        return identificacionRepresentante;
    }

    public void setIdentificacionRepresentante(String identificacionRepresentante) {
        this.identificacionRepresentante = identificacionRepresentante;
    }

    @Override
    public String toString() {
        return "DatosRepresentante{" + "tipoIdentificacion=" + tipoIdentificacion + ", identificacionRepresentante=" + identificacionRepresentante + '}';
    }
    
    public Document toDocument() {
        Document doc = new Document("tipo_identificacion_representante", tipoIdentificacion)
                .append("identificacion_representante", identificacionRepresentante);
        return doc;
    }
}