public class pg16 {
    public static void main(String args[]){
        int a=0;
        int b=1;
        int n=5;
       
        System.out.println(a+"\n"+b);
        for(int i=3;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
        
    }
    
}
