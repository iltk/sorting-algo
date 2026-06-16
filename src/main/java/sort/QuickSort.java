package sort;

public class QuickSort {

    public static void quickSort(int[] array) {
        int lo = -1;
        int hi = array.length -1;
        quickSort(array, lo, hi);

    }

    private static void quickSort(int[] array, int lo, int hi) {
        if(lo >= hi) return;
        int pivot = partition(array, lo, hi);
        quickSort(array, lo, pivot - 1);
        quickSort(array, pivot, hi);



    }

    private static int partition(int[] array, int lo, int hi) {
        int j = lo + 1;

        while( j <= hi){
            if (array[hi] >= array[j]){
               lo ++;
               swap(lo, j, array);
            }
            j++;
        }
        return lo;


    }

    private static void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]= temp;
    }

}

//Lomuto partition
//public class QuickSort {
//
//    public static void quickSort(int[] array) {
//        quickSort(array, 0, array.length - 1);
//    }
//
//    private static void quickSort(int[] array, int lo, int hi) {
//        if (lo >= hi) return;              // base case: size 0 or 1
//        int p = partition(array, lo, hi);
//        quickSort(array, lo, p - 1);       // left of pivot
//        quickSort(array, p + 1, hi);       // right of pivot (pivot excluded)
//    }
//
//    private static int partition(int[] array, int lo, int hi) {
//        int pivot = array[hi];             // pivot value = last element
//        int i = lo - 1;                    // boundary of the "smaller" region
//        for (int j = lo; j < hi; j++) {    // scan, pivot itself excluded
//            if (array[j] <= pivot) {
//                i++;
//                swap(i, j, array);
//            }
//        }
//        swap(i + 1, hi, array);            // place pivot just after the small region
//        return i + 1;                      // pivot's final index
//    }
//
//    private static void swap(int a, int b, int[] arr) {
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }
//}
