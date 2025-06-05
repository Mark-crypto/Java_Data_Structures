public class SplitArray {
    public static void main(String[] args) {

    }
    static int split(int[]arr, int m){
        int start =0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
        }
        while (start < end){
            int mid = start + (end - start)/2;
            //Calculate how many times you can divide the array with max sum
            int sum = 0;
            int pieces = 1;
            for(int num : arr){
                if(sum + num > mid){
                    //You cannot add this in subarray create a new one
                    sum = num;
                    pieces ++ ;
                }else{
                    sum += num;
                }
            }
            if(pieces > m){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
