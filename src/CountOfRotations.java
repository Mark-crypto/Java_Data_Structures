public class CountOfRotations {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,8,0,1,2,3};
        System.out.println(rotation(nums));
    }
    static int rotation(int[]arr ){
        if(arr.length < 2){
            return 0;
        }
        return findPivot(arr) + 1;
    }
    static int findPivot(int []arr){
        int start = 0;
        int end =arr.length - 1;

        while(start<= end){
            int mid = start + (end-start)/2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid -1;
            }
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid]) && arr[mid] > arr[end]) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return  -1;
    }
}
