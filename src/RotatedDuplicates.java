public class RotatedDuplicates {
    public static void main(String[] args) {
        int[] nums = {7,2,2,3,4};
        System.out.println(rotatedSearch(nums,3));

    }
    static int rotatedSearch(int[]arr, int target){
        int pivot = findPivot(arr);
        if(pivot == -1){
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        if (arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){
            return binarySearch(arr, target, 0, pivot - 1);
        }
        return binarySearch(arr, target, pivot + 1, arr.length -1);

    }
    static int binarySearch(int[]arr, int target, int start, int end){
        if(arr.length == 0) {
            return -1;
        }

        while (end >= start) {
            int mid = start + (end - start)/2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return -1;
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
