package Day_5;

public class Prefix_sum_creation {
    public static void main(String[] args){
        int []prr  = {1,2,7,6,4,2,3,8};
        int n = prr.length;
        int []prefix_sum = new int [n]; 
        //Adding the value of the prefix sum//
        for(int i = 1; i < n; i++){
            prefix_sum[i] = prefix_sum[i-1] + prr[i-1];
            System.out.print(prefix_sum[0] + prefix_sum[i] + " ");
        
        }
        
        //but here size is different for both array//
    }
    
}
