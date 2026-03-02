import java.util.*;
public class pg4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("units");
        int n=sc.nextInt();
        double bill;
        if(n<=100){
            bill=n*(1.5);
            System.out.println(bill);

        }else if (n>100 && n<=200){
            bill=(100*1.5)+(n-100)*2.5;
            System.out.println(bill);
        }else if(n>200){
            bill=(100*1.5)+100*2.5+(n-200)*4;
            System.out.println(bill);
        }




    }
    
}
