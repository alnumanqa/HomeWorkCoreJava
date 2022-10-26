package hw3JavaVariables;

public class AboutMe {
	// Variable is declared here
	public String hospitalName;
	// Variable is initialized here
	public String myName = "Al Numan";
	public byte myAge = 29;
	public short myHouseNumber = 41;
	public int myMortage = 900;
	public long myBankBlance = 343553456l;
	public char mySex = 'M';
	public boolean myCitizenship = true;
	public float myHeight = 5.9f;
	public double mygrade = 3.67;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println(
				"My name is " + aboutMe.myName + ", My age is " + aboutMe.myAge + ", My height is " + aboutMe.myHeight);

	}

}
