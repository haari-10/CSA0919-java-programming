import java.io.*;
import java.util.*;
public class pg4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("marks: ");
        int Marks=sc.nextInt();
        System.out.println("no.of arriers:");
        int arier=sc.nextInt();
        if(Marks>=60 && arier==0){
            System.out.println("you are eligible");
        }else{
            System.out.print("not eligible");
        }

    }
    
}
