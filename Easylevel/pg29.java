import java.util.*;

public class pg29 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rev = 0;

        while(n > 0){
            rev = (rev << 1) | (n & 1);
            n = n >> 1;
        }

        System.out.println(rev);
    }
}