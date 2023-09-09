package espe.edu.ec.model;

import org.bson.Document;

public class LugarResidencia {
    private String provincia;
    private String canton;
    private String parroquia;
    private String telefonoPaciente;
    private String telefonoFamiliar;
    private String direccionDomicilio;

    public LugarResidencia() {
    }

    public LugarResidencia(String provincia, String canton, String parroquia, String telefonoPaciente, String telefonoFamiliar, String direccionDomicilio) {
        this.provincia = provincia;
        this.canton = canton;
        this.parroquia = parroquia;
        this.telefonoPaciente = telefonoPaciente;
        this.telefonoFamiliar = telefonoFamiliar;
        this.direccionDomicilio = direccionDomicilio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }

    public String getTelefonoPaciente() {
        return telefonoPaciente;
    }

    public void setTelefonoPaciente(String telefonoPaciente) {
        this.telefonoPaciente = telefonoPaciente;
    }

    public String getTelefonoFamiliar() {
        return telefonoFamiliar;
    }

    public void setTelefonoFamiliar(String telefonoFamiliar) {
        this.telefonoFamiliar = telefonoFamiliar;
    }

    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }

    @Override
    public String toString() {
        return "LugarResidencia{" + "provincia=" + provincia + ", canton=" + canton + ", parroquia=" + parroquia + ", telefonoPaciente=" + telefonoPaciente + ", telefonoFamiliar=" + telefonoFamiliar + ", direccionDomicilio=" + direccionDomicilio + '}';
    }
    
    public Document toDocument() {
        Document doc = new Document("provincia", provincia)
                .append("canton", canton)
                .append("parroquia", parroquia)
                .append("telefono_paciente", telefonoPaciente)
                .append("telefono_familiar", telefonoFamiliar)
                .append("direccion_domicilio", direccionDomicilio);
        return doc;
    }
}