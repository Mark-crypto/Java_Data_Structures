import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,7,7,7,8,8,9,10};
        int target = 7;
        System.out.println(Arrays.toString(findPosition(arr,target)));
    }
    //Given an array of integers arr sorted in non-decreasing order,
    // find the starting and ending position of a given target value.
    static int[] findPosition (int []arr, int target){
        if(arr.length == 0){
            return new int[]{-1,-1};
        }
        int start = search(arr, target, true);
        int end = search(arr, target, false);
        return new int[]{start,end};
    }
    static int search(int[]arr, int target, boolean findStartIndex){
        int ans =-1;
        int start = 0;
        int end = arr.length - 1;

        while (end >= start) {
            int mid = start + (end - start)/2;
            if (target == arr[mid]) {
               ans = mid;
               if(findStartIndex){
                   end = mid -1;
               }else{
                   start = mid + 1;
               }
            }
            if (target > arr[mid]) {
                start = mid + 1;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return ans;
    }
}
