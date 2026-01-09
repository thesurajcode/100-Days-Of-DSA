package Day_3;

public class Reversing_an_array {
    public static void main(String[] args){
        int [] arr = {1,6,7,0,5,8,6};
        //creating new array//
        int [] nrr = new int[arr.length];

        for(int i = 0; i < nrr.length; i++){
            nrr[i] = arr[nrr.length-i-1];
            System.out.print(nrr[i]);
        }
        
    }
    
}
