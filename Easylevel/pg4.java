import java.util.*;

public class pg4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no.of fruits");
        int n=sc.nextInt();
        System.out.println("enter order from A or from Z");
        char ch=sc.next().charAt(0);
        sc.nextLine();
        String fruits[]=new String[n];
        for(int i=0;i<n;i++){
            fruits[i]=sc.nextLine();
        }
        Arrays.sort(fruits);
        if(ch=='A' || ch=='a'){
            for(int i=0;i<n;i++){
                System.out.println(fruits[i]);
            }
        }else if(ch=='Z' || ch=='z'){
            for(int i=n-1;i>=0;i--){
                System.out.println(fruits[i]);
            }
        }else{
            System.out.println("invalid order");
        }
        
        
    }
}