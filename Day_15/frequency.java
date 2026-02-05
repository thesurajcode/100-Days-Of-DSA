package Day_15;

public class frequency {
    public static void main(String[] args){
        String a = "CharacterFrequency";
        char []b = a.toCharArray();
        

        //comparing each character with the Given String//

        for(int i = 0; i < a.length(); i++){
            int count =0;
            for(int j = 0; j < a.length(); j++){
                
                if(b[i] == b[j]){
                    count++;
                    

                }
                
            }
            System.out.println("Count of "+" " + b[i] + " is : " + count);
            
        }
    }
    
}

1