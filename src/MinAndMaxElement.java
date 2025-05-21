public class MinAndMaxElement {
    public static void main(String[] args) {
        int []arr = {23,45,67,89,90,56,10,234};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }
    static int min(int[]arr){
        if(arr.length == 0){
            return -1;
        }
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans = Math.min(ans, arr[i]);
        }
        return ans;
    }
    static int max(int[]arr){
        if(arr.length == 0){
            return -1;
        }
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans = Math.max(ans,arr[i]);
        }
        return ans;
    }
}
