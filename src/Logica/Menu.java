package Logica;

import java.util.Scanner;


public class Menu {
	public static void InfoGetters() {
		Logica app = new Logica();
		Scanner sc = new Scanner(System.in); // Capturamos la opción del usuario en base a el menú
												// principal.
		int choice = app.getInput();
		switch (choice) {
			case 1:
				Logica.cargaDeSiniestros();
				break;
			case 2:
				System.out.println(utils.AnsiColors.ANSI_GREEN + "Base de datos de Siniestros"
						+ utils.AnsiColors.ANSI_RESET);
				// Lógica de siniestros almacenados previamentes¿?
				break;
			case 3:
				System.out.println(
						utils.AnsiColors.ANSI_RED + "Admin Panel" + utils.AnsiColors.ANSI_RESET);
				// Lógica de "Admin Panel"
				break;
			case 0:
				System.out.println(utils.AnsiColors.ANSI_RED + "Exiting the menu"
						+ utils.AnsiColors.ANSI_RESET);
				System.exit(choice);
				break;
			default:
				System.out.println("Opción no válida. Intenta nuevamente.");
		}

		choice = app.getInput();
		sc.close();
	}


}
