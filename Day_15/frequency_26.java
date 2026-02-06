package Day_15;

public class frequency_26 {
    public static void main(String[] args){
        String h1  = "CharacterFrequency";
        String h2 = h1.toLowerCase();
        char []h3 = h2.toCharArray();

        int []h4 = new int[26];
        for(int i = 0; i < h2.length(); i++){
            char ch = h2.charAt(i);
            h4[ch -'a']++;
        }

        for(int j = 0; j < 26; j++){
            if(h4[j] > 0){
                System.out.println("Count of " + (char)(j+'a') +"" + " is : " + h4[j]);

            }

        }



    }
    
}
