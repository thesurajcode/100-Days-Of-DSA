public class Recursion2 {
    public static void main(String [] args){
        int n = 1;
        print(n);
    }
    public static void print( int i){
        if(i == 9 ){
            return;
        }
        
        System.out.println(i);
        print(i+1);

    }
    
}
