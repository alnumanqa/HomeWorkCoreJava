package hw12Polymorphism;

public class Niece extends Sister {
	
	@Override
	public void sister() {
		System.out.println("This is void type method from Sister class");
	}

	@Override
	public int sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int add = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6 + 10;
		System.out.println("Add all the age: " + add);
		return add;
	}

	@Override
	public int sister(int age1, int age2, int age3, String age4, int age5) {
		int substract = age1 / 2 - age2 - age3 - Integer.parseInt(age4) - age5 * 3;
		System.out.println("Substract all the age: " + substract);
		return substract;
	}

	@Override
	public int sister(int age1, int age2, String age3, int age4, int age5, int age6) {
		int multiply = age1 * age2 * Integer.parseInt(age3) * age4 * age5 * age6;
		System.out.println("multiply all the age: " + multiply);
		return multiply;
	}
	/*
	@Override
	public static int sister(int age1, int age2, int age3, int age5, int age6) {
		int add3 = age1 + age2 + age3 + age5 + age6;
		System.out.println("Add all the age: " + add3);
		return add3;
	}
	*/
	/*
	public final int sister(int age1, int age2, int age3, int age5) {
		int add4 = age1 + age2 + age3 + age5;
		System.out.println("Add all the age: " + add4);
		return add4;
	}
	*/
	/*
	 When multiple method created by the same name and parameter are same,
	 but the logic are different is called method Overridden.
	 It also called dynamic polymorphism.
	 Method override happen during run time.
	 Final method can not be overridden, since the method is final and used for the same class.
	 Static method can't be overridden too, but static method can be implemented in child class 
	 without @Override annotation.
	 */

}
