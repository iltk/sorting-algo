package search;

/*Ternary search

Time: O(log₃ n) — best/average/worst
Space: O(1) iterative · O(log₃ n) recursive (call stack)

it's not  faster than binary search
Although log₃ n < log₂ n in number of levels,
each level of ternary search does more comparisons.
You check two midpoints per step (up to ~2 comparisons to decide which third),
versus binary search's one midpoint (1 comparison per step).

Binary: log₂ n levels × 1 comparison = ~log₂ n comparisons
Ternary: log₃ n levels × 2 comparisons = ~2·log₃ n comparisons

Converting bases: 2·log₃ n = 2·(log₂ n / log₂ 3) ≈ 2·log₂ n / 1.585 ≈ 1.26·log₂ n.
So ternary search does roughly 26% more comparisons than binary search.

ternary search is useful finding the extremum of a unimodal function,
where you're not searching a sorted array but minimizing/maximizing.
For plain sorted-array lookup, use binary

*/

public class TernerySearch {


    public static boolean search(int[] arr, int target){

        //return searchRecursively(arr, 0, arr.length-1, target);
        return searchIteratively(arr, target);

    }

    private static boolean searchRecursively(int[] arr, int left, int right, int target){

        if (left > right) return false;

        int partitionSize = (right - left) / 3;
        int mid1 = left + partitionSize;
        int mid2 = right - partitionSize;

        if (target == arr[mid1]) return true;
        if (target == arr[mid2]) return true;

        if (target < arr[mid1])
            return searchRecursively(arr, left, mid1 - 1, target);
        else if (target > arr[mid2])
            return searchRecursively(arr, mid2 + 1, right, target);
        else
            return searchRecursively(arr, mid1 + 1, mid2 - 1, target);
    }


    private static boolean searchIteratively(int[] arr, int target){

        int left = 0;
        int right = arr.length - 1;

        while (left <= right){

            int partitionSize = (right - left) / 3;
            int mid1 = left + partitionSize;
            int mid2 = right - partitionSize;

            if (target == arr[mid1]) return true;
            else if (target == arr[mid2]) return true;
            else if (target < arr[mid1]) right = mid1 - 1;
            else if (target > arr[mid2]) left = mid2 + 1;
            else {
                left = mid1 + 1;
                right = mid2 - 1;
            }
        }
        return false;
    }

}
