package hw4JavaVariables;

public class AboutMe {
	// Variable is declared here

	public String myName;
	public byte myAge;
	public short myHouseNumber;
	public int myMortage;
	public long myBankBlance;
	public char mySex;
	public boolean myCitizenship;
	public float myHeight;
	public double mygrade;

	// This is constructor
	// Constructor is declared here
	public AboutMe() {
		System.out.println("This is all about us:\n ");
	}

	// This is method
	// Method is implemented here
	public void aboutMe() {
		System.out.println("My name is: " + myName + "\nMy age is: " + myAge + "\nMy house number: " + myHouseNumber
				+ "\nMy mortgage are: " + myMortage + "\nMy bank blance are: " + myBankBlance + "\nMy sex is: " + mySex
				+ "\nI am citizen: " + myCitizenship + "\nMy height is: " + myHeight + "\nMy grade are: "
				+ mygrade);
	}

}
