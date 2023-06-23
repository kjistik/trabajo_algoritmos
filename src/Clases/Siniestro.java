package Clases;

public class Siniestro {
    String fecha;
    String hora;
    String lugar;
    String descripcion;
	String danios;
    int id;
    int id_denunciante;
    int id_asegurado;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId_denunciante() {
        return id_denunciante;
    }
    public void setId_denunciante(int id_denunciante) {
        this.id_denunciante = id_denunciante;
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
