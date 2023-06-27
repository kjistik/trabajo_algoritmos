package Logica;

import utils.PersistentMenu;

public class Menu {

	Logica logica = new Logica();

	public void InfoGetters() {
		int choice;
		boolean salir = false;
		do {
			PersistentMenu.displaySubMenu();
			choice = logica.getInput();
			switch (choice) {
				case 1:
					logica.cargarDatosSiniestros();
					break;
				case 2:
					System.out.println(utils.AnsiColors.ANSI_GREEN + "Base de datos de Siniestros"
							+ utils.AnsiColors.ANSI_RESET);
					// Lógica de siniestros almacenados previamentes¿?
					break;
				case 0:
					System.out.println(utils.AnsiColors.ANSI_RED + "Exiting the menu"
							+ utils.AnsiColors.ANSI_RESET);
					salir = !salir;
					break;
				default:
					System.out.println("Opción no válida. Intenta nuevamente.");
			}
		} while (!salir);
		System.exit(choice);
	}

}
