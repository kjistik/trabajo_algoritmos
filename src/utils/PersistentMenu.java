package utils;

public class PersistentMenu {
	public static void displaySubMenu() {

				final String equalSeparador = "=".repeat(72);

		System.out.println(utils.AnsiColors.ANSI_CYAN
				+ "Bienvenido al servicio de registro de siniestros de Pepito Corp."
				+ utils.AnsiColors.ANSI_RESET);
		System.out.println(equalSeparador);
		System.out.print("# " + utils.AnsiColors.ANSI_YELLOW + "1. " + utils.AnsiColors.ANSI_RESET
				+ "Registrar Nuevo Siniestro");
		System.out.print(
				utils.AnsiColors.ANSI_YELLOW + " 2. " + utils.AnsiColors.ANSI_RESET
						+ "Ver Siniestros almacenados ");
		System.out.println(
				utils.AnsiColors.ANSI_YELLOW + " 0. " + utils.AnsiColors.ANSI_RESET + "Salir " + "#");
		System.out.println(equalSeparador);
		System.out.print("Ingresar opción: ");

	}
}
