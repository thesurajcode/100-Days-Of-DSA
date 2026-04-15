package Day_30;

public class Power {
    public int power(int n, int m){
        if(n == 1 || m == 0){
            return n = 1;
        }else{
            return n = n * power(n,m-1);
        }
    }
    public static void main(String[] args){
        Power a = new Power();
        int result = a.power(3,3);
        System.out.println("Power value " + result);
    }
    
}
