import java.util.*;

public class pg45 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()){
            System.out.println("Invalid");
            return;
        }

        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Invalid");
            return;
        }

        int root = (int)Math.sqrt(n);
        if(root*root == n)
            System.out.println("Square Root: " + root + ", " + (-root));
        else
            System.out.println("Not Perfect Square");
    }
}