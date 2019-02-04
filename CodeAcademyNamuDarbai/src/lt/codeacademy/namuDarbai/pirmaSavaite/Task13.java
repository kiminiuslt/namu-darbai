package lt.codeacademy.namuDarbai.pirmaSavaite;

import java.util.Scanner;

public class Task13 {
	public static String tekstasMetodui;

	public static void main(String[] args) {

		System.out.println("iveskite teksta");

		Scanner skan = new Scanner(System.in);

		String ivestasTekstas = skan.nextLine();
		System.out.println(ivestasTekstas.length());

		String tekstasMetodui = ivestasTekstas;

		for (int counter = 0; counter < ivestasTekstas.length(); counter++) {

			if (ivestasTekstas.charAt(counter) == 'a') {
				System.out.println(" 2 ");
			}
			if (ivestasTekstas.charAt(counter) == 'b') {
				System.out.println(" 22 ");
			}
			if (ivestasTekstas.charAt(counter) == 'c') {
				System.out.println(" 222 ");
			}
			if (ivestasTekstas.charAt(counter) == 'd') {
				System.out.println(" 3 ");
			}
			if (ivestasTekstas.charAt(counter) == 'e') {
				System.out.println(" 33 ");
			}
			if (ivestasTekstas.charAt(counter) == 'f') {
				System.out.println(" 333 ");
			}
			if (ivestasTekstas.charAt(counter) == 'g') {
				System.out.println(" 4 ");
			}
			if (ivestasTekstas.charAt(counter) == 'h') {
				System.out.println(" 44 ");
			}
			if (ivestasTekstas.charAt(counter) == 'i') {
				System.out.println(" 444 ");
			}
			if (ivestasTekstas.charAt(counter) == 'j') {
				System.out.println(" 5 ");
			}
			if (ivestasTekstas.charAt(counter) == 'k') {
				System.out.println(" 55 ");
			}
			if (ivestasTekstas.charAt(counter) == 'l') {
				System.out.println(" 555 ");
			}
			if (ivestasTekstas.charAt(counter) == 'm') {
				System.out.println(" 6 ");
			}
			if (ivestasTekstas.charAt(counter) == 'n') {
				System.out.println(" 66 ");
			}
			if (ivestasTekstas.charAt(counter) == 'o') {
				System.out.println(" 666 ");

			}
			if (ivestasTekstas.charAt(counter) == 'p') {
				System.out.println(" 7 ");
			}
			if (ivestasTekstas.charAt(counter) == 'q') {
				System.out.println(" 77 ");
			}
			if (ivestasTekstas.charAt(counter) == 'r') {
				System.out.println(" 777 ");
			}
			if (ivestasTekstas.charAt(counter) == 's') {
				System.out.println(" 7777 ");
			}
			if (ivestasTekstas.charAt(counter) == 't') {
				System.out.println(" 8 ");
			}
			if (ivestasTekstas.charAt(counter) == 'u') {
				System.out.println(" 88 ");
			}
			if (ivestasTekstas.charAt(counter) == 'v') {
				System.out.println(" 888 ");
			}
			if (ivestasTekstas.charAt(counter) == 'w') {
				System.out.println(" 9 ");
			}
			if (ivestasTekstas.charAt(counter) == 'x') {
				System.out.println(" 99 ");
			}
			if (ivestasTekstas.charAt(counter) == 'y') {
				System.out.println(" 999 ");
			}
			if (ivestasTekstas.charAt(counter) == 'z') {
				System.out.println(" 9999 ");
			}
			if (ivestasTekstas.charAt(counter) == ' ' ) {
				System.out.println(" 0 ");
			}
		}

	}

}
