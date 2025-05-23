import com.sun.security.jgss.GSSUtil;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8,9};
        int[]nums = {9,8,7,6,5,4,3,2,1};
        int target = 2;
        System.out.println(search(arr,target));
        System.out.println(search(nums,target));
        System.out.println(simplerSearch(nums,target));

    }
    //option one
    static int simplerSearch(int[]arr , int target){
        int start = 0;
        int end = arr.length -1;
        boolean isAsc = arr[start] < arr[end];
        while(end >= start){
            int mid = start + (end - start)/2;
            if (target == arr[mid]) {
                return mid;
            }
            if(isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }else{
                if (target < arr[mid]) {
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }
        return  -1;

    }
    //option two
    static int search(int[]arr, int target){
        int start = 0;
        int end = arr.length -1;
        if(order(arr).equals("ascending")){
            return ascBinarySearch(arr, target, start,end);
        }else if (order(arr).equals("descending")) {
            return descBinarySearch(arr,target, start, end);
        }else{
            return -1;
        }
    }
    static int ascBinarySearch(int[]arr, int target, int start, int end){
        while(end >= start){
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
        return  -1;
    }
    static int descBinarySearch(int[]arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target > arr[mid]) {
                end = mid - 1;
            }
            if (target < arr[mid]) {
                start = mid + 1;
            }
        }
        return  -1;
    }
    static String order (int[]arr){
        int start = 0;
        int end = arr.length - 1;
        if(arr[end] >= arr[start]){
            return "ascending";
        }else{
            return "descending";
        }
    }
}
