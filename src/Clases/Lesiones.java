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
}
