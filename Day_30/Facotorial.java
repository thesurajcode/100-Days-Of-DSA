package Day_30;

public class Facotorial {
    public int factorial (int n){
            if(n == 0|| n == 1){
                return n = 1;
            }
            else{
                return n = n * factorial(n-1);
            }            
        }
    public static void main(String[] args){
        Facotorial a = new Facotorial();
        int result = a.factorial(0);  
        System.out.println("Factorial of value is " + result);   
    }    
}
