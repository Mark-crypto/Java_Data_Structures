import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
        // Inputting into an array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        //Printing array values
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        //enhanced for each loop
        for(int num:nums){
            System.out.print(num + " ");
        }
        //Outputting directly
        System.out.println(Arrays.toString(nums));
        //array of objects
        String[] names = new String[3];
        names[0] = "Junior";
        names[1] = "Faith";
        names[2] = "Ryan";

        System.out.println(Arrays.toString(names));
        //Multi-dimensional arrays (2D)
        int [][] numbers = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(Arrays.toString(numbers[0]));
        //inputting using a loop
        int [][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //Outputting using a loop
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
        //for each loop
        for(int[] row:arr){
            for(int col: row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
