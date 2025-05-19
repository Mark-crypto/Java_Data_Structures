import java.util.Arrays;

public class LeetCodeArrayQuestions {
    //Find the maximum count of continuous ones in a binary array
    public static void main(String[] args) {
        int []arr = {1,1,0,0,1,1,1};
        int []numbers = {2,3,4,5,6,7,8};
        System.out.println(findMaxConsecutiveOnes(arr));
        System.out.println(Arrays.toString(twoSum(numbers, 15)));
    }
    static int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int tracker = 0;
        if(nums.length == 0){
            return -1;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                counter++;
            }else{
                tracker = Math.max(tracker, counter);
                counter = 0;
            }
        }
        tracker = Math.max(tracker, counter);
        return tracker;
    }
   //Two sum problem - return the indices of two elements that add up to target
        static int[] twoSum(int[] nums, int target) {
            int ans = 0;
            int [] arr = new int[2];
            if(nums.length == 0){
                arr[0] = -1 ;
                return arr;
            }
            if(nums.length == 1 && nums[0] == target){
                arr[0] = 0 ;
                return arr;
            }

            for(int i = 0; i < nums.length; i++){
                for(int j = 1; j < nums.length; j++){
                    ans = nums[i] + nums[j];

                    if(ans == target && i != j){
                        arr[0] = i;
                        arr[1] = j;
                        return arr;
                    }
                }
            }
            return arr;
        }

}
