import java.util.*;

public class pg48 {
    public static void main(String args[]){
        int arr[] = {1,0,2,3,0,4,5,0};
        int n = arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]==0 && i+1<n){
                for(int j=n-1;j>i;j--)
                    arr[j]=arr[j-1];
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}