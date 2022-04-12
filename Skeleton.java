import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int GRADES = 5;

        int[] assigmentsGrades = new int[GRADES];

        double assigmentsAvgGrades= 0;

        for(int i = 0; i<GRADES; i++){
            System.out.println("Input the grade of assignment " + (i+1));
            assigmentsGrades[i] = scanner.nextInt();
            assigmentsAvgGrades += assigmentsGrades[i];
        }

        assigmentsAvgGrades /= GRADES;
        assigmentsAvgGrades *= 0.3;


        double nbOfAttendances;
        System.out.println("Input the number of attended labs");
        nbOfAttendances = scanner.nextDouble();
        nbOfAttendances /= 7;
        nbOfAttendances *= 100;
        nbOfAttendances *= 0.05;

        double midTermGrade;
        System.out.println("Input the midterm grade");
        midTermGrade = scanner.nextDouble();
        midTermGrade *= 0.3;

        System.out.println("Assignments (30%):" + assigmentsAvgGrades);
        System.out.println("Attendance (5%):" + nbOfAttendances);
        System.out.println("Midterm (30%):" + midTermGrade);

    }
}