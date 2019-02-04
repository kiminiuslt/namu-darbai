package lt.codeacademy.namuDarbai.pirmaSavaite;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		System.out.println("iveskite skaiciu");

		Scanner skanuoklis = new Scanner(System.in);

		int a = skanuoklis.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("Skaicius lyginis");
			
		}
		else {
			System.out.println("Skaicius nelyginis");
		}
		}

	}

