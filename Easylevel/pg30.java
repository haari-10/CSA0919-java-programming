import java.util.*;

public class pg30 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You are eligible to vote");
        }else if(age > 0){
            System.out.println("You are allowed to vote after " + (18 - age) + " years");
        }else{
            System.out.println("Invalid age");
        }
    }
}