package Clases;

public class Lesiones {
    Boolean covertura;
    int denuncia_int;
    String certificado;
    String cert_salud;
    int dni;
    int lesionado;
    int id;
    int id_denunciante;
    int id_asegurado;
    int id_siniestro;

    
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


    public Boolean getCovertura() {
        return covertura;
    }

    public void setCovertura(Boolean covertura) {
        this.covertura = covertura;
    }

    public int getDenuncia_int() {
        return denuncia_int;
    }

    public void setDenuncia_int(int denuncia_int) {
        this.denuncia_int = denuncia_int;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public String getCert_salud() {
        return cert_salud;
    }

    public void setCert_salud(String cert_salud) {
        this.cert_salud = cert_salud;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getLesionado() {
        return lesionado;
    }

    public void setLesionado(int lesionado) {
        this.lesionado = lesionado;
    }

    public int getId_siniestro() {
        return id_siniestro;
    }

    public void setId_siniestro(int id_siniestro) {
        this.id_siniestro = id_siniestro;
    }
    
}
