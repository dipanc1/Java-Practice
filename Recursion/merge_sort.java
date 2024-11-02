import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution5 {
    public int[] mergeSort(int[] arr) {
        dfs(0, arr.length - 1, arr);

        return arr;
    }

    private void dfs(int low, int high, int[] arr) {
        if (low >= high) return;

        int mid = low + (high - low) / 2;

        dfs(low, mid, arr);

        dfs(mid + 1, high, arr);

        merge(arr, low, mid, high);
    }

    private void merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;
        
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if something is left on the left side
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }


        // if something is left on the right side
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // inserting data from temp to arr
        for (int d = low; d <= high; d++) {
            arr[d] = temp.get(d - low);
        }

    }

}

public class merge_sort { // -> Divide & Merge
    public static void main(String[] args) {
        Solution5 s = new Solution5();
        System.out.println(Arrays.toString(s.mergeSort(new int[]{9, 8, 7, 6, 4, 2, 1, 4})));
    }
}
