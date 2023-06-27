package Clases;

// Define la clase.
public class SiniestroVehiculo {
    // Declara y se incian las variables en falso.
    boolean cobertura = false;
    boolean franquicia = false;

    // Se declaran el resto de variables.
    String denunciaInterna;
    String certificadoCobertura;
    String notaFranquicia;
    String licenciaConducir;
    String tarjetaVerde;
    String fotoVehiculos;
    int presupuestoReparacion;
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

    // Constructor: inicializa las propiedades de la clase.
    // public SiniestroVehiculo(
    // boolean cobertura,
    // boolean franquicia,
    // String denunciaInterna,
    // String certificadoCobertura,
    // String notaFranquicia,
    // String licenciaConducir,
    // String tarjetaVerde,
    // String fotoVehiculos,
    // int presupuestoReparacion) {
    // this.cobertura = cobertura;
    // this.franquicia = franquicia;
    // this.denunciaInterna = denunciaInterna;
    // this.certificadoCobertura = certificadoCobertura;
    // this.notaFranquicia = notaFranquicia;
    // this.licenciaConducir = licenciaConducir;
    // this.tarjetaVerde = tarjetaVerde;
    // this.fotoVehiculos = fotoVehiculos;
    // this.presupuestoReparacion = presupuestoReparacion;
    // }

    // Métodos para poder acceder y modificar las propiedades de la clase (get y
    // set).
    public void setCobertura(boolean cobertura) {
        this.cobertura = cobertura;
    }

    public boolean getCobertura() {
        return cobertura;
    }

    public boolean isFranquicia() {
        return franquicia;
    }

    public void setFranquicia(boolean franquicia) {
        this.franquicia = franquicia;
    }

    public String getDenunciaInterna() {
        return denunciaInterna;
    }

    public void setDenunciaInterna(String denunciaInterna) {
        this.denunciaInterna = denunciaInterna;
    }

    public String getCertificadoCobertura() {
        return certificadoCobertura;
    }

    public void setCertificadoCobertura(String certificadoCobertura) {
        this.certificadoCobertura = certificadoCobertura;
    }

    public String getNotaFranquicia() {
        return notaFranquicia;
    }

    public void setNotaFranquicia(String notaFranquicia) {
        this.notaFranquicia = notaFranquicia;
    }

    public String getLicenciaConducir() {
        return licenciaConducir;
    }

    public void setLicenciaConducir(String licenciaConducir) {
        this.licenciaConducir = licenciaConducir;
    }

    public String getTarjetaVerde() {
        return tarjetaVerde;
    }

    public void setTarjetaVerde(String tarjetaVerde) {
        this.tarjetaVerde = tarjetaVerde;
    }

    public String getFotoVehiculos() {
        return fotoVehiculos;
    }

    public void setFotoVehiculos(String fotoVehiculos) {
        this.fotoVehiculos = fotoVehiculos;
    }

    public int getPresupuestoReparacion() {
        return presupuestoReparacion;
    }

    public void setPresupuestoReparacion(int presupuestoReparacion) {
        this.presupuestoReparacion = presupuestoReparacion;
    }

    public int getId_siniestro() {
        return id_siniestro;
    }

    public void setId_siniestro(int id_sinistro) {
        this.id_siniestro = id_sinistro;
    }
}
