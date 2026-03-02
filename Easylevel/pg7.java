import java.util.*;
public class pg7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String inpt=sc.nextLine();
        inpt=inpt.toLowerCase();
        String cons="";
        String vow="";
        for(int i=0;i<inpt.length();i++){
            if(inpt.charAt(i)=='a' || inpt.charAt(i)=='e' || inpt.charAt(i)=='i' || inpt.charAt(i)=='o' || inpt.charAt(i)=='u' ){
                cons=cons+inpt.charAt(i);
            }else{
                vow=vow+inpt.charAt(i);
            }

        }
        System.out.println(cons);
        System.out.println(vow);
    }
    
}
