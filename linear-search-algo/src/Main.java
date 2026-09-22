

public class Main{
    static void main(){
        int[] arr = {2,3,5,6,3};
        System.out.println("Element found at index: "+search(6,arr));



    }
    static int search(int target,int[] arr){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element== target){
                return i;
            }
        }
        return -1;
    }
}