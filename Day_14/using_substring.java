package Day_14;
public class using_substring{
    public static void main(String[] args){
        String a = "Substring";

        for(int i = 0; i < a.length(); i++){
            for(int j = i+1; j < a.length(); j++ ){
                System.out.println(a.substring(i,j));
            }
        }
    }
}
