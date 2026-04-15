package Day_28;
import java.util.HashMap;
public class hashmap {
    public static void main(String[] args){
        HashMap hashmap = new HashMap();
        hashmap.put(1,"Suraj");
        hashmap.put(2,"Yash");
        hashmap.put(3,"Nishu");
        hashmap.put(4,"Arpit");
        System.out.println(hashmap);

        System.out.println(hashmap.containsKey(4));
        System.out.println(hashmap.get(1));


    }
    
}
