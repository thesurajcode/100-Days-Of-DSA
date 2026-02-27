package Day_23;

public class Min_Sub_Array{
    public static void main(String[] args){
        int []arr = {1,2,6,3,8,4,2,1,10};
        int key = 3;

        int current = 0;
        int minWindow = 0;

        for(int i = 0; i < key; i++){
            current +=  + arr[i];  
        }

        minWindow = current;

        for(int i = key; i < arr.length; i++){
            current += arr[i];
            current -= arr[i-key];
            minWindow = Math.min(current,minWindow);
        }
        System.out.print("Max value of Window :" + minWindow);

    }
}