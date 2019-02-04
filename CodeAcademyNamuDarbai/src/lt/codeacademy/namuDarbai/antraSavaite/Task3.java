package lt.codeacademy.namuDarbai.antraSavaite;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		int[] skaiciai = new int[5];

		skaiciai[0] = 0;
		skaiciai[1] = 0;
		skaiciai[2] = 0;
		skaiciai[3] = 0;
		skaiciai[4] = 0;

		Scanner skan = new Scanner(System.in);

		for (int counter = 0; counter < 10; counter++) {
			System.out.println("iveskite skaiciu nuo 1 iki 5");
			int c = skan.nextInt();
			skaiciai[c - 1] = skaiciai[c - 1] + 1;

		}

		System.out.println("Vienetas buvo ivestas " + skaiciai[0] + " vnt.");
		System.out.println("Dvejetas buvo ivestas " + skaiciai[1] + " vnt.");
		System.out.println("Trejetas buvo ivestas " + skaiciai[2] + " vnt.");
		System.out.println("Ketvertas buvo ivestas " + skaiciai[3] + " vnt.");
		System.out.println("Penketas buvo ivestas " + skaiciai[4] + " vnt.");

	}
}
