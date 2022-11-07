package hw6IfElseCondition01;

public class Voter {
	public static void main(String[] args) {
		int age = 29;

		if (age == 18) {
			System.out.println("I am a voter");
		} else if (age < 18) {
			System.out.println("I am not a voter");
		} else if (age > 18) {
			System.out.println("I am a voter");
		} else {
			System.out.println("Please add a valid age");
		}

	}

}
