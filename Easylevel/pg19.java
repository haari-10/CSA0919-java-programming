import java.util.*;

public class pg19 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = sc.nextInt();

        for(int i=1;i<=max;i++){
            for(int j=1;j<=i;j++)
                System.out.print(num);
            System.out.println();
        }

        for(int i=max-1;i>=1;i--){
            for(int j=1;j<=i;j++)
                System.out.print(num);
            System.out.println();
        }
    }
}