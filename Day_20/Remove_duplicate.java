package Day_20;

public class Remove_duplicate {
    public static void main(String[] args){
        int arr[] = {1,2,2,3,4,9};
        int brr[] = new int[arr.length];

        int j = 0;
        for(int i = 0; i <arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                brr[j] = arr[i];
                j++;
            }
        }
        //adding the last index//
        brr[j] = arr[arr.length-1];
        j++;
        
        for(int i = 0; i < j; i++){
            System.out.println(brr[i]);
        }    
    }
    
}
