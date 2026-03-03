import java.util.*;

public class pg41 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextDouble()){
            System.out.println("Invalid");
            return;
        }

        double n = sc.nextDouble();
        System.out.println("Square Number: " + (n*n));
        System.out.println("Cube Number: " + (n*n*n));
    }
}