package lt.codeacademy.namuDarbai.antraSavaite;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner skan = new Scanner(System.in);

		System.out.println("iveskite savo asmens koda");

		String asmensKodas = skan.nextLine();

		char[] kodoMasyvas = asmensKodas.toCharArray();

		if (asmensKodas.length() != 11) {
			System.out.println("Asmens kodas ivestas neteisingai");

		} else if (asmensKodas.charAt(0) == '4') {
			System.out.println("Lytis: Moteris");
		} else if (asmensKodas.charAt(0) == '3') {
			System.out.println("Lytis: Vyras");

		}

		else {
			System.out.println("Asmens kodas ivestas neteisingai");

		}
		System.out.println("Jusu gimimo data 19" + kodoMasyvas[1] + kodoMasyvas[2] + " " + kodoMasyvas[3]
				+ kodoMasyvas[4] + " " + kodoMasyvas[5] + kodoMasyvas[6]);
	}

}
