package Clases;

public class Inmuebles {
    Boolean seguro;
    String denunciaIntern;
    String certificado;
    String fotos;
    String[] impuesto; // domicilio del bien dañado y nombre del propietario.
    Long dni;
    double presupuesto;

    public Boolean getSeguro() {
        return seguro;
    }

    public void setSeguro(Boolean seguro) {
        this.seguro = seguro;
    }

    public String getDenunciaIntern() {
        return denunciaIntern;
    }

    public void setDenunciaIntern(String denunciaIntern) {
        this.denunciaIntern = denunciaIntern;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public String getFotos() {
        return fotos;
    }

    public void setFotos(String fotos) {
        this.fotos = fotos;
    }

    public String[] getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(String[] impuesto) {
        this.impuesto = impuesto;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
}
