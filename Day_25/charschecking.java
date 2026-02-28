package Day_25;

public class charschecking{
    public static void main(String[] args){
        int count = 0;
        char []chars = {'a','a','a','f','f','f','b','b','b'};
        int freq[] = new int [26];
        for(int i = 0; i < chars.length; i++){
            freq[chars[i]-'a']++;
        }

        for(int j = 0; j < chars.length; j++){
            
            if(freq[j] != 0){
                count += 2;
            }
        }
        System.out.println(count);
        

    }

}