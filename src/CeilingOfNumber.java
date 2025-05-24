public class CeilingOfNumber {
    public static void main(String[] args) {
        int[]arr = {2,4,6,7,12,14,17,18,19};
        int target = 10;
        System.out.println(ceiling(arr, target));
    }
    static int ceiling(int[]arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if(arr.length == 0){
            return -1;
        }
        if(target > arr[end]){
            return -1;
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            }
            if(target < arr[mid]){
                end = mid -1;
            }
        }

        return start ;
    }
}
