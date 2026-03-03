import java.util.*;

public class pg37 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()){
            System.out.println("Invalid Input");
            return;
        }

        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Invalid");
            return;
        }

        long fact = 1;
        for(int i=1;i<=n;i++)
            fact *= i;

        System.out.println(n + " Factorial = " + fact);
    }
}