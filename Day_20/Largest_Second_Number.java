package Day_20;

public class Largest_Second_Number {
    public static void main(String[] args){
        char []ab = { 10,5,8,20 };
        int max = 0;
        int second_max = 0;
        int left = 0;
        int right = ab.length;
        int store = 0;

        for(int i = 0; i < ab.length-1; i++){
            for(int j = 1; j < ab.length; j++){
                if(ab[i] > ab[j]){
                    second_max = max; 
                    max = ab[i];
                }else if(ab[i]> max && ab[i] != max){
                    store = second_max;
                }
            }    
        }
        System.out.println(second_max);


    }
    
}
