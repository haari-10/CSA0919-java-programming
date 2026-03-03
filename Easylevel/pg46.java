import java.util.*;

public class pg46 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()){
            System.out.println("Invalid");
            return;
        }

        int n = sc.nextInt();
        if(n <= 0){
            System.out.println(false);
            return;
        }

        while(n % 3 == 0)
            n /= 3;

        System.out.println(n == 1);
    }
}