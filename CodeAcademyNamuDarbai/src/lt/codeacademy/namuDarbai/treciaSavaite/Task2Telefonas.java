package lt.codeacademy.namuDarbai.treciaSavaite;

import java.util.Scanner;

public class Task2Telefonas {

	private String marke;
	private String modelis;
	private String atmintis;
	private String spalva;

	public void nustatyk() {
		Scanner skan = new Scanner(System.in);

		System.out.println("Iveskite telefono marke");

		marke = skan.nextLine();
		System.out.println("Iveskite telefono modeli");

		modelis = skan.nextLine();
		System.out.println("Iveskite telefono atminti");

		atmintis = skan.nextLine();
		System.out.println("Iveskite telefono spalva");

		spalva = skan.nextLine();

	}

	public void parodyk() {
		System.out.println("telefono marke: " + marke);
		System.out.println("telefono modelis: " + modelis);
		System.out.println("telefono atmintis: " + atmintis);
		System.out.println("telefono spalva: " + spalva);

	}

}
