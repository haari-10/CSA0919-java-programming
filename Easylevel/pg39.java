
import java.util.*;

public class pg39 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()){
            System.out.println("Invalid");
            return;
        }

        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("Invalid");
            return;
        }

        int count = 0;
        for(int i=1;i<=n;i++)
            if(n % i == 0)
                count++;

        System.out.println("Number of factors = " + count);
    }
}