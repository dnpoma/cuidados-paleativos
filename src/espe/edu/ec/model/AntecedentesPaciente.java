package espe.edu.ec.model;

import java.util.List;
import java.util.stream.Collectors;
import org.bson.Document;


public class AntecedentesPaciente {
    private String parentesco;
    private String apellido;
    private String nombre;
    private String descripcion;

    public AntecedentesPaciente() {
    }

    public AntecedentesPaciente(String parentesco, String descripcion) {
        this.parentesco = parentesco;
        this.descripcion = descripcion;
        this.nombre = "";
        this.apellido = "";
    }

    public AntecedentesPaciente(String parentesco, String apellido, String nombre, String descripcion) {
        this.parentesco = parentesco;
        this.apellido = apellido;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    
    
    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Antecedentes{" + "parentesco=" + parentesco + ", apellido=" + apellido + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    
    public Document toDocument() {
        Document doc = new Document("parentesco", parentesco)
                .append("apellido", apellido)
                .append("nombre", nombre)
                .append("descripcion", descripcion);
        return doc;
    }
    
    public static List<Document> toDocumentList(List<AntecedentesPaciente> antecedentesList) {
        return antecedentesList.stream()
                .map(AntecedentesPaciente::toDocument)
                .collect(Collectors.toList());
    }
}
