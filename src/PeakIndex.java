public class PeakIndex {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8,5,4,3,2,0};
        System.out.println(peakIndex(arr));
    }
    static int peakIndex(int[]arr){
        int start = 0;
        int end = arr.length - 1;

        while(end > start){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            } else{
                start = mid + 1;
            }
        }
        return start;
    }
}
