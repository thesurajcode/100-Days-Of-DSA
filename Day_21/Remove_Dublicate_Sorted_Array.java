package Day_21;

public class Remove_Dublicate_Sorted_Array {
    public static void main(String[] args){
        int []arr  = {5,6,4,8,1,9,6,6,6,4,8,8,8,7,1,8,1,8,8,4,5};
       
        int []brr = new int[arr.length];
        boolean swap = false;

        //Bubble Sort //
        for(int i = 0; i < arr.length-1; i++){
            swap = false;
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }

            }
           
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "");
        }

        //Remove dubble//
        int k = 1;
        brr[0] = arr[0]; 
        for(int i = 0 ; i < arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                brr[k] = arr[i+1];
                k++;
            }
        }
        System.out.println("");
        System.out.println("Withouth Duplicate : ");
        for(int i = 0; i < brr.length; i++){
            if(i == k){
                break;
            }
            System.out.print(brr[i] + "");
            

        }
        System.out.println("");
        //original Array counting//
        int count = 0;
        for(int i = 0; i < brr.length; i++){
            count++;
            if(i == k-1){   
                break;
            }
        }
        System.out.println("Total count :" + count);
        
        
        
    }
    
}
