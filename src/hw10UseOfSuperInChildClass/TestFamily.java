package hw10UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("\nDefault constructor from Daughter class is initialized here: \n");
		Daughter daughter1 = new Daughter();

		System.out.println("\nparameterized constructor from Daughter class is initialized here:\n");
		Daughter daughter2 = new Daughter("February", 29);

		System.out.println("\nVoid type method from Daughter class is initialized here\n");
		daughter1.daughter();

		System.out.println("\nparameterized method from Daughter class is initialized here:\n");
		daughter2.daughterInfo("Janurary", 30);
		
		System.out.println("\nDefault constructor from Father class is initialized here: \n");
		Father father1 = new Father();
		
		System.out.println("\nparameterized constructor from Father class is initialized here:\n");
		Father father2 = new Father("Mohammed", 65, 'M', true);
		
		System.out.println("\nVoid type method from Father class is initialized here\n");
		father1.father();
		
		System.out.println("\nparameterized method from Father class is initialized here:\n");
		father2.fatherInfo("Mohammed", 65, 'M', true);

	}

}
