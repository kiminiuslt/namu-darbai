package lt.codeacademy.namuDarbai.pirmaSavaite;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner pi = new Scanner(System.in);
		
		System.out.println("Iveskite pasirinkta sveika skaiciu");
		int psk = pi.nextInt();
		System.out.println("Iveskite dar viena pasirinkta sveika skaiciu");
		int ask = pi.nextInt();
		System.out.println("Iveskite dar viena pasirinkta sveika skaiciu");
		int tsk = pi.nextInt();
		System.out.println("Iveskite dar viena pasirinkta sveika skaiciu");
		int ksk = pi.nextInt();
		System.out.println("Iveskite dar viena pasirinkta sveika skaiciu");
		int Psk = pi.nextInt();
		
		
		System.out.println("Jusu pasirinktu skaiciu suma lygi " + (ask + psk + tsk + ksk + psk));
		
		

	
	}

}
