public class SearchInRange {
    public static void main(String[] args) {
        int []arr = {0, 1,2,45,4,5,67};
        System.out.println(searchRange(arr,1, 5, 1));
    }
    static int searchRange(int []arr , int a, int b, int target){
        if(arr.length == 0){
            return  -1;
        }
        for (int i = a; i <= b; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
