package Day_3;

public class Reversing_using_left_right {
    public static void main(String[] args){
        int []arr = {5,6,7,2,1,8,3};
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int store = 0;
        //using the while loop to rotate the array without using extra space//
        while(left < right){
            store = arr[left];
            arr[left] = arr[right];
            arr[right] = store;
            left++;
            right--;
        }
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i]);

        }
        
    }
}
