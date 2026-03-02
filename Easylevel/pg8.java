import java.util.*;
public class pg8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ");
        String str=sc.nextLine();
        System.out.println("enter letter");

        char ch=sc.next().charAt(0);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=ch){
                continue;
            }else{
                System.out.println("found at index "+i);
                
            }
        }
       
    }
    
}
