package lt.codeacademy.namuDarbai.treciaSavaite;

public class Task3Pinigine {

	String pinigai;

	public void parodyk() {

		System.out.println("jus turite " + pinigai);
	}

	public int suma() {

		int visiPinigai = 0;

		String skaiciai = pinigai.substring(3);
		int pagalbine = Integer.valueOf(skaiciai);
		
		visiPinigai = visiPinigai + pagalbine;

		return visiPinigai;

	}
}
