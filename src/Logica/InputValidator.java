package Logica;

import java.util.InputMismatchException;
import java.util.Scanner;
import utils.AnsiColors;

public class InputValidator {

	Scanner input = new Scanner(System.in);

	public String getRegexNombres(String regex, String errorString) {
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
