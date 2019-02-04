package lt.codeacademy.namuDarbai.antraSavaite;

import java.util.Random;

public class Task2 {

	public static void main(String[] args) {

		String[] produktai = { "duona", "suris", "jogurtas", "keciupas", "sviestas", "pienas", "saulegrazos", "varske",
				"sausiainiai" };
		Random parinkejas = new Random();
		Random parinkejas2 = new Random();
		int a = parinkejas.nextInt(produktai.length);
		int b = parinkejas2.nextInt(produktai.length);

		System.out.println(produktai[a] + " labai skanu su " + produktai[b]);

	}
}
