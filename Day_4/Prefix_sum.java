package Day_4;
public class Prefix_sum{
    public static void main(String[] args){
        //initialing array//
        int []arr = {1,5,0,2,5,6,8};
        int n = arr.length;
        int prefix_sum = 0;

        //creating empty array with same length//
        int []nrr = new int[n];

        //loop to add the previous sum //
        for(int i = 0; i < n; i++){
            prefix_sum = prefix_sum + arr[i];
            
            nrr[i] = prefix_sum;
        }
        System.out.print( "Prefix_sum ");
        for(int i = 0; i < n; i++){
            System.out.print(  + nrr[i] + " ");
        }
        



    }
}