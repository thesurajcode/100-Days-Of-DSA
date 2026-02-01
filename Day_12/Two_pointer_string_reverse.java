package Day_12;
public class Two_pointer_string_reverse {
    public static void main(String[] args){
        String a = "Two Pointer approach";
        char []b = a.toCharArray();
        int N = b.length-1;

        int left = 0;
        int right = N ;

        while(left<right){
            char store = b[right];
            b[right] = b[left];
            b[left] = store;
            left++;
            right--;

        }

        for(int i = 0; i < b.length; i++){
            System.out.print(b[i]);
        }
           
    }
    
}
