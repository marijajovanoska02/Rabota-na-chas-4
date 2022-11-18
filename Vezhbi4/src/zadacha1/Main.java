package zadacha1;

public class Main {

	public static void main(String[] args) {
		Covek obj1 = new Covek();

		obj1.setIme("Marija");
		obj1.setPrezime("Jovanoska");
		obj1.setMaticenBroj("123456789632");

		System.out.println(obj1.getIme());
		System.out.println(obj1.getPrezime());
		System.out.println(obj1.getMaticenBroj());
	}

}
