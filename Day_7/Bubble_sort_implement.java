package Day_7;

public class Bubble_sort_implement {
    public static void main(String[] args){
        int []crr = { 2,4,6,2,3,1,-1,0};
        int n = crr.length;
        //implementing the bubble sort here swapping left and right//
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(crr[j] > crr[j+1]){
                    int store = crr[j];
                    crr[j] = crr[j+1]; 
                    crr[j+1] = store;
                }
            } 

        }  
        for(int i = 0; i < n; i++){
            System.out.print(crr[i] + " ");
        }
        
    }
    
}
