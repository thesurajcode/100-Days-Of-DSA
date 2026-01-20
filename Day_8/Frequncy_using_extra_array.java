package Day_8;

public class Frequncy_using_extra_array {
    public static void main(String[] args){
        int nrr[] = {3,5,6,1,7,8,5,1,5};
        int N = nrr.length;
        int store[] = new int[9]; 
        
        
        //logic for counting the frequency //

        for(int i = 0; i < N; i++){
            store[nrr[i]]++;

        }

        for(int j = 0; j < N; j++){
            if(store[j] > 0){
                System.out.println(j + "is of hava count of :" + store[j]);

            }

        }
    }
    
}
