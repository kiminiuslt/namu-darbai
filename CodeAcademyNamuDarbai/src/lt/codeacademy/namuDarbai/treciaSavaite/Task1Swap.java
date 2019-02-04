package lt.codeacademy.namuDarbai.treciaSavaite;

public class Task1Swap {

	private int x = 10;
	private int y = 20;

	public void get() {

		System.out.println("orginalios reiksmes x= " + x + " y= " + y);

		x = y + -x + (y = x);
		
		System.out.println("po pakeitimo x= " + x + " y= " + y);

	}

}
