package Day_31;

public class Reversing_String {
    public int reverse(int n,int i){
        if(n == 0){
            return i;
        }else{
            
            return reverse(n/10,i * 10 + n%10);

        }
    }
    public static void main(String[] args){
        Reversing_String a = new Reversing_String();
        int result = a.reverse(56464,0);
        System.out.println(result);
    }
    
}
