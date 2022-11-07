package hw6IfElseCondition02;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		System.out.println("Todays Weather");
		Scanner scanner = new Scanner(System.in);
		int todaysTemperature = scanner.nextInt();

		if (todaysTemperature < 32) {
			System.out.println("Freezing");
		} else if (todaysTemperature < 55) {
			System.out.println("Pleasent");
		} else if (todaysTemperature < 73) {
			System.out.println("Getting Warmer");
		} else if (todaysTemperature > 101) {
			System.out.println("Hot");
		} else {
			System.out.println("Please put ice on my head");
		}
		scanner.close();
		

	}

}
