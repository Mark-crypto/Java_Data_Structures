public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,20,45,87,14,23,45};
        String str = "Mark";
        char target = 'a';
        System.out.println(search(arr,14));
        System.out.println(searchString(str,target));
    }
    static int search(int[]arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    static boolean searchString(String str, char target ){
        if(str.isEmpty()){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
