public class pg15 {
    public static void main(String args[]){
        int n=11;
        int m=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                m=1;
                break;
            }
        }
        if(m==1){
            System.out.println("not prime");
        }else{
            System.out.println("prime");
        }
    }
    
}
