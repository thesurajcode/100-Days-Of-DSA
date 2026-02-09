package Day_16;

public class String_compresion {
    public static void main(String[] args){
        String H1 = "StringCompression";
        String H2 = H1.toLowerCase();
        char []H3 = H2.toCharArray();


        //logic to count the count the repetitive string //
        for(int i = 0; i < H3.length; i++){            
            for(int j = 0; j < H3.length; j++ ){
                if(H3[i]==H3[j]){
                    int p = 1;
                    p++;
                    System.out.println(H3[i] + " is " + p );
                }else{
                    int q = 0;
                    q++;
                    System.out.println(H3[i] + " is " + q );
                }
                

            }
        }
    }
    
}
