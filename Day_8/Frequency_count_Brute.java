package Day_8;
public class Frequency_count_Brute {
    public static void main(String[] args){
        int []frr = {3,1,4,6,3,7,3,2,1,0};
        int n = frr.length;
        
        // frequency count //
        for(int i = 0; i < n-1; i++ ){
            int count = 0;
            for(int j = 0; j < n-1; j++){
                if(frr[i]== frr[j]){
                    count++;
                }
            }
            System.out.println("frequency of " + frr[i] + " is " + count);
        }
    }
    
}
