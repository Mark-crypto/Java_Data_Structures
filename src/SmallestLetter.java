public class SmallestLetter {
    public static void main(String[] args) {
        char[]arr = {'a','b','c','f','h'};
        char target = 'a';
        System.out.println(findSmallest(arr,target));
    }
    //Find the smallest letter larger than the target ie letters wrap around
    static char findSmallest(char []arr, char target){
        int start = 0;
        int end = arr.length - 1;

        while (end >= start) {
            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
