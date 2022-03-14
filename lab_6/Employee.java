import java.util.Scanner;

public class Employee {
    // Initializing variables
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employee() {
        // Get user input
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input the employee's first name:");
        firstName = scan.nextLine();
        System.out.println("Please input the employee's last name:");
        lastName = scan.nextLine();
        // we will assume the user is smart enough to input the correct data types
        System.out.println("Please input the employee's age:");
        age = scan.nextInt();
        System.out.println("Please input the employee's salary:");
        salary = scan.nextDouble();

    }

    public String toString() {
        // insert logic for toString method
        return "Employee information: " + firstName + " " + lastName + ", " + age + ", " + salary;
    }
}