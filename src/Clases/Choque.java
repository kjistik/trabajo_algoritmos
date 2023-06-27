package Clases;

public class Choque {
    boolean seguro;
    boolean franquicia;
    boolean tar_verde;
    boolean boleto;
    String denuncia_int;
    String certificado;
    String nota_franquicia;
    String boletoCompraVenta;
    String foto;
    long licencia;
    double presupuesto;
    int id;
    int id_asegurado;

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

    public Boolean getSeguro() {
        return seguro;
    }

    public void setSeguro(Boolean seguro) {
        this.seguro = seguro;
    }

    public Boolean getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(Boolean franquicia) {
        this.franquicia = franquicia;
    }

    public Boolean getTar_verde() {
        return tar_verde;
    }

    public void setTar_verde(Boolean tar_verde) {
        this.tar_verde = tar_verde;
    }

    public Boolean getBoleto() {
        return boleto;
    }

    public void setBoleto(Boolean boleto) {
        this.boleto = boleto;
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

    public String getNota_franquicia() {
        return nota_franquicia;
    }

    public void setNota_franquicia(String nota_franquicia) {
        this.nota_franquicia = nota_franquicia;
    }

    public String getBoletoCompraVenta() {
        return boletoCompraVenta;
    }

    public void setBoletoCompraVenta(String boletoCompraVenta) {
        this.boletoCompraVenta = boletoCompraVenta;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public long getLicencia() {
        return licencia;
    }

    public void setLicencia(long licencia) {
        this.licencia = licencia;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
}
