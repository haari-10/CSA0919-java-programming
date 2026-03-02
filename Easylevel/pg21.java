import java.util.*;

public class pg21 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int max = sc.nextInt();

        for(int i=1;i<=max;i++){
            for(int j=1;j<=i;j++)
                System.out.print(ch + " ");
            System.out.println();
        }
    }
}