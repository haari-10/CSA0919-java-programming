import java.util.*;

public class pg8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a + b > c && a + c > b && b + c > a){
            if(a == b && b == c){
                System.out.println("Equilateral");
            }
            else if(a == b || b == c || a == c){
                System.out.println("Isosceles");
            }
            else{
                System.out.println("Scalene");
            }
        }
        else{
            System.out.println("Invalid triangle");
        }
    }
}