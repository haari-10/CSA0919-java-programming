import java.util.*;

public class pg36 {
    static boolean isComposite(int n){
        if(n <= 1) return false;
        for(int i=2;i*i<=n;i++)
            if(n % i == 0)
                return true;
        return false;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int start = Math.min(a,b);
        int end = Math.max(a,b);

        for(int i=start;i<=end;i++)
            if(isComposite(i))
                System.out.print(i + " ");
    }
}