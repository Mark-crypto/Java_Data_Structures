public class BSRecursion {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8,9,10,13,15,17,300};
        int target = 8;
        System.out.println(BS(arr,target,0,arr.length-1));
    }
    static int BS(int[]arr,int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end -start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] > target){
           return BS(arr,target,start,mid-1);
        }
return BS(arr,target,mid +1, end);
    }
}

