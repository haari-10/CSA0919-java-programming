import java.util.*;

public class pg47 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String paragraph = sc.nextLine().toLowerCase();
        String bannedWord = sc.nextLine().toLowerCase();

        paragraph = paragraph.replaceAll("[^a-z ]", "");
        String words[] = paragraph.split("\\s+");

        HashMap<String,Integer> map = new HashMap<>();

        for(String w : words){
            if(!w.equals(bannedWord)){
                map.put(w, map.getOrDefault(w,0)+1);
            }
        }

        String result = "";
        int max = 0;

        for(String key : map.keySet()){
            if(map.get(key) > max){
                max = map.get(key);
                result = key;
            }
        }

        System.out.println(result);
    }
}