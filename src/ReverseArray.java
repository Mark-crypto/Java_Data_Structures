import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {30, 1000, 45, 12, 8,90, 97,102, 459};
        System.out.println(Arrays.toString(reverse(arr)));
    }

    static int[] reverse(int []arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            swap(arr, start, end);
            start = start + 1;
            end = end -1;
        }
        return arr;
    }

    static void swap (int[]arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
