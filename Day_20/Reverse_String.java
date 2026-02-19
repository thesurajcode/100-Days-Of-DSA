package Day_20;

public class Reverse_String {
    public static void main(String[] args){
        String arr = "hello";
        char ar[] = arr.toCharArray();
        char br[] = new char [ar.length];

        for(int i = 0; i < ar.length; i++){
            br[i] = ar[ar.length-1-i];
        }

        String brr =new  String (br);
        System.out.println(brr);
    }
    
}
