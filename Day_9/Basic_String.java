package Day_9;

public class Basic_String {
    public static void main(String[] args){
        String a = "Suraj";
        String b = new String("Suraj");
        System.out.println("Comparing references :" + a==b);
        System.out.println("Comparing values :" + a.equals(b));
    }
    
}
