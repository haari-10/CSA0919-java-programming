// Finding Grade of student

import java.util.*;

public class prg1 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Marks");
        
        int n=sc.nextInt();
        if (n>=90 && n<=100){
            System.out.println("A grade");
        }
        else if(n<=89 && n>=75){
            System.out.println("B grade");
        }
        else if(n>=60 && n<=74){
            System.out.println("C grade");
        }
        else if(n<=59 && n>=50){
            System.out.println("D grade");
        }
        else if(n<50){
            System.out.print("Fail");
        }
    }
    
}
