public class pg11 {
    public static void main(String args[]){
        int a=1234;
        int c=0;
        while(a>0){
            int b=a%10;
            c=c+b;
            a=a/10;
        }
        System.out.println(c);
    }
    
}
