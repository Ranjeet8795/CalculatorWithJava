import java.util.Scanner;

public class UniqueString {
    
    public static char firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < s.length(); j++) {
                if (j == i) {
                    continue;
                }
                if (ch == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return ch;
            }
        }
        return '#';
    }

    public static void main(String[] args) {
        System.out.print("Enter any string: ");
        String input = new Scanner(System.in).nextLine();
        char unique = firstUniqChar(input);
        if (unique != '#') {
            System.out.println(unique + " is the first unique character");
        } else {
            System.out.println("There is no unique character");
        }
    }
}
