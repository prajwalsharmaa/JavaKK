import java.util.Arrays;

public class SearchIn2DArray {
    static void main() {
        int [][] arr = {
                {4,5,6,7},
                {3,4,2,5},
                {4,5,6,9}
        };
        System.out.println(Arrays.toString(search2D(arr,9)));
    }
    static int[] search2D(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(target == arr[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
