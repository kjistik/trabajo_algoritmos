//Seteamos a este archivo como parte del paquete Logica
package Logica;

public class Logica {

	// Instanciamos a la clase Core
	// que es la clase que se va a encargar
	// de hacer todo el trabajo de pedir los inputs al usuario
	Core metodo = new Core();
	boolean salir = false;

	public void cargarDatosSiniestros() {
		String equalSeparador = "=".repeat(72);
		// Capturamos la opción del usuario en base al menu principal.
		System.out.println(equalSeparador);
		System.out.println("Bienvenido al registro de ingreso de nuevos incidentes.");
		System.out.println(utils.AnsiColors.ANSI_YELLOW
				+ "Todos los datos son obligatorios al menos que se especifique lo contrario."
				+ utils.AnsiColors.ANSI_RESET);
		System.out.println(equalSeparador);

		do {
			System.out.println(
					"1: nuevo denunciante, 2: nuevo vehículo asegurado, 3:nuevo incidente, 4: nuevo daño, 0 salir");
			switch (metodo.getInput()) {
				case 1:
					// Capturamos el input del user
					// Empezamos por datos especificos del denunciante.
					// *** ACLARACIÓN ***/
					// Acá solo estamos llamando a cargarInfoDenunciante()
					// que se encuentra en Core
					metodo.cargarInfoDenuciante();
					break;
				case 2:
					// informacion vehiculo asegurado
					// marca, modelo, año y patente
					// *** ACLARACIÓN ***/
					// Acá solo estamos llamando a cargarInfoVehiculo()
					// que se encuentra en Core
					metodo.cargarInfoVehiculo();
					break;
				case 3:
					// informacion del accidente
					// fecha, hora, lugar, descripcion y daños
					// *** ACLARACIÓN ***/
					// Acá solo estamos llamando a cargarInfoAccidente()
					// que se encuentra en Core
					metodo.cargarInfoAccidentes();
					break;
				case 4:
					// Preguntamos que tipos de daños existen y asignamos booleanos para los 3
					// tipos.
					// Dependiendo que tipo sea verdadero, procedemos a mostrar esos menús... o
					// menues?.
					// *** ACLARACIÓN ***/
					// Acá solo estamos llamando a setBooleanDeTiposDeDanios()
					// que se encuentra en Core
					System.out.println(equalSeparador);
					metodo.setBooleanDeTiposDeDanios();
					System.out.println(equalSeparador);
					break;
				case 0:
					salir = true;
					break;
			}
		} while (!salir);
	}

	// Llamamos a getInput para utilizarlo en Menu.java
	// para más información de este metodo
	// rederigirse a Core.java
	public int getInput() {
		return metodo.getInput();
	}

	// public Long getLong(){
	// return metodo.getLong();
	// }

	public void getInfo() {
		metodo.getInfo();
	}
}
