package hw10UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("\nDefault constructor is initialized here: \n");
		Daughter daughter1 = new Daughter();

		System.out.println("\nparameterized constructor is initialized here:\n");
		Daughter daughter2 = new Daughter("February", 29);

		System.out.println("\nVoid type method is initialized here\n");
		daughter2.father();

		System.out.println("\nparameterized method is initialized here:\n");
		daughter2.fatherInfo("Md", 80, 'M', false);

	}

}
