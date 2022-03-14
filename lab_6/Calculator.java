import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    // Constructor to initialize the calculator
    public Calculator() {
        operate();

    }

    private void operate(){
        Scanner scanCalc = new Scanner(System.in);

        System.out.println("Input the first number: ");
        num1 = scanCalc.nextInt();

        scanCalc.nextLine();
        System.out.println("Input the operator: ");
        operator  = scanCalc.nextLine();
    
        System.out.println("Input the second number: ");
        num2 = scanCalc.nextInt();

        switch(operator){
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
                scanCalc.nextLine();
                operate();
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