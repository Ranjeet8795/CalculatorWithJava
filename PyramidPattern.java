import java.util.Scanner;
public class PyramidPattern {

    public static void main(String[] args) {
        Scanner takeinput = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = takeinput.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(" ".repeat(n - i) + "* ".repeat(i));
        }

        takeinput.close();
    }    
}
