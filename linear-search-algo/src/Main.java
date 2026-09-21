public class Main{
    static void main() {
        int[] arr = {2,3,5,6,3};
        System.out.println(search(7,arr));
    }
    static String search(int x,int[] arr){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                return "Element found at index " + i;
            }

        }
        return "Element not found in array";

    }
}