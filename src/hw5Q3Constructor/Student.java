package hw5Q3Constructor;

public class Student {
	public String stName;
	public int stID;
	public char sex;
	public boolean isProgrammer;
	public float grade;

	public Student() { // Default constructor is declared here
		System.out.println("This is from default Constructor of Student class.\n");

	}

	public Student(String Name, int Id, char sex, boolean Programmer, float grade) {
		this.stName = Name;
		this.stID = Id;
		this.sex = sex;
		this.isProgrammer = Programmer;
		this.grade = grade;
		System.out.println("Student name is: " + Name + ", Student id number is: " + Id + ", Student sex is " + sex
				+ ", Student is Java programmer: " + isProgrammer + ", Student grade is: " + grade);

	}

}
