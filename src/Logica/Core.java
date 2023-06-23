// Definimos que Core va a ser parte del paquete Logica
package Logica;

// Importamos 2 utilidades de la libreria de utilidades de Java
import java.util.InputMismatchException;
import java.util.Scanner;
// Importamos las clases propias que vamos a usar
import Clases.Asegurado;
import Clases.Denunciante;
import Clases.Inmuebles;
import Clases.Lesiones;
import Clases.Mueble;
import Clases.Siniestro;
import Clases.SiniestroVehiculo;
import Persistencia.Data;
// Importamos los colores ANSI para usarlos en la consola
import utils.AnsiColors;

public class Core {
	Scanner sc = new Scanner(System.in);
	// Instanciamos cada una de las clases que vamos a utilizar y le asignamos un "info" + "Clase"
	// como nombre
	Denunciante infoDenunciante = new Denunciante();
	Asegurado infoAsegurado = new Asegurado();
	Siniestro infoSiniestro = new Siniestro();
	Lesiones infoLesiones = new Lesiones();
	SiniestroVehiculo infoSiniestroVehiculo = new SiniestroVehiculo();
	Mueble infoMueble = new Mueble();
	Inmuebles infoInmuebles = new Inmuebles();

	// Instanciamos el validador de Expresiones Regulares y le asignamos el nombre validator
	InputValidator validator = new InputValidator();

	// Definimos un diccionario con los valores Regex que vamos a utilizar. Cada uno cumple una
	// función especifica
	String nombresCompuesto = "^([A-Z][A-Za-z ,.'`-]{3,30})$";
	String dniComp = "^[0-9]{7,8}$";
	String telRegex = "^\\+[0-9]{1,2}-[0-9]{2,4}-[0-9]{6,8}$";
	String eMailRegex = "^[A-Za-z0-9]+@[a-z]+\\.[a-z]+$";
	String anyComp = "^[A-Za-z0-9]{1,10}$";
	String anoSimple = "^[0-9]{4}$";
	String patenteComp = "^(\\D){3}(\\d){3}$|^((\\D){2}(\\d){3}(\\D){2})$";
	String fechaRegex = "^\\d{2}/\\d{2}/\\d{4}$";
	String horaRegex = "^([01]\\d|2[0-3]):([0-5]\\d)$";
	String locationRegex = "^[A-Za-z ,]+, [A-Za-z \\d]+ \\d{1,5}$";
	String simpleText = "^[A-Za-z ,.!?]*, [A-Za-z ,.!?]*$";

	// Este es el metodo Principal que se encarga de pedir los datos que vamos a cargar en las
	// clases que instanciamos arriba...
	// Una breve explicación de solo el primer input que pide para entender que hace el resto del
	// método:
	// String setNombreError = "El o los nombres deben estan en mayúsculas: ";
	// **Esto es solo un String que vamos a utilizar como mensaje de error **/
	// System.out.print(utils.AnsiColors.ANSI_CYAN + "Nombre del denunciante: " +
	// utils.AnsiColors.ANSI_RESET);
	// ** Aca simplemente imprimimos en pantalla lo que le estamos pidiendo al usuario **/
	// ** En este caso es el Nombre del denunciante **/
	// infoDenunciante.setNombre(validator.getRegexNombres(nombresCompuesto, setNombreError));
	// ** Acá pasan varias cosas asi que separado esto en varios comentarios... **/
	// ** infoDenunciante es la INSTANCIA de Denunciante**/
	// ** .setNombre() Es un método de la clase Denunciante donde le vamos a pasar un valor**/
	// ** El valor que le vamos a pasar se lo pedimos a validator que es la INSTANCIA de
	// InputValidator **/
	// ** .getRegexNombres() es un método del InputValidator que recibe dos parametros **/
	// ** el primer parametro es el Regex que va a utilizar el input **/
	// ** el segundo parametro es el error que va a imprimir en consola si no acepta el input**/
	public void cargarInfoDenuciante() {
		Data.increase();
		infoDenunciante.setId(Data.getId_denunciantes());

		String setNombreError = "El o los nombres deben estan capitalizados (Eduardo, Alba): ";
		System.out.print(utils.AnsiColors.ANSI_CYAN + "Nombre del denunciante: "
				+ utils.AnsiColors.ANSI_RESET);
		infoDenunciante.setNombre(validator.getRegexNombres(nombresCompuesto, setNombreError));

		String setApellidoError = "El o los apellidos deben estan en mayúsculas: ";
		System.out.print(utils.AnsiColors.ANSI_CYAN + "Apellido del denunciante: "
				+ utils.AnsiColors.ANSI_RESET);
		infoDenunciante.setApellido(validator.getRegexNombres(nombresCompuesto, setApellidoError));

		String setDniError = "El input debe ser números válidos: ";
		System.out.print(utils.AnsiColors.ANSI_CYAN + "Número de documento del denunciante: "
				+ utils.AnsiColors.ANSI_RESET);
		infoDenunciante.setDNI(validator.getRegexNumeros(dniComp, setDniError));

		String setTelefonoError = "El formato correcto es +x-xxxx-xxxxxx: ";
		System.out.print(utils.AnsiColors.ANSI_CYAN
				+ "Teléfono de contacto del denunciante En formato valido de Argentina: "
				+ utils.AnsiColors.ANSI_RESET);
		infoDenunciante.setTelefono(validator.getRegexStringComp(telRegex, setTelefonoError));

		String setEmailError = "El email debe ser correcto: ";
		System.out.print(utils.AnsiColors.ANSI_CYAN + "Correo electrónico del denunciante:"
				+ utils.AnsiColors.ANSI_RESET);
		infoDenunciante.setCorreo(validator.getRegexStringComp(eMailRegex, setEmailError));

		Data.add_denunciante(infoDenunciante);
	}

	// Este metodo es practicamente igual al anterior
	// pero ahora le pedimos al usuario datos del vehículo siniestrado
	public void cargarInfoVehiculo() {
		String setMarcaError = "El nombre debe empezar en mayúsculas: ";
		System.out.print(utils.AnsiColors.ANSI_CYAN + "\nMarca del vehículo del denunciante:"
				+ utils.AnsiColors.ANSI_RESET);
		infoAsegurado.setMarca(validator.getRegexNombres(nombresCompuesto, setMarcaError));

		String setModeloError = "El modelo debe empezar en mayúsculas: ";
		System.out.print(
				utils.AnsiColors.ANSI_CYAN + "Modelo del vehículo:" + utils.AnsiColors.ANSI_RESET);
		infoAsegurado.setModelo(validator.getRegexNombres(anyComp, setModeloError));

		String setAnioError = "El año debe ser válido: ";
		System.out.print(
				utils.AnsiColors.ANSI_CYAN + "Año del vehículo:" + utils.AnsiColors.ANSI_RESET);
		infoAsegurado.setAnio(validator.getRegexNumeros(anoSimple, setAnioError));

		String setApellidoError = "El formato correcto puede ser XXX### o XX###XX: ";
		System.out.print(
				utils.AnsiColors.ANSI_CYAN + "Patente del vehículo:" + utils.AnsiColors.ANSI_RESET);
		infoAsegurado.setPatente(validator.getRegexNombres(patenteComp, setApellidoError));

	}

	// Lo mismo acá, este método hace lo mismo que los 2 anteriores
	// Pero pide los datos precisos del accidente.
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

		String setDescripcionError =
				"La cadena solo puede contener Letras, comas, puntos y números: ";
		System.out.print(utils.AnsiColors.ANSI_CYAN + "Descripción del hecho:"
				+ utils.AnsiColors.ANSI_RESET);
		infoSiniestro.setDescripcion(validator.getRegexStringComp(simpleText, setDescripcionError));

		String setDaniosError = "La cadena solo puede contener Letras, comas, puntos y números: ";
		System.out.print(utils.AnsiColors.ANSI_CYAN + "Descripción de los daños totales:"
				+ utils.AnsiColors.ANSI_RESET);
		infoSiniestro.setDanios(validator.getRegexStringComp(simpleText, setDaniosError));
	}

	// Acá mande todo en un mismo método
	// *** ACLARACIÓN ***/
	// Este metodo realiza 2 acciones a diferencia de los otros 3
	// La primera parte le pide al usuario confirmación si existen:
	// 1. Lesiones 2. Daños a Vehículos 3. Daños a muebles 4. Daños a propiedades Inmuebles
	// La segunda parte la comento más abajo
	public void setBooleanDeTiposDeDanios() {
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

		// Acá chequeamos si el usuario afirmó que hay lesiones
		// Si hay lesiones se ejecuta lo siguiente y pedimos los datos
		// requeridos para cargar a la Clase Lesiones

		if (lesionesBool) {
			System.out.print(utils.AnsiColors.ANSI_CYAN
					+ "El afectado tiene cobertura? Ingrese \"y\" si tiene, \"n\" si no tiene: "
					+ utils.AnsiColors.ANSI_RESET);
			infoLesiones.setCovertura(getBool());

			String setDenunError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Ingrese el número de denuncia: "
					+ utils.AnsiColors.ANSI_RESET);
			infoLesiones.setDenuncia_int(validator.getRegexNumeros(anoSimple, setDenunError));

			// Checkeamos que Lesiones.getCovertura
			// este seteado en true para pedir los datos de certificado
			if (infoLesiones.getCovertura()) {
				String setCertificadoError = "El formato es inválido: ";
				System.out.print(utils.AnsiColors.ANSI_CYAN + "Ingrese el certificado de denuncia: "
						+ utils.AnsiColors.ANSI_RESET);
				infoLesiones
						.setCertificado(validator.getRegexNombres(anyComp, setCertificadoError));
			}

			String setCertSaludError = "El formato es inválido: ";
			System.out.print(
					utils.AnsiColors.ANSI_CYAN + "Ingrese el certificado de salud de la víctima: "
							+ utils.AnsiColors.ANSI_RESET);
			infoLesiones.setCert_salud(validator.getRegexNombres(anyComp, setCertSaludError));

			String setDniError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Ingrese el DNI de la víctima: "
					+ utils.AnsiColors.ANSI_RESET);
			infoLesiones.setDni(validator.getRegexNumeros(dniComp, setDniError));

			String setLesionadoError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "No estoy seguro que es esto: "
					+ utils.AnsiColors.ANSI_RESET);
			infoLesiones.setLesionado(validator.getRegexNumeros(dniComp, setLesionadoError));
		}

		// Lo mismo acá. Si el usuario marcó que hay daños vehiculares
		// habilitamos estos input para cargar la Clase SiniestroVehiculo
		if (vehiculosDanadosBool) {
			System.out.print(utils.AnsiColors.ANSI_CYAN
					+ "El vehículo cuenta con cobertura? Ingrese \"y\" si tiene, \"n\" si no tiene: "
					+ utils.AnsiColors.ANSI_RESET);
			infoSiniestroVehiculo.setCobertura(getBool());

			System.out.print(utils.AnsiColors.ANSI_CYAN
					+ "El vehículo pertenece a una franquicia? Ingrese \"y\" si tiene, \"n\" si no tiene: "
					+ utils.AnsiColors.ANSI_RESET);
			infoSiniestroVehiculo.setFranquicia(getBool());

			String setDenunIntError = "El formato es inválido: ";
			System.out.print(
					utils.AnsiColors.ANSI_CYAN + "Ingrese la identificación de denuncia interna: "
							+ utils.AnsiColors.ANSI_RESET);
			infoSiniestroVehiculo
					.setDenunciaInterna(validator.getRegexStringComp(anyComp, setDenunIntError));

			// Misma lógica acá, si el usuario marco que el vehiculo tiene seguro
			// pedimos el certificado de seguro
			if (infoSiniestroVehiculo.getCobertura()) {
				String setCertCobertError = "El formato es inválido: ";
				System.out.print(utils.AnsiColors.ANSI_CYAN
						+ "Ingrese el certificado de cobertura del vahículo: "
						+ utils.AnsiColors.ANSI_RESET);
				infoSiniestroVehiculo.setCertificadoCobertura(
						validator.getRegexStringComp(anyComp, setCertCobertError));
			}

			String setNotaFranqError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN
					+ "Ingrese la Nota de Franquicia del vahículo: " + utils.AnsiColors.ANSI_RESET);
			infoSiniestroVehiculo
					.setNotaFranquicia(validator.getRegexStringComp(anyComp, setNotaFranqError));

			String setLicencConducirError = "El formato es inválido: ";
			System.out.print(
					utils.AnsiColors.ANSI_CYAN + "Ingrese la licencia de conducir del conductor: "
							+ utils.AnsiColors.ANSI_RESET);
			infoSiniestroVehiculo.setLicenciaConducir(
					validator.getRegexStringComp(anyComp, setLicencConducirError));

			String setTarjVerdeError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Ingrese la tarjeta verde del vehículo: "
					+ utils.AnsiColors.ANSI_RESET);
			infoSiniestroVehiculo
					.setTarjetaVerde(validator.getRegexStringComp(anyComp, setTarjVerdeError));

			String setFotoError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Cargue las fotos aquí: "
					+ utils.AnsiColors.ANSI_RESET);
			infoSiniestroVehiculo
					.setFotoVehiculos(validator.getRegexStringComp(anyComp, setFotoError));

			String setPresupuestoError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN
					+ "Ingrese el presupuesto obtenido para el vehículo: "
					+ utils.AnsiColors.ANSI_RESET);
			infoSiniestroVehiculo.setPresupuestoReparacion(
					validator.getRegexNumeros(anoSimple, setPresupuestoError));
		}

		// Lo mismo acá, si el usuario marcó que hay daños a Muebles
		// habilitamos la toma de datos de la Clase Mueble
		if (mueblesDanadosBool) {
			System.out.print(utils.AnsiColors.ANSI_CYAN
					+ "La propiedad cuenta con cobertura? Ingrese \"y\" si tiene, \"n\" si no tiene: "
					+ utils.AnsiColors.ANSI_RESET);
			infoMueble.setSeguros(getBool());

			String setDenunIntError = "El formato es inválido: ";
			System.out.print(
					utils.AnsiColors.ANSI_CYAN + "Ingrese la identificación de denuncia interna: "
							+ utils.AnsiColors.ANSI_RESET);
			infoMueble.setDenuncia_interna(validator.getRegexStringComp(anyComp, setDenunIntError));

			// Misma lógica, si Mueble tiene cobertura
			// habilitamos este input para pedir el certificado
			if (infoMueble.getSeguro()) {
				String setCertCobertError = "El formato es inválido: ";
				System.out.print(utils.AnsiColors.ANSI_CYAN
						+ "Ingrese el certificado de cobertura del mueble: "
						+ utils.AnsiColors.ANSI_RESET);
				infoMueble
						.setCertificado(validator.getRegexStringComp(anyComp, setCertCobertError));
			}

			String setDescError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN
					+ "Ingrese descripción de los daños producidos al mueble: "
					+ utils.AnsiColors.ANSI_RESET);
			infoMueble.setDescripcion(validator.getRegexStringComp(anyComp, setDescError));

			String setFotoError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Cargue las fotos aquí: "
					+ utils.AnsiColors.ANSI_RESET);
			infoMueble.setFotos(validator.getRegexStringComp(anyComp, setFotoError));

			String setFacturaError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN
					+ "Ingrese Facturas o recibos que contenga la dirección del mueble: "
					+ utils.AnsiColors.ANSI_RESET);
			infoMueble.setFactura(validator.getRegexStringComp(anyComp, setFacturaError));

			String setDniError = "El input debe ser números válidos: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN
					+ "Número de documento del dueño del mueble: " + utils.AnsiColors.ANSI_RESET);
			infoMueble.setDni(validator.getRegexNumeros(dniComp, setDniError));

			String setPresupuestoError = "El formato es inválido: ";
			System.out.print(
					utils.AnsiColors.ANSI_CYAN + "Ingrese el presupuesto obtenido para el mueble: "
							+ utils.AnsiColors.ANSI_RESET);
			infoMueble.setPresupuesto(validator.getRegexNumeros(anoSimple, setPresupuestoError));
		}

		// Lo mismo acá, si el usuario marcó que hay daños a pripiedades
		// inmuebles habilitamos esto para pedir por input
		// y cargar la Clase Inmueble con los datos
		if (inmueblesDanadosBool) {
			System.out.print(utils.AnsiColors.ANSI_CYAN
					+ "El bien inmueble cuenta con cobertura? Ingrese \"y\" si tiene, \"n\" si no tiene: "
					+ utils.AnsiColors.ANSI_RESET);
			infoInmuebles.setSeguro(getBool());

			String setDenunIntError = "El formato es inválido: ";
			System.out.print(
					utils.AnsiColors.ANSI_CYAN + "Ingrese la identificación de denuncia interna: "
							+ utils.AnsiColors.ANSI_RESET);
			infoInmuebles
					.setDenunciaInterna(validator.getRegexStringComp(anyComp, setDenunIntError));

			// Misma lógica, si el usuario confirma que el Inmueble
			// tiene seguro, habilitamos el input para requerir
			// el certificado de seguro del Inmueble
			if (infoInmuebles.getSeguro()) {
				String setCertCobertError = "El formato es inválido: ";
				System.out.print(utils.AnsiColors.ANSI_CYAN
						+ "Ingrese el certificado de cobertura del bien inmueble: "
						+ utils.AnsiColors.ANSI_RESET);
				infoInmuebles
						.setCertificado(validator.getRegexStringComp(anyComp, setCertCobertError));
			}

			String setFotosError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN + "Cargue las fotos aquí: "
					+ utils.AnsiColors.ANSI_RESET);
			infoInmuebles.setFotos(validator.getRegexStringComp(anyComp, setFotosError));

			String setImpuestoError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN
					+ "Ingrese Facturas o recibos que contenga la dirección del mueble: "
					+ utils.AnsiColors.ANSI_RESET);
			infoInmuebles.setImpuesto(validator.getRegexStringComp(anyComp, setImpuestoError));

			String setDniError = "El input debe ser números válidos: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN
					+ "Número de documento del dueño del mueble: " + utils.AnsiColors.ANSI_RESET);
			infoInmuebles.setDni(validator.getRegexNumeros(dniComp, setDniError));

			String setPresupuestoError = "El formato es inválido: ";
			System.out.print(utils.AnsiColors.ANSI_CYAN
					+ "Ingrese el presupuesto obtenido para el inmueble: "
					+ utils.AnsiColors.ANSI_RESET);
			infoInmuebles.setPresupuesto(validator.getRegexNumeros(anoSimple, setPresupuestoError));
		}
	}

	// El siguiente método se encarga de aceptar "y" y "n" como input
	// y asignar el valor true para "y" y false para "n"
	// El método se encarga tanto de pedir el input como de retornar un valor Booleano
	public Boolean getBool() {
		String value;
		boolean valid = false;
		Boolean result = false;
		do {
			// El bloque try se ejecuta si el usuario ingresa una letra
			try {
				value = sc.nextLine();
				// Checkeamos que el usuario puso "y"
				if (value.equals("y")) {
					valid = true;
					// Hacemos un retorno de true
					return result = true;
				}
				// Checkeamos que el usuario puso "n"
				if (value.equals("n")) {
					valid = true;
					// Retornamos false
					return result = false;
				}
				// Si el usuario puso cualquier letra menos "y" o "n" devolvemos este mensaje
				if (!valid) {
					valid = false;
					System.out.println(AnsiColors.ANSI_RED + "Input incorrecto, ingresa 'y' o 'n'."
							+ AnsiColors.ANSI_RESET);
				}
				// Si el usuario pone cualquier cosa menos una letra devuelta devolvemos error
			} catch (InputMismatchException e) {
				System.out.println(AnsiColors.ANSI_RED + "Input incorrecto, ingresa 'y' o 'n'."
						+ AnsiColors.ANSI_RESET);
				valid = false;
				sc.nextLine();
			}
			// El while hace que el bloque DO de arriba se ejecute hasta que el usuario
			// ponga "y" o "n"
			// mientras mande fruta el bucle continua infinitamente
		} while (!valid);
		return result;
	}

	// Este método se encarga de checkear que el usuario haya ingresado un Long
	// Me di cuenta que no lo estamos utilizando en ningun lado asi que lo comento pero queda como
	// un mito historico de la evolucion de la aplicación
	// public long getLong() {
	// long value;
	// boolean valid;
	// do {
	// //Si el usuario ingresa un Long el try asigna a value el valor del input y retorna
	// try {
	// value = sc.nextLong();
	// sc.nextLine();
	// valid = true;
	// return value;
	// //Si pone cualquier fruta tira error
	// } catch (InputMismatchException e) {
	// System.out.println(AnsiColors.ANSI_RED
	// + "Ese input no es correcto, intente de nuevo" + AnsiColors.ANSI_RESET);
	// valid = false;
	// sc.nextLine();
	// }
	// //Mientras que el usuario se haga el vivo
	// //esto se va a ejecutar indefinidamente hasta que ponga
	// //un input valido
	// } while (!valid);

	// return -1;
	// }

	// Este método se encarga de tomar el input de la consola
	// y checkea que sea un Entero
	public int getInput() {
		int value;
		boolean valid;
		do {
			// Si es un entero retornamos el valor que puso el usuario
			try {
				value = sc.nextInt();
				sc.nextLine();
				valid = true;
				return value;
				// Si puso cualquier cosa manda error
			} catch (InputMismatchException e) {
				System.out.println(AnsiColors.ANSI_RED
						+ "Ese input no es correcto, intente de nuevo" + AnsiColors.ANSI_RESET);
				valid = false;
				sc.nextLine();
			}
			// Pedimos el input la cantidad de veces que sea necesaria
			// hasta que el usuario ponga una opción válida
		} while (!valid);

		return -1;

	}
}
