import java.util.*;

public class pg28 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rev = 0;
        int temp = Math.abs(n);

        while(temp > 0){
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        if(n < 0)
            rev = -rev;

        System.out.println(rev);
    }
}