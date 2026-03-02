import java.util.*;

public class pg13 {
    public static void main(String args[]) {
        int arr1[] = {1,3,4,5};
        int arr2[] = {2,4,6,8};

        ArrayList<Integer> list = new ArrayList<>();

        int i=0,j=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                list.add(arr1[i]);
                i++;
            }else{
                list.add(arr2[j]);
                j++;
            }
        }

        while(i<arr1.length){
            list.add(arr1[i]);
            i++;
        }

        while(j<arr2.length){
            list.add(arr2[j]);
            j++;
        }

        System.out.println(list);
    }
}