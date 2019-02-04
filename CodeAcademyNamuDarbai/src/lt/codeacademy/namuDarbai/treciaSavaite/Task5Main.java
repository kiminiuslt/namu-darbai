package lt.codeacademy.namuDarbai.treciaSavaite;

import java.util.Scanner;

public class Task5Main {

	public static void main(String[] args) {
		Scanner skan = new Scanner(System.in);
		System.out.println("iveskite eglutes dydi");
		int vartotojoPageidavimas = skan.nextInt();
		
		
		for(int i = 0; i <vartotojoPageidavimas;i++) {
			
			for(int a = 0; a <vartotojoPageidavimas;a++) {
				if(i<a)
				System.out.print("*");
				
			}
			for(int a = 0; a <vartotojoPageidavimas;a++) {
				if(i>a)
				System.out.print("0");
			}
			for(int a = 0; a <vartotojoPageidavimas;a++) {
				if(i>a)
				System.out.print("0");
			}
			for(int a = 0; a <vartotojoPageidavimas;a++) {
				if(i<a)
				System.out.print("*");
			}
			
			
			System.out.println();
		}

	}

}
