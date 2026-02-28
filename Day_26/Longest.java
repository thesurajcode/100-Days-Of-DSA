package Day_26;

import java.util.HashSet;
public class Longest {
    public static void main(String[] args){
        HashSet<Character> set = new HashSet<Character>();
        String s = "cbkjhjbaaabak";

        int left = 0; 
        int maxLength = 0;
        
        for( int right = 0; right < s.length(); right++){

            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            };

            set.add(s.charAt(right));
            maxLength = Math.max(maxLength,right - left+1);
        }
        System.out.println("Maxlength : "+ maxLength);

    }
    
}
