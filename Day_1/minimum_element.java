package Day_1;
public class minimum_element {
    public static void main(String[] args){
        int []arr = {12,-85,6,1,0,-4};
        int min = 0;
        //finding the minimum//
        for(int i = 0 ; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);

    }
    
}
