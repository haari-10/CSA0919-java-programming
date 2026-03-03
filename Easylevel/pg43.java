import java.util.*;

public class pg43 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()){
            System.out.println("Invalid");
            return;
        }

        int n = sc.nextInt();
        int temp = n;
        int sum = 0;

        while(temp > 0){
            int d = temp % 10;
            sum += d*d*d;
            temp /= 10;
        }

        if(sum == n)
            System.out.println("Given number is Armstrong number");
        else
            System.out.println("Not Armstrong number");
    }
}