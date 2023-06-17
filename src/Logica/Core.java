package Logica;

import java.util.InputMismatchException;
import utils.AnsiColors;
import java.util.Scanner;
import Clases.*;

public class Core {
	Scanner input = new Scanner(System.in);
	Denunciante infoDenunciante = new Denunciante();
	Asegurado infoAsegurado = new Asegurado();


	public void cargarInfoDenuciante() {
		System.out.print(utils.AnsiColors.ANSI_CYAN + "Nombre del denunciante:" + utils.AnsiColors.ANSI_RESET);
		infoDenunciante.setNombre(input.nextLine());
		
		System.out.print(utils.AnsiColors.ANSI_CYAN + "Apellido del denunciante:" + utils.AnsiColors.ANSI_RESET);
		infoDenunciante.setApellido(input.nextLine());

		System.out.print(utils.AnsiColors.ANSI_CYAN + "Número de documento del denunciante:" + utils.AnsiColors.ANSI_RESET);
		infoDenunciante.setDNI(getLong());

		System.out.print(utils.AnsiColors.ANSI_CYAN + "Teléfono de contacto del denunciante:" + utils.AnsiColors.ANSI_RESET);
	
		infoDenunciante.setTelefono(getLong());

		System.out.print(utils.AnsiColors.ANSI_CYAN + "Correo electrónico del denunciante:" + utils.AnsiColors.ANSI_RESET);
	
		infoDenunciante.setCorreo(input.nextLine());
	}

	public void cargarInfoVehiculo() {
		System.out.print(utils.AnsiColors.ANSI_CYAN + "\nMarca del vehículo del denunciante:" + utils.AnsiColors.ANSI_RESET);
		infoAsegurado.setMarca(input.nextLine());

		System.out.print(utils.AnsiColors.ANSI_CYAN + "Modelo del vehículo:" + utils.AnsiColors.ANSI_RESET);
		infoAsegurado.setModelo(input.nextLine());

		System.out.print(utils.AnsiColors.ANSI_CYAN + "Año del vehículo:" + utils.AnsiColors.ANSI_RESET);
		infoAsegurado.setAño(getInput());

		System.out.print(utils.AnsiColors.ANSI_CYAN + "Patente del vehículo:" + utils.AnsiColors.ANSI_RESET);
		infoAsegurado.setPatente(input.nextLine());

	}

	public void cargarInfoAccidentes() {
		System.out.print(utils.AnsiColors.ANSI_CYAN + "\nFecha del siniestro (DDMMAAAA):"
				+ utils.AnsiColors.ANSI_RESET);
		int fechaSiniestro = getInput();

		System.out.print(utils.AnsiColors.ANSI_CYAN + "Hora del siniestro (HHMM):"
				+ utils.AnsiColors.ANSI_RESET);
		int horaSiniestro = getInput();

		System.out.print(utils.AnsiColors.ANSI_CYAN + "Lugar del hecho (Localidad, Dirección):"
				+ utils.AnsiColors.ANSI_RESET);
		String lugarSiniestro = input.nextLine();

		System.out.print(utils.AnsiColors.ANSI_CYAN + "Descripción del hecho:"
				+ utils.AnsiColors.ANSI_RESET);
		String descripcionSiniestro = input.nextLine();

		System.out.print(utils.AnsiColors.ANSI_CYAN + "Descripción de los daños totales:"
				+ utils.AnsiColors.ANSI_RESET);
		String danosSiniestro = input.nextLine();
	}


	public void cargarTiposDeDaños() {
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

	}

	public Boolean getBool(){
		String value;
		boolean valid = false;
		Boolean result = false;
		do {
			try {
				value = input.nextLine();
				valid = value.equals("y") || value.equals("n");
				if(input.equals("y")){
					valid = true;
					return result = true;
				}
				if(input.equals("n")){
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
