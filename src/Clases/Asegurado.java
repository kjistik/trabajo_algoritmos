package Clases;

public class Asegurado {
    String marca;
    String modelo;
    String patente;
    Integer anio;
    int id_denunciante;

    public String getMarca() {
        return marca;
    }

    public int getId_denunciante() {
        return id_denunciante;
    }

    public void setId_denunciante(int id_denunciante) {
        this.id_denunciante = id_denunciante;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

}
