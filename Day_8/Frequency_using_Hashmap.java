package Day_8;

import java.util.HashMap;

public class Frequency_using_Hashmap {
    public static void main(String[] args){
        int []arr = {1,3,1,3,2,2,2,1};
        HashMap <Integer, Integer> map =new HashMap <>();

        //using the for loop//
        for(int value: arr){
            map.put(value, map.getOrDefault(value,0) + 1);
            
        }
        System.out.println(map);





    }
    
}
