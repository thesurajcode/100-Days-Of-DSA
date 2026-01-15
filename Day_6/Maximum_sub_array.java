package Day_6;
public class Maximum_sub_array{
    public static void main(String[] args){
        // Initializing array //
        int []arr = {4,6,8,2,7,9,4};
        int n = arr.length;
        int N = n*(n+1)/2;
        int max = 0;
        System.out.print("Total number of Sub array" + N + " ");
        
        System.out.print("Max Array ");
        // Finding the Sub Array //
        for(int i =0; i < n; i++){
            int store = 0;
            for(int j = i; j < n; j++){
               store = store + arr[j];
               max = store;

            }
            System.out.print(  max + " ");
        }
    }

}