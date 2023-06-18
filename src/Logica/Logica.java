package Logica;

public class Logica {
	
	Core metodo = new Core();
	public void cargarDatosSiniestros() {
		String equalSeparador =
				"========================================================================================";
		// Capturamos la opción del usuario en base al menu principal.
		System.out.println(equalSeparador);
		System.out.println("Bienvenido al registro de ingreso de nuevos incidentes.");
		System.out.println(utils.AnsiColors.ANSI_YELLOW
				+ "Todos los datos son obligatorios al menos que se especifique lo contrario."
				+ utils.AnsiColors.ANSI_RESET);
		System.out.println(equalSeparador);
		
		// Capturamos el input del user
		// Empezamos por datos especificos del denunciante.
		metodo.cargarInfoDenuciante();

		// informacion vehiculo asegurado
		// marca, modelo, año y patente
		metodo.cargarInfoVehiculo();

		// informacion del accidente
		// fecha, hora, lugar, descripcion y daños
		metodo.cargarInfoAccidentes();

		// Preguntamos que tipos de daños existen y asignamos booleanos para los 3
		// tipos.
		System.out.println(equalSeparador);
		metodo.setBooleanDeTiposDeDanios();
		// Dependiendo que tipo sea verdadero, procedemos a mostrar esos menús.
		metodo.cargarTiposDeDanios();
		System.out.println(equalSeparador);
	}

	public int getInput(){
		return metodo.getInput();
	}

	public Long getLong(){
		return metodo.getLong();
	}
}
