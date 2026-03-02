import java.util.*;

public class pg18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int n = 4;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}