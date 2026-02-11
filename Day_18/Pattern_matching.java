package Day_18;

public class Pattern_matching {
    public static void main(String[] args){
        String Text = "Leet";
        String Pattern = "codeLeuetLeet";

        int m = Text.length();
        int n = Pattern.length();
        boolean found = false;;


        for(int i = 0; i <= m-n; i++){
            int j;
            for(j = 0; j < n; j++){
                if(Text.charAt(i+j) !=  Pattern.charAt(j)){
                    break;
                }
            }
            if(j == n){
                found = true;
                break;

            }
        }
        if(found){
            System.out.println("Pattern is Found");
        }else{
            System.out.println("Pattern is Not found ");
        }
    }
}
