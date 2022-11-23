package hw10UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
		super();
		super.familyName = "Islam";
		System.out.println("Family name: " + familyName);
		System.out.println("This default constructor from Daughter class");
		

	}

	public Daughter(String birthMonth, int age) {
		super("Md", 65, 'M', true);
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth month: " + birthMonth + ", Age: " + age);
	}

	public void daughter() {
		super.father();
		System.out.println("This void type method is from Daughter class");
	}

	public void daughterInfo(String birthMonth, int age) {
		super.fatherInfo("Md", 80, 'M', false);
		super.familyName = "Islam";
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth month: " + birthMonth + ", Age: " + age);
	}

}
