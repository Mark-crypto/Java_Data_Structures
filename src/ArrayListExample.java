import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>(10);
        //adding
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        nums.add(60);
        System.out.println(nums);
        //updating
        nums.set(0,10);
        //search
        System.out.println(nums.contains(50));
        //remove
        nums.remove(4);
        //inputting
        for (int i = 0; i < 5; i++) {
            nums.add(input.nextInt());
        }
        System.out.println(nums);

        //multi-dimensional arraylist
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //Initialization
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                list.get(i).add(j);
            }
        }

        System.out.println(list);
    }
}
