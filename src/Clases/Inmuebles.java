package Clases;

public class Inmuebles {
    Boolean seguro;
    String denunciaInterna;
    String certificado;
    String fotos;
    String impuesto; // domicilio del bien dañado y nombre del propietario.
    int dni;
    double presupuesto;
    int id;
    int id_siniestro;

    public int getId_siniestro() {
        return id_siniestro;
    }

    public void setId_siniestro(int id_siniestro) {
        this.id_siniestro = id_siniestro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getSeguro() {
        return seguro;
    }

    public void setSeguro(Boolean seguro) {
        this.seguro = seguro;
    }

    public String getDenunciaInterna() {
        return denunciaInterna;
    }

    public void setDenunciaInterna(String denunciaInterna) {
        this.denunciaInterna = denunciaInterna;
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

    public String getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(String impuesto) {
        this.impuesto = impuesto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return "Inmueble\n" +
                "\nId: " + id +
                "\nSeguro: " + seguro +
                "\nDenuncia Interna: " + denunciaInterna +
                "\nDni: " + dni +
                "\nCertificado: " + certificado +
                "\nFotos: " + fotos +
                "\nImpuestos: " + impuesto +
                "\nPresupuesto: " + presupuesto +
                "\nRegistrado en el siguiente incidente:\n" + Siniestro.displayInfo(id_siniestro);
    }
}
