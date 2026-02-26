package Day_23;

public class Max_Sub_Array {
    public static void main(String[] args){
        int []arr = {1,4,2,7,4,2,8,3,0 };
        //key for the window//
        int key = 3;
        int maxSum = 0;
        int maxWindow = 0;

        for(int i = 0; i < key; i++){
            maxSum += arr[i];
        }
        maxWindow = maxSum;

        for(int i = key; i < arr.length; i++){
            maxSum += arr[i];
            maxSum -= arr[i-key]; 
            maxWindow = Math.max(maxSum,maxWindow);
        }
        
        System.out.println("MaxSum :" + maxWindow);
    }
    
}
