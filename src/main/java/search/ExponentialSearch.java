package search;

/*
Time: O(log n) — best/average/worst
Space: O(1) iterative · O(log n) recursive

*/
public class ExponentialSearch {

    public static boolean search(int[] arr, int target){

        int bound = 1;
        while( bound < arr.length && arr[bound] < target) bound += 2;
        return BinarySearch.searchRecursively(arr, bound /2, Math.min(bound, arr.length), target);
    }

}
