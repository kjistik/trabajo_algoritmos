package Persistencia;

import java.util.ArrayList;
import Clases.Asegurado;
import Clases.Denunciante;

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

	static ArrayList<Denunciante> denunciantes = new ArrayList<Denunciante>();

	public static void add_denunciante(Denunciante denunciante) {
		denunciantes.add(denunciante);
	}

	static ArrayList<Object> incidentes = new ArrayList<Object>();

	public static void add_incidente(Object incidente) {
		incidentes.add(incidente);
	}

	static ArrayList<Asegurado> asegurados = new ArrayList<Asegurado>();

	public static void add_asegurado(Asegurado asegurado) {
		asegurados.add(asegurado);
	}

}
