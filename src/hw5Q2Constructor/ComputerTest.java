package hw5Q2Constructor;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer1 = new Computer(); // default constructor is initialized here

		// Parameterized constructor is initialized here
		Computer computer2 = new Computer("Alienware", "Alienware Aurora R12", "Microsoft Windows 11 Home", 2100, 'A',
				false);

		// Parameterized constructor is declared here
		Computer computer3 = new Computer(" Standalone Workstation");

	}

}
