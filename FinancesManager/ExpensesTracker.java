import java.io.*;  
import java.util.Scanner;
import java.util.HashMap;

public class ExpensesTracker{
  public static void main(String[] args) throws IOException{
  
    try {
      // Create FileWriter & Scanner objects & y/n string
      File file = new File("expenses.txt");
      FileWriter fw = new FileWriter(file, true);
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter pw = new PrintWriter(bw);
      // Start gathering information inside the loop you will start

      String name, purchase;
      Double payment;

      Scanner scanner = new Scanner(System.in);
      String execute = "y";
      String display = "y";

      do {
        System.out.println("Input your name: ");
        name = scanner.nextLine();
  
        System.out.println("What did you purchase?");
        purchase = scanner.nextLine();
  
        System.out.println("How much did you pay?");
        payment = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Would you like to log another purchase (y/n)");
        execute = scanner.nextLine().trim();

        pw.print(name + " purchased " + purchase + " for " + payment + " US Dollars");
        pw.println();
      }while(execute.equals("y"));
      pw.close();

      System.out.println("Get off of ZoodMall!");
      System.out.println("Would you like to read a summary of your purchases?");
      display = scanner.nextLine();

      if(display.equals("y")){
      Scanner fileScan = new Scanner(file);
		  String transaction;
      while(fileScan.hasNext()) {
        transaction = fileScan.nextLine();
        System.out.println(transaction);
        }
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
