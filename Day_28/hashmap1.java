package Day_28;
import java.util.HashMap;
public class hashmap1 {
    public static void main(String[] args){
        HashMap map = new HashMap();
        map.put(1,"Suraj");
        map.put(2,"Yash");
        map.put(3,"Nishu");
        System.out.println(map);
        System.out.println(map.get(3));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Suraj"));
    }
    
}
