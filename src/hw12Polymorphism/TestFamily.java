package hw12Polymorphism;

public class TestFamily {

	public static void main(String[] args) {

		System.out.println("\n------------------------Sister class------------------\n");

		Sister sister = new Sister();
		// Method overloaded are called here from sister class
		sister.sister();
		sister.sister(10, 15, 17, "13", 20, 25);
		sister.sister(20, 24, 14, "7", 10);
		sister.sister(25, 45, 33, "41", 70, 8);
		Sister.sister(50, 22, 15, 25, 13);
		sister.sister(5, 7, 8, 11);

		System.out.println("\n------------------------Niece class------------------\n");
		
		Niece niece = new Niece();
		// Method overridden are called here from Niece class
		niece.sister();
		niece.sister(10, 15, 17, "13", 20, 25);
		niece.sister(20, 24, 14, "7", 10);
		niece.sister(15, 7, "13", 14, 22, 30);

	}

}
