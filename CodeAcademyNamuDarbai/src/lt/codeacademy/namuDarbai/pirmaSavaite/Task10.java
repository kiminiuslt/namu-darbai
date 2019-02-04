package lt.codeacademy.namuDarbai.pirmaSavaite;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		System.out.println("Please enter your name");
		Scanner skanuoklis = new Scanner(System.in);

		String vardas = skanuoklis.nextLine();

		System.out.println("Hello " + vardas + "!");

	}

}
