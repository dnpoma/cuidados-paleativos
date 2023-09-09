package espe.edu.ec.model;

import org.bson.Document;


public class DatosPaciente {
    private String tipoIdentificacion;
    private String identificacion;
    private String fechaNacimiento;
    private int edad;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String sexo;
    private String orientacionSexual;
    private String identidadGenero;
    private String nacionalidad;
    private String autoIdentificacionEtnica;


    public DatosPaciente( String tipoIdentificacion, String identificacion,
            String fechaNacimiento, String primerNombre, String segundoNombre, String primerApellido,
            String segundoApellido, String sexo, String orientacionSexual, String identidadGenero,
            String nacionalidad, String autoIdentificacionEtnica) {
        this.tipoIdentificacion = tipoIdentificacion;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.sexo = sexo;
        this.orientacionSexual = orientacionSexual;
        this.identidadGenero = identidadGenero;
        this.nacionalidad = nacionalidad;
        this.autoIdentificacionEtnica = autoIdentificacionEtnica;
    }

    public DatosPaciente() {
    }
    
    
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getOrientacionSexual() {
        return orientacionSexual;
    }

    public void setOrientacionSexual(String orientacionSexual) {
        this.orientacionSexual = orientacionSexual;
    }

    public String getIdentidadGenero() {
        return identidadGenero;
    }

    public void setIdentidadGenero(String identidadGenero) {
        this.identidadGenero = identidadGenero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getAutoIdentificacionEtnica() {
        return autoIdentificacionEtnica;
    }

    public void setAutoIdentificacionEtnica(String autoIdentificacionEtnica) {
        this.autoIdentificacionEtnica = autoIdentificacionEtnica;
    }

    @Override
    public String toString() {
        return "DatosPaciente{" + "tipoIdentificacion=" + tipoIdentificacion + 
                ", identificacion=" + identificacion + 
                ", fechaNacimiento=" + fechaNacimiento + 
                ", edad=" + edad + 
                ", primerNombre=" + primerNombre + 
                ", segundoNombre=" + segundoNombre + 
                ", primerApellido=" + primerApellido + 
                ", segundoApellido=" + segundoApellido + 
                ", sexo=" + sexo + 
                ", orientacionSexual=" + orientacionSexual + 
                ", identidadGenero=" + identidadGenero +
                ", nacionalidad=" + nacionalidad + 
                ", autoIdentificacionEtnica=" + autoIdentificacionEtnica + '}';
    }

    public Document toDocument() {
        Document doc = new Document("tipo_identificacion", tipoIdentificacion)
                .append("identificacion", identificacion)
                .append("fecha_nacimiento", fechaNacimiento)
                .append("edad", edad)
                .append("primer_nombre", primerNombre)
                .append("segundo_nombre", segundoNombre)
                .append("primer_apellido", primerApellido)
                .append("segundo_apellido", segundoApellido)
                .append("sexo", sexo)
                .append("orientacion_sexual", orientacionSexual)
                .append("identidad_genero", identidadGenero)
                .append("nacionalidad", nacionalidad)
                .append("auto_identificacion_etnica", autoIdentificacionEtnica);
        return doc;
    }

}