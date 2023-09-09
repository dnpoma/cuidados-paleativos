package espe.edu.ec.model;

import org.bson.Document;


public class PerscripcionPaciente {
    private String indicaciones;
    private String tratamiento;

    public PerscripcionPaciente() {
    }

    public PerscripcionPaciente(String indicaciones, String tratamiento) {
        this.indicaciones = indicaciones;
        this.tratamiento = tratamiento;
    }
    
    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    @Override
    public String toString() {
        return "Perscripcion{" + "indicaciones=" + indicaciones + ", tratamiento=" + tratamiento + '}';
    }
    
    public Document toDocument() {
        Document doc = new Document("indicaciones", indicaciones)
                .append("tratamiento", tratamiento);
        return doc;
    }   
}
