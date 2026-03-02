import java.util.*;

public class pg5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line: ");
        String str = sc.nextLine();

        int count = 0;

        System.out.println("Special Characters:");

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                System.out.println(ch);
                count++;
            }
        }

        System.out.println("Total Special Characters: " + count);
    }
}