package Day_29;
public class Recursion {
    public static void main(String[] args){
        int n = 9;
        print(n);   
    }
    
    public static void print(int i){
        if(i == 0){
            return;
        }
        System.out.print(i+" " );
        print(i-1);
        
    }
    
}
