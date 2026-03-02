import java.util.*;

public class pg9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter balance:");
        double balance = sc.nextDouble();
        System.out.println("Enter withdrawal amount:");
        double amount = sc.nextDouble();

        if(amount > balance){
            System.out.println("Insufficient Funds");
        }
        else{
            balance = balance - amount;
            System.out.println("Remaining balance = " + balance);
        }
    }
}