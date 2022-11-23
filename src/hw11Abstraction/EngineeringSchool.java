package hw11Abstraction;

public abstract class EngineeringSchool extends NYUniversity {

	public EngineeringSchool() {

	}

	public abstract void mechanicalLab();

	public void computerLab() {
		System.out.println("This is non abstract method form abstract class EngineeringSchool");

	}

}
