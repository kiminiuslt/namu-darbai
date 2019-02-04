package lt.codeacademy.namuDarbai.pirmaSavaite;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {

		System.out.println("iveskite devinzenkli minuciu skaiciu");

		Scanner skan = new Scanner(System.in);

		int minutes = skan.nextInt();

		int metai = minutes / 525600;
		int minuciuLikutis = minutes % 525600;
		int dienos = minuciuLikutis / 1440;
		
		System.out.println(minutes + " minuciu yra " + metai + " metai ir " + dienos + " dienos");

	
	}
}
