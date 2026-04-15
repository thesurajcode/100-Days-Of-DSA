package Day_30;

public class Fibonacii {
    public int fibonacci(int n){
        if(n == 0 || n == 1){
            return 1;
        }else{
            return n = n + fibonacci(n-1);
        }
    }
    public static void main(String[] args){
        Fibonacii a = new Fibonacii();
        int result = a.fibonacci(5);
        System.out.println("Fibonacci Value : " + result);        
    }
    
}
