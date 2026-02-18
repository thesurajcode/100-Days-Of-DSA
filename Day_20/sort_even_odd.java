package Day_20;

public class sort_even_odd {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        int brr[] = new int[arr.length];

        int pointer = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                brr[pointer] = arr[i];
                pointer++;
                
            } 
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                brr[pointer] = arr[i];
                pointer++;
                
            } 
        }

     
        for(int i = 0; i < brr.length; i++){
            System.out.print(brr[i] + " ");
        }
    }    
}
