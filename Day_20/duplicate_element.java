package Day_20;

public class duplicate_element {
    public static void main(String[] args){
        int []arr = {1,2,2,4,4,7,8,0};
        for(int i = 0; i < arr.length-1; i++){
            int left = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    left++;
                    
                }
            }
            System.out.println("Duplicate value of Element " + arr[i] + " is : "+ left);
           
        }

    }
    
}
