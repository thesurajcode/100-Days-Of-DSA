package Day_31;

public class Counting_Number {
    public int counting_Number(int n,int i){
        if(n < 10 && n > -1){
            return i;
        }else{
            i++;
            return n = counting_Number(n/10,i);

        }
    }
    public static void main(String[] args){
        Counting_Number a = new Counting_Number();
        int result = a.counting_Number(2245345,1);
        System.out.println(result);

    }
    
}
