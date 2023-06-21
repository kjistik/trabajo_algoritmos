package Logica;

import java.util.InputMismatchException;
import java.util.Scanner;
import Clases.Asegurado;
import Clases.Denunciante;
import Clases.Inmuebles;
import Clases.Siniestro;
import Clases.SiniestroVehiculo;
import Clases.Lesiones;
import Clases.Mueble;
import utils.AnsiColors;

public class Core {
	Scanner input = new Scanner(System.in);
	Denunciante infoDenunciante = new Denunciante();
	Asegurado infoAsegurado = new Asegurado();
	Siniestro infoSiniestro = new Siniestro();
	Lesiones infoLesiones = new Lesiones();
	SiniestroVehiculo infoSiniestroVehiculo = new SiniestroVehiculo(false, false, null, null, null, null, null, null, getInput());
	Mueble infoMueble = new Mueble(false, null, null, null, null, null, getLong(), getInput());
	Inmuebles infoInmuebles = new Inmuebles();

	InputValidator validator = new InputValidator();

	String nombresCompuesto = "^([A-Z][A-Za-z ,.'`-]{3,30})$";
	String dniComp = "^[0-9]{7,8}$";
	String telRegex = "^\\+[0-9]{1,2}-[0-9]{2,4}-[0-9]{6,8}$";
	String eMailRegex = "^[A-Za-z0-9]+@[a-z]+\\.[a-z]+$";
	String anyComp = "^[A-Za-z0-9]{1,10}$";
	String anoSimple = "^[0-9]{4}$";
	String patenteComp = "^(\\D){3}(\\d){3}$|^((\\D){2}(\\d){3}(\\D){2})$";

	String fechaRegex = "^\\d{2}/\\d{2}/\\d{4}$";
	String horaRegex = "^([01]\\d|2[0-3]):([0-5]\\d)$";
	String locationRegex = "^[A-Za-z ,]*, [A-Za-z ,]* \\d+$";
	String simpleText = "^[A-Za-z ,.!?]*, [A-Za-z ,.!?]*$";

	public void cargarInfoDenuciante() {
		
		String setNombreError = "El o los nombres deben estan en mayúsculas: ";
        System.out.print(utils.AnsiColors.ANSI_CYAN + "Nombre del denunciante: " + utils.AnsiColors.ANSI_RESET);
        infoDenunciante.setNombre(validator.getRegexNombres(nombresCompuesto, setNombreError));
		
		String setApellidoError = "El o los apellidos deben estan en mayúsculas: ";
		System.out.print(utils.AnsiColors.ANSI_CYAN + "Apellido del denunciante: " + utils.AnsiColors.ANSI_RESET);
		infoDenunciante.setApellido(validator.getRegexNombres(nombresCompuesto, setApellidoError));

		String setDniError = "El input debe ser números válidos: ";
		System.out.print(utils.AnsiColors.ANSI_CYAN + "Número de documento del denunciante: " + utils.AnsiColors.ANSI_RESET);
		infoDenunciante.setDNI(validator.getRegexNumeros(dniComp, setDniError));

		String setTelefonoError = "El formato correcto es +x-xxxx-xxxxxx: ";
		System.out.print(utils.AnsiColors.ANSI_CYAN + "Teléfono de contacto del denunciante En formato valido de Argentina: " + utils.AnsiColors.ANSI_RESET);
		infoDenunciante.setTelefono(validator.getRegexStringComp(telRegex,setTelefonoError));

		String setEmailError = "El email debe ser correcto: ";
		System.out.print(utils.AnsiColors.ANSI_CYAN + "Correo electrónico del denunciante:" + utils.AnsiColors.ANSI_RESET);
		infoDenunciante.setCorreo(validator.getRegexStringComp(eMailRegex, setEmailError));
	}

	public void cargarInfoVehiculo() {
		String setMarcaError = "El nombre debe empezar en mayúsculas: ";
		System.out.print(utils.AnsiColors.ANSI_CYAN + "\nMarca del vehículo del denunciante:" + utils.AnsiColors.ANSI_RESET);
		infoAsegurado.setMarca(validator.getRegexNombres(nombresCompuesto, setMarcaError));

		String setModeloError = "El modelo debe empezar en mayúsculas: ";
		System.out.print(utils.AnsiColors.ANSI_CYAN + "Modelo del vehículo:" + utils.AnsiColors.ANSI_RESET);
		infoAsegurado.setModelo(validator.getRegexNombres(anyComp, setModeloError));

		String setAnioError = "El año debe ser válido: ";
		System.out.print(utils.AnsiColors.ANSI_CYAN + "Año del vehículo:" + utils.AnsiColors.ANSI_RESET);
		infoAsegurado.setAnio(validator.getRegexNumeros(anoSimple, setAnioError));

		String setApellidoError = "El formato correcto puede ser XXX### o XX###XX: ";
		System.out.print(utils.AnsiColors.ANSI_CYAN + "Patente del vehículo:" + utils.AnsiColors.ANSI_RESET);
		infoAsegurado.setPatente(validator.getRegexNombres(patenteComp, setApellidoError));

	}

	public void cargarInfoAccidentes() {

		String setFechaError = "El formato correcto debe ser DD/MM/AAAA: ";
		System.out.print(utils.AnsiColors.ANSI_CYAN + "\nFecha del siniestro (DD/MM/AAAA):"
				+ utils.AnsiColors.ANSI_RESET);
		infoSiniestro.setFecha(validator.getRegexStringComp(fechaRegex, setFechaError));

		String setHoraError = "El formato correcto debe ser HH:MM: ";
		System.out.print(utils.AnsiColors.ANSI_CYAN + "Hora del siniestro (HH:MM):"
				+ utils.AnsiColors.ANSI_RESET);
		infoSiniestro.setHora(validator.getRegexStringComp(horaRegex, setHoraError));

		String setLugarError = "La cadena solo puede contener Letras, comas y números: ";
		System.out.print(utils.AnsiColors.ANSI_CYAN + "Lugar del hecho (Localidad, Dirección):"
				+ utils.AnsiColors.ANSI_RESET);
		infoSiniestro.setLugar(validator.getRegexStringComp(locationRegex, setLugarError));

		String setDescripcionError = "La cadena solo puede contener Letras, comas, puntos y números: ";
		System.out.print(utils.AnsiColors.ANSI_CYAN + "Descripción del hecho:"
				+ utils.AnsiColors.ANSI_RESET);
		infoSiniestro.setDescripcion(validator.getRegexStringComp(simpleText, setDescripcionError));

		String setDaniosError = "La cadena solo puede contener Letras, comas, puntos y números: ";
		System.out.print(utils.AnsiColors.ANSI_CYAN + "Descripción de los daños totales:"
				+ utils.AnsiColors.ANSI_RESET);
		infoSiniestro.setDanios(validator.getRegexStringComp(simpleText, setDaniosError));
	}


	public  void setBooleanDeTiposDeDanios() {
		System.out.print("\n" + AnsiColors.ANSI_CYAN
				+ "Hay Lesiones corporales? Ingrese \"y\" si existen, \"n\" si no existen:"
				+ AnsiColors.ANSI_RESET);
		Boolean lesionesBool = getBool();
		System.out.print(AnsiColors.ANSI_CYAN
				+ "Hay daños a vehículos? Ingrese \"y\" si existen, \"n\" si no existen:"
				+ AnsiColors.ANSI_RESET);
		Boolean vehiculosDanadosBool = getBool();
		System.out.print(AnsiColors.ANSI_CYAN
				+ "Hay daños a de muebles? Ingrese \"y\" si existen, \"n\" si no existen:"
				+ AnsiColors.ANSI_RESET);
		Boolean mueblesDanadosBool = getBool();
		System.out.print(AnsiColors.ANSI_CYAN
				+ "Hay daños a propiedades? Ingrese \"y\" si existen, \"n\" si no existen:"
				+ AnsiColors.ANSI_RESET);
		Boolean inmueblesDanadosBool = getBool();

		//Empezamos a setear las cosillas sino no terminamo mà.
		//Nisman did nothing wrong! ! !

		if(lesionesBool){
			System.out.print(utils.AnsiColors.ANSI_CYAN + "El afectado tiene cobertura? Ingrese \"y\" si tiene, \"n\" si no tiene: " + utils.AnsiColors.ANSI_RESET);
			infoLesiones.setCovertura(getBool());
			
			String setDenunError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Ingrese el número de denuncia: " + utils.AnsiColors.ANSI_RESET);
			infoLesiones.setDenuncia_int(validator.getRegexNumeros(anoSimple, setDenunError));
			
			String setCertificadoError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Ingrese el certificado de denuncia: " + utils.AnsiColors.ANSI_RESET);
			infoLesiones.setCertificado(validator.getRegexNombres(anyComp, setCertificadoError));
			
			
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Ingrese el certificado de salud de la víctima: " + utils.AnsiColors.ANSI_RESET);
			infoLesiones.setCert_salud(validator.getRegexNombres(anyComp, setCertificadoError));
			
			String setDniError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Ingrese el DNI de la víctima: " + utils.AnsiColors.ANSI_RESET);
			infoLesiones.setDni(validator.getRegexNumeros(dniComp, setDniError));
			
			String setLesionadoError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "No estoy seguro que es esto: " + utils.AnsiColors.ANSI_RESET);
			infoLesiones.setLesionado(validator.getRegexNumeros(dniComp, setLesionadoError));
		}

		if(vehiculosDanadosBool){
			System.out.print(utils.AnsiColors.ANSI_CYAN + "El vehículo cuenta con cobertura? Ingrese \"y\" si tiene, \"n\" si no tiene: " + utils.AnsiColors.ANSI_RESET);
			infoSiniestroVehiculo.setCobertura(getBool());

			System.out.print(utils.AnsiColors.ANSI_CYAN + "El vehículo pertenece a una franquicia? Ingrese \"y\" si tiene, \"n\" si no tiene: " + utils.AnsiColors.ANSI_RESET);
			infoSiniestroVehiculo.setFranquicia(getBool());

			String setDenunIntError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Ingrese la identificación de denuncia interna: " + utils.AnsiColors.ANSI_RESET);
			infoSiniestroVehiculo.setDenunciaInterna(validator.getRegexStringComp(anyComp, setDenunIntError));

			String setCertCobertError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Ingrese el certificado de cobertura del vahículo: " + utils.AnsiColors.ANSI_RESET);
			infoSiniestroVehiculo.setCertificadoCobertura(validator.getRegexStringComp(anyComp, setCertCobertError));

			String setNotaFranqError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Ingrese la Nota de Franquicia del vahículo: " + utils.AnsiColors.ANSI_RESET);
			infoSiniestroVehiculo.setNotaFranquicia(validator.getRegexStringComp(anyComp, setNotaFranqError));

			String setLicencConducirError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Ingrese la licencia de conducir del conductor: " + utils.AnsiColors.ANSI_RESET);
			infoSiniestroVehiculo.setLicenciaConducir(validator.getRegexStringComp(anyComp, setLicencConducirError));

			String setTarjVerdeError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Ingrese la tarjeta verde del vehículo: " + utils.AnsiColors.ANSI_RESET);
			infoSiniestroVehiculo.setTarjetaVerde(validator.getRegexStringComp(anyComp, setTarjVerdeError));

			String setFotoError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Cargue las fotos aquí: " + utils.AnsiColors.ANSI_RESET);
			infoSiniestroVehiculo.setFotoVehiculos(validator.getRegexStringComp(anyComp, setFotoError));

			String setPresupuestoError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Ingrese el presupuesto obtenido para el vehículo: " + utils.AnsiColors.ANSI_RESET);
			infoSiniestroVehiculo.setPresupuestoReparacion(validator.getRegexNumeros(anoSimple, setPresupuestoError));
		}

		if(mueblesDanadosBool){
			System.out.print(utils.AnsiColors.ANSI_CYAN + "La propiedad cuenta con cobertura? Ingrese \"y\" si tiene, \"n\" si no tiene: " + utils.AnsiColors.ANSI_RESET);
			infoMueble.setSeguros(getBool());

			String setDenunIntError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Ingrese la identificación de denuncia interna: " + utils.AnsiColors.ANSI_RESET);
			infoMueble.setDenuncia_interna(validator.getRegexStringComp(anyComp, setDenunIntError));

			String setCertCobertError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Ingrese el certificado de cobertura del mueble: " + utils.AnsiColors.ANSI_RESET);
			infoMueble.setCertificado(validator.getRegexStringComp(anyComp, setCertCobertError));

			String setDescError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Ingrese descripción de los daños producidos al mueble: " + utils.AnsiColors.ANSI_RESET);
			infoMueble.setDescripcion(validator.getRegexStringComp(anyComp, setDescError));

			String setFotoError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Cargue las fotos aquí: " + utils.AnsiColors.ANSI_RESET);
			infoMueble.setFotos(validator.getRegexStringComp(anyComp, setFotoError));

			// String setFacturaError = "El formato es inválido: ";
			// System.out.print(utils.AnsiColors.ANSI_CYAN + "Ingrese Facturas o recibos que contenga la dirección del mueble: " + utils.AnsiColors.ANSI_RESET);
			// infoMueble.setFactura(input);

			String setDniError = "El input debe ser números válidos: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Número de documento del dueño del mueble: " + utils.AnsiColors.ANSI_RESET);
			infoMueble.setDni(validator.getRegexNumeros(dniComp, setDniError));

			String setPresupuestoError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Ingrese el presupuesto obtenido para el mueble: " + utils.AnsiColors.ANSI_RESET);
			infoMueble.setPresupuesto(validator.getRegexNumeros(anoSimple, setPresupuestoError));
		}

		if(inmueblesDanadosBool){
			System.out.print(utils.AnsiColors.ANSI_CYAN + "El bien inmueble cuenta con cobertura? Ingrese \"y\" si tiene, \"n\" si no tiene: " + utils.AnsiColors.ANSI_RESET);
			infoInmuebles.setSeguro(getBool());

			String setDenunIntError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Ingrese la identificación de denuncia interna: " + utils.AnsiColors.ANSI_RESET);
			infoInmuebles.setDenunciaInterna(validator.getRegexStringComp(anyComp, setDenunIntError));

			String setCertCobertError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Ingrese el certificado de cobertura del bien inmueble: " + utils.AnsiColors.ANSI_RESET);
			infoInmuebles.setCertificado(validator.getRegexStringComp(anyComp, setCertCobertError));

			String setFotosError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Cargue las fotos aquí: " + utils.AnsiColors.ANSI_RESET);
			infoInmuebles.setFotos(validator.getRegexStringComp(anyComp, setFotosError));

			// String setInpuestoError = "El formato es inválido: ";
			// System.out.print(utils.AnsiColors.ANSI_CYAN + "Ingrese Facturas o recibos que contenga la dirección del mueble: " + utils.AnsiColors.ANSI_RESET);
			// infoInmueble.setInpuesto(input);

			String setDniError = "El input debe ser números válidos: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Número de documento del dueño del mueble: " + utils.AnsiColors.ANSI_RESET);
			infoInmuebles.setDni(validator.getRegexNumeros(dniComp, setDniError));

			String setPresupuestoError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Ingrese el presupuesto obtenido para el inmueble: " + utils.AnsiColors.ANSI_RESET);
			infoInmuebles.setPresupuesto(validator.getRegexNumeros(anoSimple, setPresupuestoError));
		}
	}

	public void cargarTiposDeDanios() {
		
	}

	

	public Boolean getBool(){
		String value;
		boolean valid = false;
		Boolean result = false;
		do {
			try {
				value = input.nextLine();
				if(value.equals("y")){
					valid = true;
					return result = true;
				}
				if(value.equals("n")){
					valid = true;
					return result = false;
				}
				if (!valid) {
					valid = false;
					System.out.println(AnsiColors.ANSI_RED
							+ "Input incorrecto, ingresa 'y' o 'n'." + AnsiColors.ANSI_RESET);
				}
			} catch (InputMismatchException e) {
				System.out.println(AnsiColors.ANSI_RED
						+ "Input incorrecto, ingresa 'y' o 'n'." + AnsiColors.ANSI_RESET);
				valid = false;
				input.nextLine();
			}
		} while (!valid);
		return result;
	}

	public long getLong() {
		long value;
		boolean valid;
		do {
			try {
				value = input.nextLong();
				input.nextLine();
				valid = true;
				return value;
			} catch (InputMismatchException e) {
				System.out.println(AnsiColors.ANSI_RED
						+ "Ese input no es correcto, intente de nuevo" + AnsiColors.ANSI_RESET);
				valid = false;
				input.nextLine();
			}
		} while (!valid);
		
		return -1;
	}

	public int getInput() {
		int value;
		boolean valid;
		do {
			try {
				value = input.nextInt();
				input.nextLine();
				valid = true;
				return value;
			} catch (InputMismatchException e) {
				System.out.println(AnsiColors.ANSI_RED
						+ "Ese input no es correcto, intente de nuevo" + AnsiColors.ANSI_RESET);
				valid = false;
				input.nextLine();
			}
		} while (!valid);
		
		return -1;

	}
}
