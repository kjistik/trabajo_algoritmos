package Persistencia;

import java.util.ArrayList;
import Clases.Asegurado;
import Clases.Denunciante;
import Clases.Inmuebles;
import Clases.Lesiones;
import Clases.Mueble;
import Clases.Siniestro;
import Clases.SiniestroVehiculo;

public class Data {

	public static int id_asegurados = -1;

	public static int getId_asegurados() {
		return id_asegurados;
	}

	public static void increase_asegurados() {
		id_asegurados++;
	}

	public static int id_incidentes = -1;

	public static int getId_incidentes() {
		return id_incidentes;
	}

	public static void increase_incidentes() {
		id_incidentes++;
	}

	static int id_denunciantes = -1;

	public static int getId_denunciantes() {
		return id_denunciantes;
	}

	public static void increase() {
		id_denunciantes++;
	}

	public static ArrayList<Denunciante> denunciantes = new ArrayList<Denunciante>();

	public static Denunciante getDenunciante(int index) {
		try {
			return denunciantes.get(index);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}

	public static void mostrarDenunciantes() {
		if (denunciantes_registrados()) {
			for (Denunciante denunciante : denunciantes) {
				System.out.println(denunciante.getId() + " - " + denunciante.getDNI());
			}
		}

	}

	public static boolean denunciantes_registrados() {
		if (denunciantes.size() == 0) {
			return false;
		} else {
			for (Denunciante denunciante : denunciantes) {
				if (denunciante.equals(null)) {
					return false;
				}
			}
		}

		return true;
	}

	public static void add_denunciante(Denunciante denunciante) {
		denunciantes.add(denunciante);
	}

	static ArrayList<Siniestro> incidentes = new ArrayList<Siniestro>();

	public static void add_siniestro(Siniestro incidente) {
		incidentes.add(incidente);
	}

	public static Siniestro getInsidenteById(int index) {
		try {

			return incidentes.get(index);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}

	static ArrayList<Asegurado> asegurados = new ArrayList<Asegurado>();

	public static void mostrarAsegurados() {
		if (asegurados_registrados()) {
			for (Asegurado asegurado : asegurados) {
				System.out.println(asegurado.getId_asegurado() + " - " + asegurado.getPatente());
			}
		}

	}

	public static Asegurado getAseguradoById(int index) {
		try {
			return asegurados.get(index);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}

	public static boolean asegurados_registrados() {
		if (asegurados.size() == 0) {
			return false;
		} else {
			for (Asegurado asegurado : asegurados) {
				if (asegurado.equals(null)) {
					return false;
				}
			}
		}

		return true;
	}

	public static void add_asegurado(Asegurado asegurado) {
		asegurados.add(asegurado);
	}

	public static int id_damages = -1;

	static ArrayList<Object> damages = new ArrayList<Object>();

	public static void increase_damages() {
		id_damages++;
	}

	public static int getId_damages() {
		return id_damages;
	}

	public static void add_damages(Object damage) {
		damages.add(damage);
	}

	public static ArrayList<Object> getDamagesBySiniestroId(int siniestroId) {

		ArrayList<Object> result = new ArrayList<Object>();

		for (Object damage : damages) {
			if (damage instanceof SiniestroVehiculo && ((SiniestroVehiculo) damage).getId_siniestro() == siniestroId) {
				result.add(damage);
			} else if (damage instanceof Lesiones && ((Lesiones) damage).getId_siniestro() == siniestroId) {
				result.add(damage);
			} else if (damage instanceof Mueble && ((Mueble) damage).getId_siniestro() == siniestroId) {
				result.add(damage);
			} else if (damage instanceof Inmuebles && ((Inmuebles) damage).getId_siniestro() == siniestroId) {
				result.add(damage);
			}
		}
		return result;
	}
}
