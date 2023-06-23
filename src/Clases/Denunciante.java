package Clases;

public class Denunciante {

    String nombre;
    String apellido;
    String correo;
    String telefono;
    Integer DNI;
    int id;
    int id_denunciante;

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

    int id_asegurado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer dNI) {
        DNI = dNI;
    }

}
