package Day_11;

import java.util.Arrays;
public class case_sensitive_anagrams {
    public static void main(String[] args){
        String a = "listen";
        String b = "Silent";

        String c = a.toLowerCase();
        String d = b.toLowerCase();

        char []e = c.toCharArray();
        char []f = d.toCharArray();

        Arrays.sort(e);
        Arrays.sort(f);

        if(c.length() != d.length()){
            System.out.println("Not anagram");
            return;
        }

        if(Arrays.equals(e,f)){
            System.out.println("Is a anagram");
        }else{
            System.out.println("Is not Anagrams");
        }


    }
    
}
