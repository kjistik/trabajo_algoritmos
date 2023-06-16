package Logica;

import java.util.Scanner;


public class Menu {

	Scanner sc = new Scanner(System.in);
	Logica logica = new Logica();

	public void InfoGetters() {


		int choice = logica.getInput();
		switch (choice) {
			case 1:
				logica.cargarDatosSiniestros();
				break;
			case 2:
				System.out.println(utils.AnsiColors.ANSI_GREEN + "Base de datos de Siniestros"
						+ utils.AnsiColors.ANSI_RESET);
				// // L+ogica de siniestros almacenados previamentes¿?
				// break;
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
		sc.close();
	}

}
