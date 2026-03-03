import java.util.*;

public class pg49 {
    public static void main(String args[]){
        int nums[] = {3,0,1};
        int n = nums.length;

        int sum = n*(n+1)/2;
        int actual = 0;

        for(int i=0;i<n;i++)
            actual += nums[i];

        System.out.println(sum - actual);
    }
}