/*

    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

*/
public class ptn13 {
    public static void main(String args[]){

        //upper normal
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            
            System.out.println();
        }

        // lower revese
        for(int i=5;i>=1;i--){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    
}
