package hw12Polymorphism;

public class Sister {
	public void sister() {
		System.out.println("This is void type method from Sister class");
	}

	public int sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int add = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("Add all the age: " + add);
		return add;
	}

	public int sister(int age1, int age2, int age3, String age4, int age5) {
		int add1 = age1 + age2 + age3 + Integer.parseInt(age4) + age5;
		System.out.println("Add all the age: " + add1);
		return add1;
	}

	public int sister(int age1, int age2, String age3, int age4, int age5, int age6) {
		int add2 = age1 + age2 + Integer.parseInt(age3) + age4 + age5 + age6;
		System.out.println("multiply all the age: " + add2);
		return add2;
	}

	public static int sister(int age1, int age2, int age3, int age5, int age6) {
		int add3 = age1 + age2 + age3 + age5 + age6;
		System.out.println("Add all the age: " + add3);
		return add3;
	}

	public final int sister(int age1, int age2, int age3, int age5) {
		int add4 = age1 + age2 + age3 + age5;
		System.out.println("Add all the age: " + add4);
		return add4;
	}
	/*
	 * When multiple method is created by the same name, but parameter are different
	  is called method overloading. 
	  Method overloading is also called static polymorphism.
	  Method overloading happen during compile time.
	 */

}
