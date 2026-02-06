package Day_15;
import java.util.HashMap;
public class frequency_count_hashmap {
    public static void main(String[] args){
        String H2 = "CharacterFrequency";
        String H1 = H2.toLowerCase();
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < H1.length(); i++){
            char ch = H1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(char key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
    }
}
