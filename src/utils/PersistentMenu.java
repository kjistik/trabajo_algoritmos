package utils;
import java.util.Scanner;

public class PersistentMenu {
    public static void displaySubMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        
            System.out.println(utils.AnsiColors.ANSI_CYAN + "Bienvenido al servicio de registro de siniestros de Pepito Corp." + utils.AnsiColors.ANSI_RESET);
            System.out.println("========================================================================================");
            System.out.print("# " + utils.AnsiColors.ANSI_YELLOW + "1. " + utils.AnsiColors.ANSI_RESET + "Registrar Nuevo Siniestro");
            System.out.print(utils.AnsiColors.ANSI_YELLOW + " 2. " + utils.AnsiColors.ANSI_RESET + "Ver Siniestros almacenados ");
            System.out.print(utils.AnsiColors.ANSI_YELLOW + " 3. " + utils.AnsiColors.ANSI_RESET + "Admin Panel ");
            System.out.println(utils.AnsiColors.ANSI_YELLOW + " 0. " + utils.AnsiColors.ANSI_RESET + "Salir " + "#");
            System.out.println("========================================================================================");
            System.out.print("Ingresar opción: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Bienvenido al registro de ingreso de nuevos incidentes.");
                    System.out.println("Todos los datos que se piden a continuación son requeridos al menos que se especifique lo contrario.");
                    
                    // utils.PersistentMenu.displaySubMenu();
                    
                    break;
                case 2:
                    System.out.println(utils.AnsiColors.ANSI_GREEN + "Base de datos de Siniestros" + utils.AnsiColors.ANSI_RESET);
                    // L+ogica de siniestros almacenados previamentes¿?
                    break;
                case 3:
                    System.out.println(utils.AnsiColors.ANSI_RED + "Admin Panel" + utils.AnsiColors.ANSI_RESET);
                    // Lógica de "Admin Panel"
                    break;
                case 0:
                    System.out.println(utils.AnsiColors.ANSI_RED + "Exiting the menu" + utils.AnsiColors.ANSI_RESET);
                    System.exit(choice);
                    break;
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }

            System.out.println(); // Dejamos linea en blanco

        sc.close();
    }
}
