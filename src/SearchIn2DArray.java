import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][]arr = {
                {1,4,56},
                {45,89,980,56},
                {2001}
        };
        int target = 2001;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] search (int[][]arr, int target){
        int[]ans = {-1,-1};
        if(arr.length == 0){
            return ans;
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    ans[0]= row;
                    ans[1]= col;
                    return ans;
                }
            }
        }

        return ans;
    }
}
