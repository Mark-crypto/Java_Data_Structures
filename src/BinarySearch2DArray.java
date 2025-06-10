import java.util.Arrays;

public class BinarySearch2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        int target = 60;
        System.out.println(Arrays.toString(binary(arr, target)));
    }

    static int[] BS(int[][] arr, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;
            if (arr[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (arr[row][mid] < target) {
                colStart = mid + 1;
            } else {
                colEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] binary(int[][] arr, int target) {
        int rows = arr.length;
        int col = arr[0].length;  // Only valid for uniform arrays
        int rStart = 0;
        int rEnd = rows - 1;
        int midCol = col / 2;

        if (rows == 1) {
            return BS(arr, 0, 0, col - 1, target);
        }

        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (arr[mid][midCol] == target) {
                return new int[]{mid, midCol};
            }
            if (arr[mid][midCol] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // Now we have 2 rows remaining
        if (arr[rStart][midCol] == target) return new int[]{rStart, midCol};
        if (arr[rStart + 1][midCol] == target) return new int[]{rStart + 1, midCol};

        if (target <= arr[rStart][midCol - 1]) {
            return BS(arr, rStart, 0, midCol - 1, target);
        }
        if (target >= arr[rStart][midCol + 1] && target <= arr[rStart][col - 1]) {
            return BS(arr, rStart, midCol + 1, col - 1, target);
        }
        if (target <= arr[rStart + 1][midCol - 1]) {
            return BS(arr, rStart + 1, 0, midCol - 1, target);
        } else {
            return BS(arr, rStart + 1, midCol + 1, col - 1, target);
        }
    }
}
