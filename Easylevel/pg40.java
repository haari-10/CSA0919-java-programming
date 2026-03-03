import java.util.*;

public class pg40 {
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

        int sum = 0;
        for(int i=1;i<n;i++)
            if(n % i == 0)
                sum += i;

        if(sum == n)
            System.out.println("It’s a Perfect Number");
        else
            System.out.println("Not a Perfect Number");
    }
}