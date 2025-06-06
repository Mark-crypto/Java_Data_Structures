import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
    int[][]arr = {
            {10,20,30},
            {40,50,60,70},
            {80,90,100}
    };
    int target = 60;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][]arr, int target){
        int row = 0;
        int col = arr.length - 1;
        while(row < arr.length && col >= 0){
            if(arr[row][col] == target){
               return new int[]{row,col};
            }
            if(arr[row][col] < target){
                row++;
            }else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
