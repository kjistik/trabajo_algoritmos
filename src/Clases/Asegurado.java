package Clases;

import Persistencia.Data;

public class Asegurado {
    String marca;
    String modelo;
    String patente;
    Integer anio;
    int id_denunciante;
    int id_asegurado;

    public static String displayInfo(int a) {
        return Data.asegurados.get(a).toString();
    }

    @Override
    public String toString() {
        return "Vehículo " + marca + " " + modelo + " del año " + anio + " con la patente N° " + patente
                + "\nRegistrado por: \n" + Denunciante.displayInfo(id_denunciante);
    }

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

    public int getId_asegurado() {
        return id_asegurado;
    }

    public void setId_asegurado(int id_asegurado) {
        this.id_asegurado = id_asegurado;
    }

}
