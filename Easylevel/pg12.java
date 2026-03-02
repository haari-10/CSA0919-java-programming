public class pg12 {
    public static void main(String args[]) {
        int mat1[][] = {{1,2},{5,3}};
        int mat2[][] = {{2,3},{4,1}};
        int result[][] = new int[2][2];

        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                result[i][j] = mat1[i][j] + mat2[i][j];
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