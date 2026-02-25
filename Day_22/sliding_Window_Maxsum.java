package Day_22;

public class sliding_Window_Maxsum {
    public static void main(String[] args){
        int arr[] = {2,4,5,3,2,2,44,2,1,};
        int key = 4;
        int windowsum = 0;

        for(int i = 0; i < key; i++){
            windowsum = windowsum + arr[i];
        }

        int maxsum = windowsum;

        for(int i = key; i < arr.length; i++){

            windowsum += arr[i];
            windowsum -= arr[i-key]; 
            maxsum = Math.max(maxsum,windowsum);

        }


        System.out.println("Maxsum : " + maxsum);

    }
    
}
