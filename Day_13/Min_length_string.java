package Day_13;
import java.lang.String;
public class Min_length_string {
    public static void main(String[] args){

        String []Flowers = {"Rose","Marry Gold","Lotus","Sun Flower","Lily"};
        int N = Flowers.length-1;

        String a = Flowers[0];
        String b = Flowers[1];
        String c = Flowers[2];
        String d = Flowers[3];
        String e = Flowers[4];

        int min_len = Math.min (a.length(),(Math.min(b.length(),(Math.min(c.length(),
        (Math.min(d.length(),e.length())))))));

        System.out.println(min_len);
    }
    
}
