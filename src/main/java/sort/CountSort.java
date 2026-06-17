package sort;

/*
Time complexity: O(n + k)
where n = number of elements in arr,
and k = maxElement

Finding the max: one pass over the array → O(n)
Allocating + zeroing the count array: O(k)
Counting occurrences: one pass over the array → O(n)
Rebuilding arr: the outer while plus inner while together do exactly n value writes (one per element) and step j through all k count slots → O(n + k)

Sum: O(n) + O(k) + O(n) + O(n + k) = O(n + k) in all cases best, average, and worst are identical,
because counting sort doesn't care about input order. It does the same counting and rebuilding regardless of whether the input is sorted, reversed, or random.
One subtlety worth noting about the rebuild loop: it might look like nested loops are O(n × k), but they're not. The inner while runs a total of n times across the entire outer loop (it writes each element exactly once), and the outer loop advances j through k slots. They're additive, not multiplicative → O(n + k), not O(n·k).
Space complexity: O(k)
 allocate indexArr of size maxElement + 1, so the extra space is O(k).
 only effeicnt when the the nmbers in array are close to each other
**/

public class CountSort {

    //count-and-overwrite counting sort
    public static void sort(int[] arr) {

        int maxElement = 1;

        for (int j : arr) {
            if (j > maxElement) {
                maxElement = j;
            }
        }

        int[] indexArr = new int[maxElement + 1];

        for (int index : arr) {
            indexArr[index] += 1;
        }

        int i = 0;
        int j = 0;
        while (i < arr.length) {

            int times = indexArr[j];

            if (times == 0) {
                j++;
                continue;
            }


            while (times > 0) {
                arr[i] = j;
                i++;
                times--;
            }
            j++;

        }


    }
}





