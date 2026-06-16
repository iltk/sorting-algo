package sort;

public class QuickSort {

    public static void quickSort(int[] array) {
        int lo = 0;
        int hi = array.length -1;
        quickSort(array, lo, hi);

    }

    private static void quickSort(int[] array, int lo, int hi) {
        int pivot = hi - lo;
        partition(array, lo, pivot -1);
        partition(array, pivot + 1, hi);


    }

    private static void partition(int[] array, int lo, int hi) {
        int index = hi - lo;
        int pivot = array[index];
        int i = lo;
        int j = i+ 1;

        while( j < hi){
            if (array[j] > pivot){
                j++;
            }else{
                j++;
                i++;
                swap(i, j, array);

            }
        }


    }

    private static void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]= temp;
    }

}
