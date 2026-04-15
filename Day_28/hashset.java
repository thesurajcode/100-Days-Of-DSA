package Day_28;
import java.util.HashMap;
public class hashset{
    public static void main(String[] args){
        HashMap map = new HashMap();
        map.put(1,"suraj");
        map.put(2,"Yash");
        map.put(3,"Akshat");
        for(int  i = 1; i < 4; i++ ){
            System.out.println(map.get(i));
        }   
    }
}