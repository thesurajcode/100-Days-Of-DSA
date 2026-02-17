package Day_19;

public class Handling {
    public static void main(String[] args){
        try{
            System.out.println("thesurajcode");
            int a = 1000;int b = 0; int c;
            c = a/b;
        }catch(ArithmeticException b){
            System.out.println("value of b should not be Null");

        }finally{
            System.out.println("Hit the subscribe Button");
        }
        System.out.println("Welcome to channel");
    }
    
}
