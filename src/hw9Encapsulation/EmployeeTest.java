package hw9Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Numan");
		employee.setAge(29);
		employee.setSex('M');
		employee.setUsCitizen(true);

		System.out.println("Employee name: " + employee.getName() + "\nEmployee age: " + employee.getAge()
				+ "\nEmployee sex: " + employee.getSex() + "\nIs employee US citizen? " + employee.getUsCitizen());
		

	}

}
