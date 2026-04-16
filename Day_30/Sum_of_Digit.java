package Day_30;

public class Sum_of_Digit {
    int store = 0;
    public int  sum_Digit(int n){
        if(n == 0){
            return store;
        }else{
            store = store + n%10;
            return sum_Digit(n/10);
        }

    }
    public static void main(String[] args){
        Sum_of_Digit a = new Sum_of_Digit();
        int result = a.sum_Digit(55445);
        System.out.println(result);

        
    }
    
}
