package Day_3;

public class Rotate_left {
    public static void main(String[] args){
        int []arr = {5,6,7,2,8,3,1};
        int n = arr.length;
        int k = 2;
        int l = k;
        int left = 0;
        // intializing new empty array for rotating //
        int []nrr = new int[n];


        
        for(int i = k; i < n; i++){
            nrr[left]=arr[i];
            left++;
        }

        //now we need to paste the remaining in the new array//
        for(int i = 0; i < l ; i++){
            if(i < l){
                nrr[left] = arr[i];
                left++;
            }   
        }

        // printing //
        for(int j = 0; j < nrr.length; j++){
            System.out.print(nrr[j]);
        }
        
    }
}
    

