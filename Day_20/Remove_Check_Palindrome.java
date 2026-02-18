package Day_20;

public class Remove_Check_Palindrome{
    public static void main(String[] args){
        String s = "abca";
        boolean a = true;

        //here we to check wheather string is palindrome by removing one char//
        char ar[] = s.toCharArray();


        //index to remove 
        for(int i = 0; i < s.length(); i++ ){
            String str = s.substring(0,i)+s.substring(i+1);
            char []btr = str.toCharArray();
            char []ctr = new char[btr.length];

            for(int j = 0; j < btr.length; j++){
                ctr[j] = btr[ctr.length-1-j];  
            }
            String s1 = new String(ctr);


            if(str.equals(s1)){
                System.out.println(str + " Palindrome is True");
            }else{
                a = false;
                System.out.println(str + " Palindrome is False");
            }

        }
        
    }
}