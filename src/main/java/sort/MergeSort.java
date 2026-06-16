package sort;

/*
Merge sort

Best: O(n log n) · Average: O(n log n) · Worst: O(n log n)
Space: O(n) · Stable: yes
*/

public class MergeSort {
    public static void mergeSort(int[] array) {

        if (array.length < 2) return;

        int middle = array.length / 2;

        int[] leftSubArray = new int[middle];
        System.arraycopy(array, 0, leftSubArray, 0, middle );

        int[] rightSubArray = new int[array.length - middle];
        System.arraycopy(array, middle, rightSubArray, 0, array.length - middle);

        mergeSort(leftSubArray);
        mergeSort(rightSubArray);
        merge(leftSubArray, rightSubArray, array);


    }

    public static void merge(int[] leftSubArray, int[] rightSubArray, int[] array) {
        int i = 0;
        int j =0;
        int k =0;

        while (i < leftSubArray.length && j < rightSubArray.length ){
            if( leftSubArray[i] <= rightSubArray[j]) {
                array[k] = leftSubArray[i];
                i++;
            }
            else {
                array[k] = rightSubArray[j];
                j++;
            }
            k++;

        }

        while(i < leftSubArray.length) {
            array[k]= leftSubArray[i];
            i++;
            k++;

        }
        while(j < rightSubArray.length) {
            array[k]= rightSubArray[j];
            j++;
            k++;
        }

    }



}
