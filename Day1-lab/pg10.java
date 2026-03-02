import java.util.*;

public class pg10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();
        int price;

        if(age < 5){
            price = 0;
        }
        else if(age <= 18){
            price = 50;
        }
        else if(age <= 60){
            price = 100;
        }
        else{
            price = 70;
        }

        System.out.println("Ticket price = " + price);
    }
}