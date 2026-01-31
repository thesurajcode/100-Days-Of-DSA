package Day_10;

public class Two_pointer_palidrome {
    public static void main(String[] args){
        String a = "madim";
        int left = 0;
        int right = a.length()-1;
        boolean isPalindrome = true;

        //Using the two pointer approach to check is it palindrome//

        while(left < right){
            if((a.charAt(left))!=(a.charAt(right))){
               isPalindrome =false;
                
            break;
            }
            left++;
            right--;
        }
        
        if(isPalindrome){
            System.out.println("Given String is Palidrome");
        }else{
            System.out.println("Given string is not palidrome");
        }
    }
    
}

