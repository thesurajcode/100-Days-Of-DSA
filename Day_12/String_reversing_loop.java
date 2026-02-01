package Day_12;

public class String_reversing_loop {
    public static void main(String[] args){
        String a = "Practising String reversing using the Loop ";
        
        char []b = a.toCharArray();
        int n = b.length-1;
       

        //Using a loop for reversing //

        for(int i = 0; i < n; i++){
            char store = b[i];
            b[i] = b[n-i];
            b[n-i] = store;
        }

        for(int i = 0; i < n; i++){
            System.out.print(b[i]);
        }
    }    
}
