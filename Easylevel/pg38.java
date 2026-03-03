import java.util.*;

public class pg38 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();

        String parts[] = date.split("/");
        if(parts.length != 3){
            System.out.println("Invalid Date");
            return;
        }

        int year = Integer.parseInt(parts[2]);

        if((year%4==0 && year%100!=0) || year%400==0)
            System.out.println("Given year is Leap Year");
        else
            System.out.println("Given year is Non Leap Year");
    }
}