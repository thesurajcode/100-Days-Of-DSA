package Day_18;
public class Startingindex {
    public static void main(String[] args){
        String Text = "thesurajcode";
        String Pattern = "code";
        int n = Text.length();
        int m = Pattern.length();
        Boolean found = false;
        int N = 0;
        for(int i = 0; i <= n-m; i++){
            int j;
            for(j = 0; j < m; j++){
                if( Text.charAt(i+j) != Pattern.charAt(j)){
                    N = i+j+1;
                    break;
                }
            }
            if(j == m){
                found = true;
            }
        }
        System.out.println("Pattern Matching found at : " + N );
        if(found){
            System.out.println("Pattern Found");
        }else{
            System.out.println("Pattern not found");
        }    
    }  
}
