package lt.codeacademy.namuDarbai.pirmaSavaite;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
	String []menesiai = new String[12];
	menesiai[0] = "Sausis";
	menesiai[1] = "Vasaris";
	menesiai[2] = "Kovas";
	menesiai[3] = "Balandis";
	menesiai[4] = "Geguze";
	menesiai[5] = "Birzelis";
	menesiai[6] = "Liepa";
	menesiai[7] = "Rugpjutis";
	menesiai[8] = "Rugsejis";
	menesiai[9] = "Spalis";
	menesiai[10] = "Lapkritis";
	menesiai[11] = "Gruodis";
	
	System.out.println("Masyvo ilgis " + menesiai.length);
	System.out.println("Pirmas menuo " + menesiai[0]);
	System.out.println("Paskutinis menuo " + menesiai[menesiai.length - 1]);
	
	System.out.println("Pasirinkite menesio skaiciu");
	
	Scanner skeneris = new Scanner(System.in);
	int a = skeneris.nextInt();
	
	// rasyti su if
	
	System.out.println("Jusu pasirinktas menuo yra: ");
	System.out.println(menesiai[a -1 ]);
	System.out.println(menesiai[a -2 ] + menesiai[a]);
	

	}

}
