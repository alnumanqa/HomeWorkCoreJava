package hw9Abstraction;

public class ColumbiaUniversity {

	public ColumbiaUniversity() {

	}

	// abstract method can not be created in the Class
	/*
	 * public abstract void chemistry();
	 */

	public void biology() {
		System.out.println("This is non abstract method from ColumbiaUniversity Class");

	}
	// One. Extends keyword is used for the inheritance in regular class.
	// Regular class can inherit other Regular class by extends key word.
	// Regular class can inherit abstract class by extends key word.
	// Regular class can't inherit Interface by extends key word.
	// Regular class can inherit one abstract class or one regular class. One inheritance is possible.

}
