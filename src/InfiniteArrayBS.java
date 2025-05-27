public class InfiniteArrayBS {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8,9,10,13,15,17,300};
        int target = 15;
        System.out.println(ans(arr,target));
    }
    static int ans (int[]arr, int target){
        int start = 0;
        int end  =1;
        while(target > arr[end]){
            int newStart = end + 1;
            end = end + (end -start + 1)* 2;
            start = newStart;
        }
        return search(arr,target,start,end);
    }
    static int search(int[]arr, int target, int start, int end){
        if(arr.length == 0){
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
}
