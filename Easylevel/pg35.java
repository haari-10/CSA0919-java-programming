import java.util.*;

public class pg35 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();

        if(k < 0){
            System.out.println("Invalid K");
            return;
        }

        if(m <= n){
            for(int i=m;i<=n;i+=k+1)
                System.out.print(i + " ");
        }else{
            for(int i=m;i>=n;i-=k+1)
                System.out.print(i + " ");
        }
    }
}