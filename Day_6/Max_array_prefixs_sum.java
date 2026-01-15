package Day_6;

public class Max_array_prefixs_sum {
    public static void main(String[] args){
        int []prr = {4,6,8,2,7,9,4};
        int n = prr.length;
        int []prefix_sum = new int[n];
        prefix_sum [0] = prr[0]; 
        int max = 0;
        //finding the sum using the Max_array//
        for(int i = 1; i < prr.length; i++){
            prefix_sum[i] = prefix_sum[i-1] + prr[i] ;

            // Applying if else to check which is max sub array //

            if(prefix_sum[i-1] < prefix_sum[i]){
                System.out.print(prr[i-1] + " ");
                max = prefix_sum[i];
            }else{
                max = prefix_sum[i-1];
            }
        } 
        
        System.out.print("Max Value " + max);
    }
    
}
