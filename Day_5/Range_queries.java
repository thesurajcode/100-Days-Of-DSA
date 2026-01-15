package Day_5;

public class Range_queries {
    public static void main(String[] args){
        //Initiazing a array//
        int []arr = {1,2,3,4,5,6,7};
        int sum = 0;
        int l = 1;
        int r = 4;
        //finding the sum in between index//
        for(int i = 0; i < arr.length; i++){
            if(i >= l && i <= r ){
                sum = sum + arr[i];
            }
        }
        System.out.print(sum);      
        
    }
    
}
