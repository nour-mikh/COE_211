import java.util.*;

public class EntryPoint{

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	int rnd = (int) (Math.random()*10 + 1);

	Employee[] employeesArray = new Employee[rnd];

	for(int i = 0; i < rnd; i++){
		// rnd - i for remaining insertions
		System.out.println("You have " + (rnd - i) + " insertion(s) left");

		System.out.println("Please enter the employee's first name:");
		String firstName = scanner.nextLine();

		System.out.println("Please enter the employee's last name:");
		String lastName = scanner.nextLine();

		System.out.println("Please enter the employee's last age:");
		int age = scanner.nextInt();

		System.out.println("Please enter the employee's last monthly salary:");
		double monthlySalary = scanner.nextDouble();

		scanner.nextLine();
		Employee employee = new Employee(firstName, lastName, age, monthlySalary);

		System.out.println("Employee information: " + employee.getFirstName() + " " + employee.getLastName() + ", " + employee.getAge() + ", " + employee.getMonthlySalary());

		employeesArray[i] = employee;
	}

	for(int j = 0; j<employeesArray.length; j++){
		// j + 1 so we don't get an employee numbered 0
		System.out.println("Employee " + (j + 1) + ": " + employeesArray[j].toString());
	}



    }
}
