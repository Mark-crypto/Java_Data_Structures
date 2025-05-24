public class FloorOfNumber {
    public static void main(String[] args) {
        int[]arr = {2,4,6,7,12,14,17,18,19};
        int target = 0;
        System.out.println(floor(arr, target));
    }
    static int floor(int[]arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if(arr.length == 0){
            return -1;
        }
//        if(target < arr[start]){
//            return -1;
//        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }

        return end;
    }
}
