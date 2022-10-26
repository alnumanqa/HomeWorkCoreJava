package hw4JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
		AboutMe aboutMe1 = new AboutMe(); // Constructor is initialized here/
		// Variable is initialized here
		aboutMe1.myName = "Al Numan";
		aboutMe1.myHouseNumber = 41;
		aboutMe1.myAge = 29;
		aboutMe1.myMortage = 900;
		aboutMe1.myBankBlance = 23451246l;
		aboutMe1.mySex = 'M';
		aboutMe1.myCitizenship = true;
		aboutMe1.myHeight = 5.9f;
		aboutMe1.mygrade = 3.67;
		
		aboutMe1.aboutMe();// Method is initialized here

		System.out.println("\n--------------------------------------------------------------------\n");
		
		AboutMe aboutMe2 = new AboutMe(); //Constructor is initialized here
		// Variable is initialized here
		aboutMe2.myName = "Alex";
		aboutMe2.myHouseNumber = 51;
		aboutMe2.myAge = 89;
		aboutMe2.myMortage = 960;
		aboutMe2.myBankBlance = 23441246l;
		aboutMe2.mySex = 'F';
		aboutMe2.myCitizenship = false;
		aboutMe2.myHeight = 4.9f;
		aboutMe2.mygrade = 3.27;
		
		aboutMe2.aboutMe(); // Method is initialized here

	}
}
