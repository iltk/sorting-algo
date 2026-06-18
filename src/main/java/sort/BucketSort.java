package sort;
import java.util.ArrayList;
import java.util.List;


/*   Time: O(n) avg / O(n²) worst · Space: O(n + b) ·
b = bucket count
Stable (depends which algo is used to sort smaller buckets)
Distributes by range into b buckets, sorts each, concatenates;
 worst case when data clusters into one bucket*/
public class BucketSort {


    public static void sort(int[] arr, int  bucketSize){

        List<List<Integer>> buckets = new ArrayList<>();

        for (int i = 0; i < bucketSize; i++) {
            buckets.add(new ArrayList<>());
        }

        if (arr.length == 0) return;

        int min = arr[0] ;
        int max = arr[0];

        for(int item: arr) {
            if (item < min) min = item;
            if (item > max) max = item;
        }

        for(int item: arr) {
            int itemI = (int) ((double)(item - min) / (max - min + 1) * bucketSize);
            buckets.get(itemI).add(item);
        }

        int i =0;
        for(var bucket: buckets) {
            bucket.sort(null);

            for (var item : bucket) {
                arr[i] = item;
                i++;
            }
        }




    }

}
