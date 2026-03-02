public class pg12 {
    public static void main(String args[]){
        int a=1234;
        int c=0;
        do{
            int b=a%10;
            c=c*10+b;
            a=a/10;

        }while(a>0);
        System.out.println(c);
    }
    
}
