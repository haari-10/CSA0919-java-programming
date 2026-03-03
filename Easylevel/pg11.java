import java.util.*;
public class pg11 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("rows :");
        int r1=sc.nextInt();
        System.out.println("cols :");
        int c1=sc.nextInt();
        System.out.println("rows :");
        int r2=sc.nextInt();
        System.out.println("cols :");
        int c2=sc.nextInt();

        int mat1[][]=new int[r1][c1];
        int mat2[][]=new int[r2][c2];
        int res[][]=new int[r1][c2];
        if(c1==r2){

            for(int i=0;i<mat1.length;i++){
                for(int j=0;j<mat1[0].length;j++){
                    mat1[i][j]=sc.nextInt();
                }
            }

            for(int i=0;i<mat2.length;i++){
                for(int j=0;j<mat2[0].length;j++){
                    mat2[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<mat1.length;i++){
                for(int j=0;j<mat2[0].length;j++){
                    for(int k=0;k<mat1[0].length;k++){
                        res[i][j]+=mat1[i][k]*mat2[k][j];
                    }
                }
                
            }

                
            
        }else{
            System.out.println("multiplication is not possible");
        }
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]);
            }
            System.out.println();
        }
    }
}