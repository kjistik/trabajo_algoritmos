package Clases;

import Persistencia.Data;

public class Siniestro {
    String fecha;
    String hora;
    String lugar;
    String descripcion;
    String danios;
    int id;
    int id_asegurado;

public static String displayInfo(int a) {
        return Data.incidentes.get(a).toString();
    }

    @Override
    public String toString() {
        return "\nIncidente ocurrido a las " + hora + " en " + lugar + "\nDescripción del hecho: "
                + descripcion + "\nDescripción de los daños: " + danios
                + "\nSe encontró involucrado el siguiente vehículo: " + Asegurado.displayInfo(id_asegurado) + "\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_asegurado() {
        return id_asegurado;
    }

    public void setId_asegurado(int id_asegurado) {
        this.id_asegurado = id_asegurado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDanios() {
        return danios;
    }

    public void setDanios(String danios) {
        this.danios = danios;
    }

}
