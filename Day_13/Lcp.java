package Day_13;

import java.lang.String;
public class Lcp {
    public static void main(String[] args){
        String []a = {"Flower","fkhk","Fight"};


        //first String //
        String H1 = a[0];

        //Second String //
        String H2 = a[1];

        //Third String //
        String H3 = a[2];


        //finding the mininmal length to compare all the strigs //
        int min_len = Math.min(H1.length(),Math.min(H2.length(), H3.length()));

        if(H1.charAt(0) != H2.charAt(0) || H2.charAt(0) !=  H3.charAt(0) || H1.charAt(0) != H3.charAt(0)){
            System.out.println("Given String is Not LCP");
            return;
        }


        //Now using the loop to compare each string with the first H1 //

        for(int i = 0; i < min_len; i++){
            if(H1.charAt(i) == H2.charAt(i) && (H2.charAt(i) ==  H3.charAt(i))){

            }else{
                System.out.println(" Given String is LCP :  " + H1.substring(0,i));
                return;
            }

        }
    
    }
    
}
