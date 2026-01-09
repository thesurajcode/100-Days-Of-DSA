package Day_1;
public class sum_0f_all_element {
    public static void main(String[] args){
        int []brr = {1,5,8,6,7,2,4};
        int store = 0;
        //sum of all element//
        for(int x = 0; x < brr.length; x++){
            store = store + brr[x];
        }
        System.out.print(store);
    }
    
}
