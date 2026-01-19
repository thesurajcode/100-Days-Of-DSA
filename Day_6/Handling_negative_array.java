package Day_6;
public class Handling_negative_array {
    public static void main(String[] args){   
        int []arr = {-6,4,-2,8,-9,5,1};
        int n = arr.length;
        int store = arr[0];
        int max_ending = arr[0];
        
      
        
        // finding the sum array //
        for(int i =1 ; i < n; i++){
            max_ending = Math.max( max_ending + arr[i], + arr[i]);
            store = Math.max(store, max_ending);
        }
        System.out.println(store);
        

    }

}
    

