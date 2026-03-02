public class pg15{
    public static void main(String args[]){
        int arr[]={2,3,4,5,6,7,8};
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=2;j<arr[i];j++){
                if(arr[i]%j==0){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}



