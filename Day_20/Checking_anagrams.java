package Day_20;

import java.util.Scanner;
public class Checking_anagrams {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String a1 = input.nextLine();
        char arr[] = a1.toCharArray();
        int N1 = arr.length;
        String a2 = input.nextLine();
        char brr[] = a2.toCharArray();
        int N2 = brr.length;
        if(N1 != N2){
            System.out.print("Not Anagram");
            return;
        
        }
        int count = 0;
        for(int i = 0; i < N1; i++) {
            for(int j = 0; j < N2; j++) {
                if(arr[i] == brr[j]) {
                    count++;
                    brr[j] = '\0'; // Mark as used so it's not counted twice
                    break;         // Stop looking for this specific letter
                }
            }
        }

        if(count == N1){
            System.out.println("It is a Anagram Number");
        }else{
            System.out.println("It is not a Anagram Number");
        }

    }  
}
