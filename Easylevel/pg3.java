import java.util.*;
public class pg3 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter user name");
        String name=sc.next();
        System.out.println("re-enter user name");
        String nam=sc.next();
        if(name.equals(nam)){
            System.out.println("valid");
        }else{
            System.out.println("invalid");
        }

    }
    
}
