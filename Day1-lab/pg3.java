import java.util.*;
public class pg3 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=0){
            if(n%2==0){
                System.out.println("positive even");
            }else{
                System.out.println("positive odd");
            }
        }
        else if (n<0){
            if(n%2==0){
                System.out.println("negative even");
            }else {
                System.out.println("negative odd");
            }
        }
    }
    
}
