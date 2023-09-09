package espe.edu.ec.model;

import org.bson.Document;


public class DatosAntropometricos {
    private double peso;
    private double talla;
    private double imc;

    public DatosAntropometricos() {
    }

    public DatosAntropometricos(double peso, double talla) {
        this.peso = peso;
        this.talla = talla;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public Document toDocument() {
        Document doc = new Document("peso", (double)peso)
                .append("talla", (double)talla)
                .append("imc", (double)imc);
        return doc;
    }
    
}
