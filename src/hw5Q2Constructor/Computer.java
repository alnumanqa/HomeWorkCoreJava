package hw5Q2Constructor;

public class Computer {

	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;
	public String configuration;

	public Computer() { // Default constructor is declared here
		System.out.println("This is from default Constructor of Computer class.\n");
	}

	// Parameterized constructor is declared here
	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("Computer brand: " + brand + ", Computer model: " + model + ", Computer operating System: "
				+ operatingSystem + ", Computer price: " + price + ", Grade: " + grade + ", Computer is made in USA: "
				+ madeInUSA);
	}

	// Parameterized constructor is declared here
	public Computer(String configuration) {
		this.configuration = configuration;
		System.out.println("Computer configuration" + configuration);

	}

}
