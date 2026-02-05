package Day_14;
import java.lang.String;
public class String_print {
    public static void main(String[] args){
        String s = "Substring";
        char []s1 = s.toCharArray();
        for(int i =0; i <= s.length(); i++){

            for(int j = 0; j < i; j++){
                System.out.print(s1[j]);
            }
            System.out.println("");
        }
    }
    
}
