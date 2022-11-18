package zadacha2;

public class Main {

	public static void main(String[] args) {
		Restoran obj1 = new Restoran ();

		obj1.setIme("Aj po edna");
		obj1.setLokacija("Ilindenska broj 16-b");
		obj1.setTelefon("048615400");
		obj1.setBrNaSedista(40);

		System.out.println(obj1.getIme());
		System.out.println(obj1.getLokacija());
		System.out.println(obj1.getTelefon());
		System.out.println(obj1.getBrNaSedista());

	}

}
