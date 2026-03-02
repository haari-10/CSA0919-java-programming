/*

2 
2 4 
2 4 6 
2 4 6 8 
2 4 6 8 10 

*/

public class ptn15 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            int num=2;
            for(int j=1;j<=i;j++){
                
                System.out.print(num+" ");
                num=num+2;
            }
            System.out.println();
        }
    }
    
}
