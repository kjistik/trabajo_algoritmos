package utils;

import java.util.Scanner;

public class PersistentMenu {
    public static void displaySubMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println(utils.AnsiColors.ANSI_CYAN
                + "Bienvenido al servicio de registro de siniestros de Pepito Corp." + utils.AnsiColors.ANSI_RESET);
        System.out.println("========================================================================================");
        System.out.print("# " + utils.AnsiColors.ANSI_YELLOW + "1. " + utils.AnsiColors.ANSI_RESET
                + "Registrar Nuevo Siniestro");
        System.out.print(
                utils.AnsiColors.ANSI_YELLOW + " 2. " + utils.AnsiColors.ANSI_RESET + "Ver Siniestros almacenados ");
        System.out.print(utils.AnsiColors.ANSI_YELLOW + " 3. " + utils.AnsiColors.ANSI_RESET + "Admin Panel ");
        System.out.println(utils.AnsiColors.ANSI_YELLOW + " 0. " + utils.AnsiColors.ANSI_RESET + "Salir " + "#");
        System.out.println("========================================================================================");
        System.out.print("Ingresar opción: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Bienvenido al registro de ingreso de nuevos incidentes.");
                System.out.println(utils.AnsiColors.ANSI_YELLOW
                        + "Todos los datos son obligatorios al menos que se especifique lo contrario."
                        + utils.AnsiColors.ANSI_RESET);
                System.out.println(
                        "========================================================================================");

                Scanner input = new Scanner(System.in); // Capturamos el input del user
                // Empezamos por datos especificos del denunciante.
                System.out.print(utils.AnsiColors.ANSI_CYAN + "Nombre del denunciante:" + utils.AnsiColors.ANSI_RESET);
                String nombreDenunciante = input.nextLine();
                System.out
                        .print(utils.AnsiColors.ANSI_CYAN + "Apellido del denunciante:" + utils.AnsiColors.ANSI_RESET);
                String apellidoDenunciante = input.nextLine();
                System.out.print(utils.AnsiColors.ANSI_CYAN + "Número de documento del denunciante:"
                        + utils.AnsiColors.ANSI_RESET);
                long dniDenunciante = Long.parseLong(input.nextLine());
                System.out.print(utils.AnsiColors.ANSI_CYAN + "Teléfono de contacto del denunciante:"
                        + utils.AnsiColors.ANSI_RESET);
                long telefonoDenunciante = Long.parseLong(input.nextLine());
                System.out.print(utils.AnsiColors.ANSI_CYAN + "Correo electrónico del denunciante:"
                        + utils.AnsiColors.ANSI_RESET);
                String emailDenunciante = input.nextLine();

                // informacion vehiculo asegurado
                // marca, modelo, año y patente

                System.out.print(utils.AnsiColors.ANSI_CYAN + "\nMarca del vehículo del denunciante:"
                        + utils.AnsiColors.ANSI_RESET);
                String marcaVehiculo = input.nextLine();
                System.out.print(utils.AnsiColors.ANSI_CYAN + "Modelo del vehículo:" + utils.AnsiColors.ANSI_RESET);
                String modeloVehiculo = input.nextLine();
                System.out.print(utils.AnsiColors.ANSI_CYAN + "Año del vehículo:" + utils.AnsiColors.ANSI_RESET);
                int anioVehiculo = Integer.parseInt(input.nextLine());
                System.out.print(utils.AnsiColors.ANSI_CYAN + "Patente del vehículo:" + utils.AnsiColors.ANSI_RESET);
                String patenteVehiculo = input.nextLine();

                // informacion del accidente
                // fecha, hora, lugar, descripcion y daños

                System.out.print(
                        utils.AnsiColors.ANSI_CYAN + "\nFecha del siniestro (DDMMAAAA):" + utils.AnsiColors.ANSI_RESET);
                int fechaSiniestro = Integer.parseInt(input.nextLine());
                System.out
                        .print(utils.AnsiColors.ANSI_CYAN + "Hora del siniestro (HHMM):" + utils.AnsiColors.ANSI_RESET);
                int horaSiniestro = Integer.parseInt(input.nextLine());
                System.out.print(utils.AnsiColors.ANSI_CYAN + "Lugar del hecho (Localidad, Dirección):"
                        + utils.AnsiColors.ANSI_RESET);
                String lugarSiniestro = input.nextLine();
                System.out.print(utils.AnsiColors.ANSI_CYAN + "Descripción del hecho:" + utils.AnsiColors.ANSI_RESET);
                String descripcionSiniestro = input.nextLine();
                System.out.print(
                        utils.AnsiColors.ANSI_CYAN + "Descripción de los daños totales:" + utils.AnsiColors.ANSI_RESET);
                String danosSiniestro = input.nextLine();

                // Preguntamos que tipos de daños existen y asignamos booleanos para los 3
                // tipos.
                // Dependiendo que tipo sea verdadero, procedemos a mostrar esos menús.
                // Nisman Did Nothing Wrong!!!
                System.out.println(
                        "========================================================================================");

                System.out.print(utils.AnsiColors.ANSI_CYAN
                        + "Hay Lesiones corporales? Ingrese \"y\" si existen, \"n\" si no existen:"
                        + utils.AnsiColors.ANSI_RESET);
                String lesionesBool = input.nextLine();
                System.out.print(utils.AnsiColors.ANSI_CYAN
                        + "Hay daños a vehículos? Ingrese \"y\" si existen, \"n\" si no existen:"
                        + utils.AnsiColors.ANSI_RESET);
                String vehiculosDanadosBool = input.nextLine();
                System.out.print(utils.AnsiColors.ANSI_CYAN
                        + "Hay daños a propiedades? Ingrese \"y\" si existen, \"n\" si no existen:"
                        + utils.AnsiColors.ANSI_RESET);
                String propiedadesDanadasBool = input.nextLine();
                
                System.out.println(
                        "========================================================================================");

                break;
            case 2:
                System.out.println(
                        utils.AnsiColors.ANSI_GREEN + "Base de datos de Siniestros" + utils.AnsiColors.ANSI_RESET);
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

        System.out.println(); // Dejamos linea en blanco por que queda mas lindo

        sc.close();
    }
}
