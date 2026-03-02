public class pg17 {
    public static void main(String args[]){
        int n=153;
        int temp=n;
        int b;
        int c;
        int d=0;
        while(temp>0){
            b=temp%10;
            c=(int) Math.pow(b,3);
            d=d+c;
            temp=temp/10;
        }
        if(n==d){
            System.out.println("armstrong");
        }else{
            System.out.println("not armstrong");
        }
    }
    
    
}
