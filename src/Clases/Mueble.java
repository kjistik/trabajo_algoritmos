package Clases;

//Define la clase.
public class Mueble {
    //Declara las variables
    boolean seguro;
    String denuncia_interna, certificado, descripcion, fotos;
    String factura;
    long dni;
    double presupuesto;
    int id;
    int id_denunciante;
    int id_asegurado;
    
    //Constructor: inicializa las propiedades de la clase.
    // public Mueble(boolean seguros,
    // String denuncia_interna,
    // String certificado,
    // String descripcion,
    // String fotos,
    // String[] factura, 
    // long dni, 
    // double presupuesto) {
        
    //     this.seguros = seguros;
    //     this.denuncia_interna = denuncia_interna;
    //     this.certificado = certificado;
    //     this.descripcion = descripcion;
    //     this.fotos = fotos;
    //     this.factura = factura;
    //     this.dni = dni;
    //     this.presupuesto = presupuesto;
    // }
    //Métodos para poder acceder y modificar las propiedades de la clase (get y set).
    public boolean getSeguro() {
        return seguro;
    }
    public void setSeguros(boolean seguro) {
        this.seguro = seguro;
    }
    public String getDenuncia_interna() {
        return denuncia_interna;
    }
    public void setDenuncia_interna(String denuncia_interna) {
        this.denuncia_interna = denuncia_interna;
    }
    public String getCertificado() {
        return certificado;
    }
    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getFotos() {
        return fotos;
    }
    public void setFotos(String fotos) {
        this.fotos = fotos;
    }
    public String getFactura() {
        return factura;
    }
    public void setFactura(String factura) {
        this.factura = factura;
    }
    public long getDni() {
        return dni;
    }
    public void setDni(long dni) {
        this.dni = dni;
    }
    public double getPresupuesto() {
        return presupuesto;
    }
    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

}
