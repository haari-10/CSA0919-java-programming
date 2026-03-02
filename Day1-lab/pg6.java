import java.util.*;
public class pg6 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("username");
        String username=sc.next();
        System.out.println("password");
        String password=sc.next();
        if (username.equals("admin") && password.equals("1234")){
            System.out.println("login successful");
        }else{
            System.out.println("invalid");
        }
    }


    
}
