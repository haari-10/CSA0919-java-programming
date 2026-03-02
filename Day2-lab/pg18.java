public class pg18 {
    public static void main(String args[]){
        for(int i=1;i<50;i++){
            if(i%5==0){
                continue;
            }else if(i>40){
                break;
            }
            System.out.println(i);
        }
    }
    
}
