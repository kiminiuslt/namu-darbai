package lt.codeacademy.namuDarbai.pirmaSavaite;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner pppp = new Scanner(System.in);

		System.out.println("Iveskite teksta arba sakini");

		String text = pppp.nextLine();

		System.out.println(text.toUpperCase());
		System.out.println("teksto ilgis: " + text.length() + " simboliai");
		System.out.println(text.substring((text.lastIndexOf(' ') + 1)));
		System.out.println(text.replace("a" , "W"));
		System.out.println(text.replace("e" , "RAIDE"));
		
		


	}

}
