package hw10Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {

	public MedicalSchool() { // Constructor can be created in the abstract Class

	}

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is non abstract method");

	}
	// Extends and implements keyword are used for the inheritance in abstract class.
	// Abstract class can inherit other abstract class by extends key word.
	// Abstract class can inherit regular class by extends key word.
	// Abstract class can't inherit Interface by extends key word.
	// Abstract class can inherit Interface by implements key word.
	// Abstract class can inherit multiple Interface by implements key word.
	// Abstract class can inherit one abstract class or one regular class. One inheritance is possible.
	
	

}
