import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
        Scanner scanCalc = new Scanner(System.in);
        /**
         * Continue code here to ask for the first number, the operator, and the second number, IN THAT ORDER
         */

        // Decide on the operation to perform 
        /**
         * Insert code to decide on which function to call, based on the operator the user chose
         * Hint: Switch statement
         */

        System.out.println("Input the first number: ");
        num1 = scanCalc.nextInt();

        scanCalc.nextLine();
        System.out.println("Input the operator: ");
        operator  = scanCalc.nextLine();
    
        System.out.println("Input the second number: ");
        num2 = scanCalc.nextInt();

        switch(operator.trim()){
            case "+":
                System.out.println(add(num1, num2));
                break;
            case "-":
                System.out.println(subtract(num1, num2));
                break;
            case "*":
                System.out.println(multiply(num1, num2));
                break;
            case "/":
                System.out.println(divide(num1, num2));
                break;
            default:
                System.out.println("Your input is not an operator :(, try again");
                operator = scanCalc.nextLine();
        }

    }

    public String add(int a, int b) {
        return a + " + " + b + " = " + (a + b);
    }

    public String subtract(int a, int b) {
        return a + " - " + b + " = " + (a - b);
    }

    public String multiply(int a, int b) {
        return a + " * " + b + " = " + (a * b);
    }

    public String divide(int a, int b) {
        return a + " / " + b + " = " + (a / b);
    }



}