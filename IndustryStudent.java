import java.util.Scanner;

public class IndustryStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        // take input as coursework
        System.out.print("Enter number of relevant coursework completed from 5 to 10: ");
        int course = sc.nextInt();

        // take input as GPA
        System.out.print("Enter GPA from 0 to 4.0: ");
        double gpa = sc.nextDouble();


        // take input as extracurricular activities
        System.out.print("Number of extracurricular activities from 0 to 10: ");
        int Activities = sc.nextInt();

        // Logic for selection
        if (gpa >= 5.0 && course >= 5 && Activities >= 1) {
            System.out.println("Selected");
        } else {
            System.out.println("Not Selected");
        }

        sc.close();
    }
}