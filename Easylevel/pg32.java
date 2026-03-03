import java.util.*;

public class pg32 {
    static double interest(double p, double y, char type){
        if(p <= 0 || y <= 0)
            return 0;
        if(type == 'y' || type == 'Y')
            return p * y * 0.12;
        else
            return p * y * 0.10;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double y = sc.nextDouble();
        char c = sc.next().charAt(0);

        System.out.println("Interest: " + interest(p,y,c));
    }
}