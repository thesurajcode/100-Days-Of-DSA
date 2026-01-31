package Day_11;

import java.util.Arrays;
public class Two_strings_anagrams {
    public static void main(String[] args){
        String a = "listen";
        String b = "silent";
        if(a.length() != b.length()){
            System.out.println("Not Anagram");
            return;
        }

        //Need to count String Numbers//
         int N1 = a.length();
         int N2 = b.length();


        //Need to count Frequency of Characters//
        char []c = a.toCharArray();
        char []d = b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        if(Arrays.equals(c,d)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        } 

    }
}
    

