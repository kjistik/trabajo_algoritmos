package Clases;

public class Lesiones {
    Boolean covertura;
    String denuncia_int;
    String certificado;
    String cert_salud;
    long dni;
    long lesionado;

    public Boolean getCovertura() {
        return covertura;
    }

    public void setCovertura(Boolean covertura) {
        this.covertura = covertura;
    }

    public String getDenuncia_int() {
        return denuncia_int;
    }

    public void setDenuncia_int(String denuncia_int) {
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

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public Long getLesionado() {
        return lesionado;
    }

    public void setLesionado(Long lesionado) {
        this.lesionado = lesionado;
    }
}
