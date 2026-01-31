package Day_10;

public class Palindrome_check{
    public static void main(String[] args){
        String a = "madam";
        String b = "";

        //logic to check the palindrome//

        for(int i = a.length()-1; i >= 0; i--){
            b = b + a.charAt(i);  
        }

        System.out.println(a+ " " + b);

        if(a.equals(b)){
            System.out.println("Given String is Palindrome");
        }else{
            System.out.println("Given String is not palindrome");
        }

        
    }
}
