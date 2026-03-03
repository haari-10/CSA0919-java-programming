import java.util.*;

public class pg44 {
    static int digitSum(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()){
            System.out.println("Invalid");
            return;
        }

        int n = sc.nextInt();
        while(n >= 10){
            n = digitSum(n);
        }

        System.out.println(n);
    }
}