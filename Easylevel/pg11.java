public class pg11 {
    public static void main(String args[]) {
        int mat1[][] = {{1,2},{5,3}};
        int mat2[][] = {{2,3},{4,1}};
        int result[][] = new int[2][2];

        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat2[0].length;j++){
                for(int k=0;k<mat1[0].length;k++){
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}