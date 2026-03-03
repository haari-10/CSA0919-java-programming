import java.util.*;

public class pg42 {
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

        for(int i=0;i<n;i++){
            System.out.print((2*i+1) + " ");
        }
    }
}