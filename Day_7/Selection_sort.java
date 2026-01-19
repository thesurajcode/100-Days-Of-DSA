package Day_7;

public class Selection_sort {
    public static void main(String[] args){
        int []arr = {2,4,7,3,5,8,4,0,-1};
        int n = arr.length;
        int temp;

        //selection sort//

        for(int i = 0; i < arr.length-1; i++ ){
            for(int j = 1; j < arr.length-1; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
                }
                temp =  arr[i];
                
            }

        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
