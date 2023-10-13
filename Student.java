import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Name");
        String Name = sc.nextLine();

        System.out.println("Enter ID");
        int ID = sc.nextInt();

        int[] marks = new int[5];
        String[] subjects = {"English", "Physics", "Maths", "Science", "Biology"};

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Marks of " + subjects[i]);
            marks[i] = sc.nextInt();
        }

        sc.close();

        int total = 0;
        for (int mark : marks) {
            total += mark;
        }

        double per = (total / 500.0) * 100.0;
        String g = getGrade(per);

        System.out.println("**** ALL Details *******");
        System.out.println("ID is " + ID);
        System.out.println("Student Name is " + Name);
        System.out.println("Total marks of all subjects " + total);
        System.out.println("Percentage is " + per);
        System.out.println("Grade is " + g);
    }

    private static String getGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B+";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 50) {
            return "C";
        } else if (percentage >= 40) {
            return "D";
        } else {
            return "E";
        }
    }
}