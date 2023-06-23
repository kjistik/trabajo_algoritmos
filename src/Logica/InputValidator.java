//Declaramos al InputValidator como un paquete de Logica
package Logica;

//Importamos de el paquete de utilidades de Java lo siguiente:
import java.util.InputMismatchException;
import java.util.Scanner;

//Importamos de la carpeta utilidad propia los colores ANSI para usar en consola
import utils.AnsiColors;

public class InputValidator {
	//Instanciamos al Scanner con el nombre de input que se encarga de pedir los datos
	Scanner input = new Scanner(System.in);

	//*** ACLARACIÓN ***/
	//Doy una breve introduccion al primer método
	//los 2 siguientes cumplen una funcion similar
	//Y la lógica es la misma
	//getRegexNombres es el nombre del método
	//(String regex, String errorString) son los parametros que le pasamos cuando invocamos
	//estos metodos, a estos metodos lo estamos invocando desde Core.java desde los metodos
	//cargarInfoDenunciante() cargarInfoAccidentes etc...
	//regex es el valor de Expresión regular que vamos a utilizar 
	//errorString es un simple string que hace que el método no devuelva siempre el mismo mensaje
	//asi que devolvemos el error que nos parece adecuado en el momento adecuado.
	//*** FIN ACLARACIÓN ***/

	public String getRegexNombres(String regex, String errorString) {
		//Declaramos la variable value que se le asigna el valor que pasa el usuario en caso
		//que el input sea valido, si no es valido es una variable sin valor
		//hasta que lo sea...!
		String value;
		//Declaramos la variable valid que se encarga de decidir si el input
		//ingresado es valido o no, eso un poco más abajo
		boolean valid;
		do {
			//Si el usuario ingresa un input contemplado por el Regex
			//asignamos a valid el boolean true
			//Y retornamos el valor que puso el usuario
			try {
				value = input.nextLine();
				if (value.matches(regex)) {
					valid = true;
					return value;
				//Si el usuario pone algo que no esté contemplado por el Regex
				//Devuelve error y setea a valid como falso
				} else {
					System.out.println(AnsiColors.ANSI_RED + errorString + AnsiColors.ANSI_RESET);
					valid = false;
				}
			//Esto es redundante por que no llega a caer en el mismatch
			//al error lo agarra el Regex
			//pero de todas maneras lo dejo.
			//Si alguien lo saca, bienvenido sea.
			} catch (InputMismatchException e) {
				System.out.println(AnsiColors.ANSI_RED + "Input invalido" + AnsiColors.ANSI_RESET);
				valid = false;
				input.nextLine();
			}
		//Ejecutamos el DO mientras que valido sea falso
		//Mejor dicho, hasta que el usuario se digne a pasar
		//un valor válido para el campo que requerimos.
		} while (!valid);

		return input.nextLine();
	}

	public Integer getRegexNumeros(String regex, String errorString) {
		String value;
		boolean valid;
		do {
			try {
				value = input.nextLine();
				if (value.matches(regex)) {
					valid = true;
					return Integer.parseInt(value);
				} else {
					System.out.println(AnsiColors.ANSI_RED + errorString + AnsiColors.ANSI_RESET);
					valid = false;
				}
			} catch (InputMismatchException e) {
				System.out.println(AnsiColors.ANSI_RED + "Input invalido" + AnsiColors.ANSI_RESET);
				valid = false;
				input.nextLine();
			}
		} while (!valid);

		return null;
	}

	public String getRegexStringComp(String regex, String errorString) {
		String value;
		boolean valid;
		do {
			try {
				value = input.nextLine();
				if (value.matches(regex)) {
					valid = true;
					return value;
				} else {
					System.out.println(AnsiColors.ANSI_RED + errorString + AnsiColors.ANSI_RESET);
					valid = false;
				}
			} catch (InputMismatchException e) {
				System.out.println(AnsiColors.ANSI_RED + "Input invalido" + AnsiColors.ANSI_RESET);
				valid = false;
				input.nextLine();
			}
		} while (!valid);
		return null;
	};
}
