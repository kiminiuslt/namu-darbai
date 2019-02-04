package lt.codeacademy.namuDarbai.treciaSavaite;

import java.util.Scanner;

public class Task4Main {

	public static void main(String[] args) {

		Task4Skaiciuotuvas skaiciuotuvas = new Task4Skaiciuotuvas();

		Scanner skan = new Scanner(System.in);
		
		System.out.println("iveskite pirma skaiciu");
		
		int a = skan.nextInt();
		
		System.out.println("iveskite antra skaiciu");
		int b = skan.nextInt();
		

		System.out.println("skaiciu " + a +" ir " + b + " suma yra " +skaiciuotuvas.sudetis(a, b));
		System.out.println("is skaiciaus " + a +" atemus " + b + " lieka " +skaiciuotuvas.atimtis(a,b));
		System.out.println("sudauginus " + a +" ir " + b + " skaicius gaunasi " +skaiciuotuvas.daugyba(a, b));
		System.out.println("skaiciu " + a +" padalinus is skaicaius " + b + " gaunasi " +skaiciuotuvas.dalyba(a, b));
		System.out.println("skaiciu " + a +" padalinus is skaicaius " + b + " dalybos liekana yra " +skaiciuotuvas.liekana(a, b));

	}

}
