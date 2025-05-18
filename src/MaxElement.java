public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {30, 1000, 45, 12, 8,90, 97,102, 459};
        System.out.println(max(arr));
        System.out.println(maxValueInRange(arr, 2,8));
    }
    static int max(int[]arr){
        if(arr.length == 0){
            return -1;
        }
        int maxNo = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxNo = Math.max(maxNo, arr[i]);
        }
        return maxNo;
    }
    static int maxValueInRange(int[]arr, int a, int b){
        //edge cases
        if(a > b){
            return -1;
        }
        if(arr.length == 0){
            return -1;
        }
        int maxNo = arr[a];
        for (int i = a; i <= b; i++) {
            maxNo = Math.max(maxNo, arr[i]);
        }
        return maxNo;
    }
}
