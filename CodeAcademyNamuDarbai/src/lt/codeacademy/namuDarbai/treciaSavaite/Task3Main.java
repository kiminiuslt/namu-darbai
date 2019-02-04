package lt.codeacademy.namuDarbai.treciaSavaite;

import java.util.Scanner;

public class Task3Main {

	static int skaicius;
	static int visiPinigai;

	public static void main(String[] args) {
		Scanner skan = new Scanner(System.in);
		System.out.println("Iveskite skaiciu kiek turite kupiuru");
		skaicius = skan.nextInt();
		Task3Pinigine[] pinigine = new Task3Pinigine[skaicius];

		for (int i = 0; i < skaicius; i++) {
			pinigine[i] = new Task3Pinigine();

		}
		for (int i = 0; i < skaicius; i++) {

			System.out.println("ivskite " + (i + 1) + " kupiura pvz.: eur100 ");
			pinigine[i].pinigai = skan.next();

		}

		for (int i = 0; i < skaicius; i++) {

			pinigine[i].parodyk();
		}

		for (int i = 0; i < skaicius; i++) {

			int skaiciavimas = pinigine[i].suma();

			visiPinigai = visiPinigai + skaiciavimas;
		}

		System.out.println("Is viso jus turite " + visiPinigai + " euru.");

	}

}
