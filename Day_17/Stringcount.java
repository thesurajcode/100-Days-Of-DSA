package Day_17;
public class Stringcount{
    public static void main(String[] args){
        String s = "IILovvoodshdddh";
        String r = s.toLowerCase();
        StringBuilder Ch = new StringBuilder();
        System.out.println(r);
        int count = 1;

        //using the loop to count of the character //
        for(int i = 1; i <= r.length(); i++){
            if(i < r.length() && r.charAt(i) == r.charAt(i-1)){
                count++;
            }else{
                Ch.append(r.charAt(i-1));
                Ch.append(count);
                count = 1;
            }
            
            
        }
        System.out.println(Ch.toString());
    }
}