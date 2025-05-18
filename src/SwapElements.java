import java.util.Arrays;
import java.util.Scanner;

public class SwapElements {
    public static void main(String[] args) {
        int [] arr = {1,2, 3, 4, 5};
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(Arrays.toString(arr));
        swap(arr, a, b);
        System.out.println(Arrays.toString(arr));
    }
    static void swap (int[]arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
