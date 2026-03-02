/*

12345
1234
123
12
1

*/
public class ptn9 {
    public static void main(String args[]){
        for(int i=5;i>=1;i--){
            int num=1;
            for(int j=1;j<=i;j++){
                System.out.print(num++);
            }
            System.out.println();
        }
    }
    
}
