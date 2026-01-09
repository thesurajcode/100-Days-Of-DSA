package Day_2;

public class Seoncd_Largest_Number {
    public static void main(String[] args){
        int []crr = {4,5,6,7,2,0,-55,7,-1,0};
        int n = crr.length;
        int Max = 0;
        int Second_Max = 0;
        int []arr = new int[n-1];
        int left = 0;
        //finding the max // 
        for(int i = 0;  i < n; i++){
            if(crr[i] > Max){
                Max = crr[i];
            }else if(n < 2){
                System.out.println("No second Largest Available");
            }

        }
        for(int i = 0; i < n; i++){
            if(crr[i] < Max){
                arr[left] = crr[i];
                left++;

            }
        }
        for(int i = 0;  i < n-1; i++){
            if(arr[i] > Second_Max){
                Second_Max = arr[i];

            }
        }
        System.out.println("Max " + Max + " " + "Second_Max " + Second_Max);
    }
    
}
