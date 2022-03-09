import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        String rexecute = "y";

        do {
            System.out.println("Which service would you like to use? \n[1]: Basic week visualizer \n[2]: Advanced week visualizer \n[3]: Basic calculator \n[4]: Employee repertoire");
            choice = scanner.nextInt();

        switch(choice){
            case 1: 
                BasicWeek basicWeek = new BasicWeek();
                System.out.println(basicWeek);
                System.out.print("Would you like to perform another operation? (y/n)");
                scanner.nextLine();
                rexecute = scanner.nextLine();
                break;
            case 2:
                AdvancedWeek advancedWeek = new AdvancedWeek();
                System.out.println(advancedWeek);
                System.out.print("Would you like to perform another operation? (y/n)");
                scanner.nextLine();
                rexecute = scanner.nextLine();
                break;
            case 3: 
                new Calculator();
                System.out.print("Would you like to perform another operation? (y/n)");
                scanner.nextLine();
                rexecute = scanner.nextLine();
                break;
            case 4: 
                Employee employee = new Employee();
                System.out.println(employee);
                System.out.println("Would you like to perform another operation? (y/n)");
                scanner.nextLine();
                rexecute = scanner.nextLine();
                break;
            default:
                System.out.println("Please make sure you pick a number between 1 and 4");
                System.out.println("Which service would you like to use? \n[1]: Basic week visualizer \n[2]: Advanced week visualizer \n[3]: Basic calculator \n[4]: Employee repertoire");
                choice = scanner.nextInt();
                break;
        }
        
        } while (rexecute.equals("y"));


    }
}